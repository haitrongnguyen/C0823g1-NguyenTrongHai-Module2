package chuyen_bay.repositories;

import chuyen_bay.models.services.Fly;

import java.util.List;

public interface IFlyRepository {
    List<Fly> getAll();

    boolean checkExist(int flyCode);

    void addNewFly(Fly fly);
}
