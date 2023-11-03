package furama_resort.repositories;

import furama_resort.models.facility.Facility;
import furama_resort.models.facility.House;
import furama_resort.models.facility.Room;
import furama_resort.models.facility.Villa;

import java.util.List;
import java.util.Set;

public interface IFacilityRepository {
    List<Facility> getAll();

    boolean checkExist(String code);

    void addNewRoom(Room room1);

    void addNewHouse(House house1);

    void addNewVilla(Villa villa1);

    void removeFacility(String code);

//    Set<Facility> getAllMap();
}
