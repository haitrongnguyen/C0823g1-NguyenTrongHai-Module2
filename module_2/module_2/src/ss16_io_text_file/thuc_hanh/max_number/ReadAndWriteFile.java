package ss16_io_text_file.thuc_hanh.max_number;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String path){
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine())!=null){
                list.add(Integer.parseInt(line));
            }
            bufferedReader.close();

        }catch (Exception e){
            System.err.println("File k tồn tại or lỗi");
        }
        return list;

    }
    public void writeFile(String path,int max){
        try {
            FileWriter fileWriter=new FileWriter(path,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write("Giá trị lớn nhất: "+max);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
