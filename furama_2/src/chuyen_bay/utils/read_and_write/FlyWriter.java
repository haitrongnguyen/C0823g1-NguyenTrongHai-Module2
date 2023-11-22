package chuyen_bay.utils.read_and_write;

import chuyen_bay.models.services.Fly;

import java.io.*;
import java.util.List;

public class FlyWriter {
    private static final String COMA = ",";
    public static void writeToFile(List<Fly> flies){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File("src/chuyen_bay/data/fly.csv");
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Fly fly:flies){
                bufferedWriter.write(fly.getFlyCode()+COMA+
                        fly.getDayFly()+COMA+
                        fly.getHourFly()+COMA+
                        fly.getPlaceTo()+COMA+
                        fly.getPlaceFrom());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (FileNotFoundException e){
            System.err.println("File không tồn tại");
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }finally {
            try {
                assert bufferedWriter != null;
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
