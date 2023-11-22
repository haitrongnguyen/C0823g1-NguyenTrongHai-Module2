package chuyen_bay.utils.read_and_write;

import chuyen_bay.models.services.Fly;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FlyReader {
    public static List<Fly> readFile(){
        File file = new File("src/chuyen_bay/data/fly.csv");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Fly> flies = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[]lineString;
            Fly fly;
            while ((line = bufferedReader.readLine())!=null){
                lineString = line.split(",");
                fly = new Fly(Integer.parseInt(lineString[0]),
                        lineString[1],
                        lineString[2],
                        lineString[3],
                        lineString[4]);
                flies.add(fly);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());;
            }

        }
        return flies;
    }
}
