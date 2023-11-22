package furama_resort.utils.read_and_write;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadEmployeeAndCustomer <E>{
    public List<String> readFile(String path){
        File file = new File(path);
        FileReader fileReader;
        BufferedReader bufferedReader;
        List<String> list = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null){
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
