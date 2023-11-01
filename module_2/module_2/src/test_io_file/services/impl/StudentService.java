package test_io_file.services.impl;

import test_io_file.models.Student;
import test_io_file.repositories.IStudentRepository;
import test_io_file.repositories.impl.StudentRepository;
import test_io_file.services.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository studentRipository = new StudentRepository();
    @Override
    public List<Student> getAll() {
        return studentRipository.getAll();
    }

    @Override
    public boolean checkId(Integer id) {
        return studentRipository.checkId(id);
    }

    @Override
    public void addStudent(Student student) {
        studentRipository.saveStudent(student);
    }

    @Override
    public void removeStudent(Integer id) {
        studentRipository.removeStudent(id);
    }

    @Override
    public void editStudent(Integer id,Student student) {
        studentRipository.editStudent(id,student);
    }
}
