package student.service.impl;

import student.models.Student;
import student.repositories.IStudentRepository;
import student.repositories.impl.StudentRepository;
import student.service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public boolean checkExist(String id) {
        return studentRepository.checkExist(id);
    }

    @Override
    public void addNewStudent(Student student) {
        studentRepository.addNewStudent(student);
    }
}
