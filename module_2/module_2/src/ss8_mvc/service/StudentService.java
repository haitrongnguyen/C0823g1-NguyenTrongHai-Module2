package ss8_mvc.service;

import ss8_mvc.repository.IStudentRepository;
import ss8_mvc.repository.StudentRepository;

public class StudentService implements IStudentService{
    private IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public void showList() {
        iStudentRepository.showList();
    }
}
