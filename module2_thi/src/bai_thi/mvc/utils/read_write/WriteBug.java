package bai_thi.mvc.utils.read_write;

import bai_thi.mvc.models.Bug;

import java.io.*;
import java.util.List;

public class WriteBug {
    public static void writeToFile(List<Bug> bugList){
        File file = new File("src/bai_thi/mvc/data/bugs.csv");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Bug bug: bugList){
                bufferedWriter.write(bug.getBugId()+","+
                        bug.getBugName()+","+
                        bug.getBugDetail()+","+
                        bug.getBugTiming()+","+
                        bug.getBugLevel());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }finally {
            try {
                assert bufferedWriter != null;
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

    }
}
