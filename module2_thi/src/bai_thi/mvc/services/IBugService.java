package bai_thi.mvc.services;

import bai_thi.mvc.models.Bug;

import java.util.List;

public interface IBugService {
    List<Bug> getAll();

    boolean checkExist(String id);

    void addNewBug(Bug bug);
}
