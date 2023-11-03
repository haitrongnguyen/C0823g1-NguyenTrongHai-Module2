package furama_resort.controllers;

import furama_resort.models.facility.Facility;
import furama_resort.models.facility.House;
import furama_resort.models.facility.Room;
import furama_resort.models.facility.Villa;
import furama_resort.services.IFacilityService;
import furama_resort.services.impl.FacilityService;

import java.util.List;
import java.util.Set;

public class FacilityController {
    private static IFacilityService facilityService = new FacilityService();
    public List<Facility> getAll() {
       return facilityService.getAll();
    }

    public boolean checkExist(String code) {
        return facilityService.checkExist(code);
    }

    public void addNewRoom(Room room1) {
        facilityService.addNewRoom(room1);
    }

    public void addNewHouse(House house1) {
        facilityService.addNewHouse(house1);
    }

    public void addNewVilla(Villa villa1) {
        facilityService.addNewVilla(villa1);
    }

    public void removeFacility(String code) {
        facilityService.removeFacility(code);
    }


//    public Set<Facility> getAllMap() {
//        return facilityService.getAllMap();
//    }
}
