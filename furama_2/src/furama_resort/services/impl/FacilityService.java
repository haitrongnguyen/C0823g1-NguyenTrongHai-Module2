package furama_resort.services.impl;

import furama_resort.models.facility.Facility;
import furama_resort.models.facility.House;
import furama_resort.models.facility.Room;
import furama_resort.models.facility.Villa;
import furama_resort.repositories.IFacilityRepository;
import furama_resort.repositories.impl.FacilityRepository;
import furama_resort.services.IFacilityService;

import java.util.List;
import java.util.Set;

public class FacilityService implements IFacilityService {
    private static IFacilityRepository facilityRepository = new FacilityRepository();
    @Override
    public List<Facility> getAll() {
        return facilityRepository.getAll();
    }

    @Override
    public boolean checkExist(String code) {
        return facilityRepository.checkExist(code);
    }

    @Override
    public void addNewRoom(Room room1) {
        facilityRepository.addNewRoom(room1);
    }

    @Override
    public void addNewHouse(House house1) {
        facilityRepository.addNewHouse(house1);
    }

    @Override
    public void addNewVilla(Villa villa1) {
        facilityRepository.addNewVilla(villa1);
    }

    @Override
    public void removeFacility(String code) {
        facilityRepository.removeFacility(code);
    }

//    @Override
//    public Set<Facility> getAllMap() {
//        return facilityRepository.getAllMap();
//    }
}
