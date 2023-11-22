package bai_thi.mvc.controllers;

import bai_thi.mvc.models.Bug;
import bai_thi.mvc.services.IBugService;
import bai_thi.mvc.services.impl.BugService;

import java.util.List;

public class BugController {
    private IBugService bugService = new BugService();

    public List<Bug> getAll() {
        return bugService.getAll();
    }

    public boolean checkExist(String id) {
        return bugService.checkExist(id);
    }

    public void addNewBug(Bug bug) {
        bugService.addNewBug(bug);
    }
}
