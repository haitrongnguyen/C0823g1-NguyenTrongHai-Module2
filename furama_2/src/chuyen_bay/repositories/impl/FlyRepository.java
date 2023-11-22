package chuyen_bay.repositories.impl;

import chuyen_bay.models.services.Fly;
import chuyen_bay.repositories.IFlyRepository;
import chuyen_bay.utils.read_and_write.FlyReader;
import chuyen_bay.utils.read_and_write.FlyWriter;

import java.util.List;

public class FlyRepository implements IFlyRepository {
    @Override
    public List<Fly> getAll() {
        return FlyReader.readFile();
    }

    @Override
    public boolean checkExist(int flyCode) {
        List<Fly> flies = FlyReader.readFile();
        for (Fly fly: flies){
            if (fly.getFlyCode() == flyCode){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addNewFly(Fly fly) {
        List<Fly> flies = FlyReader.readFile();
        flies.add(fly);
        FlyWriter.writeToFile(flies);
    }
}
