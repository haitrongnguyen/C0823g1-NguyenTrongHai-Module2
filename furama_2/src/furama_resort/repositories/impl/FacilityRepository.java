package furama_resort.repositories.impl;

import furama_resort.models.facility.Facility;
import furama_resort.models.facility.House;
import furama_resort.models.facility.Room;
import furama_resort.models.facility.Villa;
import furama_resort.repositories.IFacilityRepository;
import furama_resort.utils.read_and_write.facility.FacilityReadFile;
import furama_resort.utils.read_and_write.facility.FacilityWriteToFile;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    private static final String FACILITY_LIST = "src/furama_resort/data/facility.csv";
    private static Map<Facility,Integer> facilityMap;
    private static int count;

//    public static void setFacilityMap(Map<Facility, Integer> facilityMap) {
//        FacilityRepository.facilityMap = facilityMap;
//    }

    @Override
    public List<Facility> getAll() {
        return FacilityReadFile.readFacility(FACILITY_LIST);
    }

    @Override
    public boolean checkExist(String code) {
        List<Facility> facilityList = FacilityReadFile.readFacility(FACILITY_LIST);
//        Set<Facility> facilitySet = facilityMap.keySet();
//        for (Facility facility1:facilitySet){
//            if (facility1.getServiceCode().equals(code)){
//                return true;
//            }
//        }
        for (Facility facility: facilityList){
            if (facility.getServiceCode().equals(code)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addNewRoom(Room room1) {
        List<Facility> facilityList = FacilityReadFile.readFacility(FACILITY_LIST);
//        facilityMap.put(room1,count);
        facilityList.add(room1);
        FacilityWriteToFile.writeToFile(FACILITY_LIST,facilityList);
    }

    @Override
    public void addNewHouse(House house1) {
        List<Facility> facilityList = FacilityReadFile.readFacility(FACILITY_LIST);
        facilityList.add(house1);
//        facilityMap.put(house1,count);
        FacilityWriteToFile.writeToFile(FACILITY_LIST,facilityList);
    }

    @Override
    public void addNewVilla(Villa villa1) {
        List<Facility> facilityList = FacilityReadFile.readFacility(FACILITY_LIST);
        facilityList.add(villa1);
//        facilityMap.put(villa1,count);
        FacilityWriteToFile.writeToFile(FACILITY_LIST,facilityList);
    }

    @Override
    public void removeFacility(String code) {
        List<Facility> facilityList = FacilityReadFile.readFacility(FACILITY_LIST);
//        Set<Facility> facilitySet = facilityMap.keySet();
//        for (Facility facility1: facilitySet){
//            if (facility1.getServiceCode().equals(code)){
//                facilitySet.remove(facility1);
//                break;
//            }
//        }
        for (Facility facility: facilityList){
            if (facility.getServiceCode().equals(code)){
                facilityList.remove(facility);
                break;
            }
        }
        FacilityWriteToFile.writeToFile(FACILITY_LIST,facilityList);
    }

//    @Override
//    public Set<Facility> getAllMap() {
//        return facilityMap.keySet();
//    }
}
