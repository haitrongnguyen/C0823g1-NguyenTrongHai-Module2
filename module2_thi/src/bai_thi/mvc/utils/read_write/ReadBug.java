package bai_thi.mvc.utils.read_write;

import bai_thi.mvc.models.Bug;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadBug {
    public static List<Bug> readBug(){
        File file = new File("src/bai_thi/mvc/data/bugs.csv");
        List<Bug> bugList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] lineString;
            while ((line = bufferedReader.readLine())!=null){
                lineString = line.split(",");
                bugList.add(new Bug(lineString[0],
                        lineString[1],
                        lineString[2],
                        lineString[3],
                        lineString[4]));
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }finally {
            try {
                assert bufferedReader != null;
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
        return bugList;
    }
}
