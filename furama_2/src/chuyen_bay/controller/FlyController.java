package chuyen_bay.controller;

import chuyen_bay.models.services.Fly;
import chuyen_bay.service.IFlyService;
import chuyen_bay.service.impl.FlyService;

import java.util.List;

public class FlyController {
    private static IFlyService flyService = new FlyService();
    public List<Fly> getAll() {
    return flyService.getAll();
    }

    public boolean checkExist(int flyCode) {
        return flyService.checkExist(flyCode);
    }

    public void addNewFly(Fly fly) {
        flyService.addNewFly(fly);
    }
}
