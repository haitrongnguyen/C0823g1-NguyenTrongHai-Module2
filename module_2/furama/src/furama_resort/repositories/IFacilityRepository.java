package furama_resort.repositories;

import furama_resort.models.facility.Facility;

import java.util.List;

public interface IFacilityRepository {
    List<Facility> getAll();
}
