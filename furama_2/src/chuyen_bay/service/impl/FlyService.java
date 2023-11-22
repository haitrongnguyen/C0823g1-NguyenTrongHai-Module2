package chuyen_bay.service.impl;

import chuyen_bay.models.services.Fly;
import chuyen_bay.repositories.IFlyRepository;
import chuyen_bay.repositories.impl.FlyRepository;
import chuyen_bay.service.IFlyService;
import furama_resort.services.IFacilityService;

import java.util.List;

public class FlyService implements IFlyService{
    private IFlyRepository flyRepository = new FlyRepository();
    @Override
    public List<Fly> getAll() {
        return flyRepository.getAll();
    }

    @Override
    public boolean checkExist(int flyCode) {
        return flyRepository.checkExist(flyCode);
    }

    @Override
    public void addNewFly(Fly fly) {
        flyRepository.addNewFly(fly);
    }
}
