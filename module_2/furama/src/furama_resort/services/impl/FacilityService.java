package furama_resort.services.impl;

import furama_resort.models.facility.Facility;
import furama_resort.repositories.IFacilityRepository;
import furama_resort.repositories.impl.FacilityRepository;
import furama_resort.services.IFacilityService;

import java.util.List;

public class FacilityService implements IFacilityService {
    private static IFacilityRepository facilityRepository = new FacilityRepository();
    @Override
    public List<Facility> getAll() {
        return facilityRepository.getAll();
    }
}
