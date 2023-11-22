package chuyen_bay.service;

import chuyen_bay.models.services.Fly;

import java.util.List;

public interface IFlyService {
    List<Fly> getAll();

    boolean checkExist(int flyCode);

    void addNewFly(Fly fly);
}
