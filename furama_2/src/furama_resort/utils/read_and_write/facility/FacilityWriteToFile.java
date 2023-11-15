package furama_resort.utils.read_and_write.facility;

import furama_resort.models.facility.Facility;
import furama_resort.models.facility.House;
import furama_resort.models.facility.Room;
import furama_resort.models.facility.Villa;

import java.io.*;
import java.util.List;

public class FacilityWriteToFile {
    public static void writeToFile(String path, List<Facility> facilityList) {
        String coma = ",";
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(path);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Facility facility : facilityList) {
                if (facility instanceof Villa){
                    bufferedWriter.write(facility.getServiceCode()+coma+facility.getServiceName()+coma+facility.getUsableArea()+coma+
                            facility.getRentalCosts()+coma+facility.getMaximumPeople()+coma+facility.getRentalType()+coma+
                            ((Villa) facility).getRoomStandards()+coma+((Villa) facility).getPoolArea()+coma+((Villa) facility).getNumberOfFloor());
                }
                if (facility instanceof House){
                    bufferedWriter.write(facility.getServiceCode()+coma+facility.getServiceName()+coma+facility.getUsableArea()+
                            coma+facility.getRentalCosts()+coma+facility.getMaximumPeople()+coma+facility.getRentalType()+
                            coma
                            +((House) facility).getRoomStandards()+coma+((House) facility).getNumberOfFloor());
                }
                if (facility instanceof Room) {
                    bufferedWriter.write(facility.getServiceCode() + coma + facility.getServiceName() + coma +
                            facility.getUsableArea() + coma + facility.getRentalCosts() + coma + facility.getMaximumPeople() + coma +
                            facility.getRentalType() + coma + ((Room) facility).getFreeService());
                }

                bufferedWriter.newLine();
            }

            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }finally {
            try {
                assert bufferedWriter != null;
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());;
            }

        }
    }
}
