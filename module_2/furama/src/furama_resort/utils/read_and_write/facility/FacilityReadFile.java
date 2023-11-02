package furama_resort.utils.read_and_write.facility;

import furama_resort.models.facility.Facility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class FacilityReadFile {
    public static List<Facility> readFacility(String path){
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
//            String
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
