package student_manager.repositories.impl;

import student_manager.repositories.IRepository;

public class Repository implements IRepository {
    @Override
    public boolean checkCode(String code) {
        return false;
    }
}
