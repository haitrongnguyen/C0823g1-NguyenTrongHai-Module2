package ss16_io_text_file.bai_tap.copy_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static List<String> readFile(String path){
        List<String> stringList = new ArrayList<>();

        try {
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!= null){
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }
}
