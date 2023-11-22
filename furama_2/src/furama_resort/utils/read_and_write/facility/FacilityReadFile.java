package furama_resort.utils.read_and_write.facility;

import furama_resort.models.facility.Facility;
import furama_resort.models.facility.House;
import furama_resort.models.facility.Room;
import furama_resort.models.facility.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityReadFile {
    public static Map<Facility,Integer> readFacility(String path){
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        Map<Facility,Integer> facilityList = new LinkedHashMap<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line ;
            String[] lineString;
            Facility facility;
            while ((line = bufferedReader.readLine())!=null) {
                lineString = line.split(",");
                if (lineString.length == 10) {
                    facility = new Villa(lineString[0], lineString[1], Double.parseDouble(lineString[2]),
                            Long.parseLong(lineString[3]),
                            Integer.parseInt(lineString[4]),
                            lineString[5], lineString[6], Double.parseDouble(lineString[7]), Integer.parseInt(lineString[8]));
                    facilityList.put(facility, Integer.valueOf(lineString[9]));
                } else if (lineString.length == 9) {
                    facility = new House(lineString[0], lineString[1], Double.parseDouble(lineString[2]),
                            Long.parseLong(lineString[3]),
                            Integer.parseInt(lineString[4]),
                            lineString[5], lineString[6], Integer.parseInt(lineString[7]));
                    facilityList.put(facility, Integer.valueOf(lineString[8]));
                } else if (lineString.length == 8) {
                    facility = new Room(lineString[0], lineString[1], Double.parseDouble(lineString[2]),
                            Long.parseLong(lineString[3]),
                            Integer.parseInt(lineString[4]), lineString[5], lineString[6]);
                    facilityList.put(facility, Integer.valueOf(lineString[7]));
                }
            }
        }catch (ArrayIndexOutOfBoundsException ignored){
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                assert fileReader != null;
                fileReader.close();
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());;
            }

        }
        return facilityList;
    }
}
