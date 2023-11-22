package bai_thi.mvc.repositories.impl;

import bai_thi.mvc.models.Bug;
import bai_thi.mvc.repositories.IBugRepository;
import bai_thi.mvc.utils.read_write.ReadBug;
import bai_thi.mvc.utils.read_write.WriteBug;

import java.util.List;

public class BugRepository implements IBugRepository {
    @Override
    public List<Bug> getAll() {
        List<Bug> bugList = ReadBug.readBug();
        return bugList;
    }

    @Override
    public boolean checkExist(String id) {
        List<Bug> bugList = ReadBug.readBug();
        for (Bug bug: bugList){
            if (bug.getBugId().equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addNewBug(Bug bug) {
        List<Bug> bugList = ReadBug.readBug();
        bugList.add(bug);
        WriteBug.writeToFile(bugList);
    }
}
