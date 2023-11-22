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
    private static final String FACILITY_LIST = "src/furama_resort/data/facility_2.csv";
    private static Map<Facility, Integer> facilityMap = FacilityReadFile.readFacility(FACILITY_LIST);

    public static void setValue(String serviceCode) {
        Map<Facility,Integer> map = FacilityReadFile.readFacility(FACILITY_LIST);
        for (Map.Entry<Facility,Integer> entry: map.entrySet()){
            if (entry.getKey().getServiceCode().equals(serviceCode)){
                map.put(entry.getKey(), map.getOrDefault(entry.getKey(),0)+1);
            }
        }
        FacilityWriteToFile.writeToFile(FACILITY_LIST,map);
    }

    @Override
    public Map<Facility, Integer> getAll() {
        return FacilityReadFile.readFacility(FACILITY_LIST);
    }

    @Override
    public boolean checkExist(String code) {
        Set<Facility> facilitySet = facilityMap.keySet();
        for (Facility facility1 : facilitySet) {
            if (facility1.getServiceCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addNewRoom(Room room1) {
        facilityMap.put(room1, facilityMap.getOrDefault(room1,-1)+1);
        FacilityWriteToFile.writeToFile(FACILITY_LIST, facilityMap);
    }

    @Override
    public void addNewHouse(House house1) {
        facilityMap.put(house1, facilityMap.getOrDefault(house1,-1)+1);
        FacilityWriteToFile.writeToFile(FACILITY_LIST, facilityMap);
    }

    @Override
    public void addNewVilla(Villa villa1) {
        facilityMap.put(villa1, facilityMap.getOrDefault(villa1,-1)+1);
        FacilityWriteToFile.writeToFile(FACILITY_LIST, facilityMap);
    }

    @Override
    public void removeFacility(String code) {
        Set<Facility> facilitySet = facilityMap.keySet();
        for (Facility facility1 : facilitySet) {
            if (facility1.getServiceCode().equals(code)) {
                facilitySet.remove(facility1);
                break;
            }
        }
        FacilityWriteToFile.writeToFile(FACILITY_LIST, facilityMap);
    }

    @Override
    public List<Facility> getMaintenance() {
        List<Facility> facilityList = new ArrayList<>();
        for (Map.Entry<Facility,Integer> entry: facilityMap.entrySet()){
            if (entry.getValue() == 5){
                facilityList.add(entry.getKey());
            }
        }
        return facilityList;
    }
}
