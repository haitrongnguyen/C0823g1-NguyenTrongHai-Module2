package furama_resort.controllers;

import furama_resort.models.facility.Facility;
import furama_resort.services.IFacilityService;
import furama_resort.services.impl.FacilityService;

import java.util.List;

public class FacilityController {
    private static IFacilityService facilityService = new FacilityService();
    public List<Facility> getAll() {
       return facilityService.getAll();
    }
}
