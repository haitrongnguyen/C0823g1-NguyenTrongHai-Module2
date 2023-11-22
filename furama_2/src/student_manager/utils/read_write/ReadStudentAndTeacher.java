package student_manager.utils.read_write;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadStudentAndTeacher {
    public static List<String> read(String path){
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> strings = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] lineString;
            while ((line = bufferedReader.readLine())!=null){
                strings.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {

                assert bufferedReader != null;
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());;
            }
        }
        return strings;
    }
}
