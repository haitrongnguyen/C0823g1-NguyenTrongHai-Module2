package bai_thi.mvc.services.impl;

import bai_thi.mvc.models.Bug;
import bai_thi.mvc.repositories.IBugRepository;
import bai_thi.mvc.repositories.impl.BugRepository;
import bai_thi.mvc.services.IBugService;

import java.util.List;

public class BugService implements IBugService {
    private IBugRepository bugRepository = new BugRepository();
    @Override
    public List<Bug> getAll() {
        return bugRepository.getAll();
    }

    @Override
    public boolean checkExist(String id) {
        return bugRepository.checkExist(id);
    }

    @Override
    public void addNewBug(Bug bug) {
        bugRepository.addNewBug(bug);
    }
}
