package ss16_io_text_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderAndWriter {
    private static List<String> readFile(String path){
        List<String> list = new ArrayList<>();
        try {
            File file = new File(path);
//            System.out.println(file.getAbsoluteFile());
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine())!= null){
               list.add(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.err.println("File k tồn tại");;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    private static void write(String path,List<String> list){
        try  {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s:list) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        List<String> t = readFile("result.txt");
        write("result1.txt",t);
    }
}
