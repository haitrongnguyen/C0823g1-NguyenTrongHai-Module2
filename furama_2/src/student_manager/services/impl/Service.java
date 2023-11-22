package student_manager.services.impl;

import student_manager.repositories.IRepository;
import student_manager.repositories.impl.Repository;
import student_manager.services.IService;

public class Service implements IService {
    private IRepository repository = new Repository();
    @Override
    public boolean checkCode(String code) {
        return repository.checkCode(code);
    }
}
