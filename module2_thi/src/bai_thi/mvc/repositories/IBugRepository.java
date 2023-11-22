package bai_thi.mvc.repositories;

import bai_thi.mvc.models.Bug;

import java.util.List;

public interface IBugRepository {
    List<Bug> getAll();

    boolean checkExist(String id);

    void addNewBug(Bug bug);
}
