package test_io_file.services;

import test_io_file.models.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();

    boolean checkId(Integer id);

    void addStudent(Student student);

    void removeStudent(Integer id);

    void editStudent(Integer id,Student student);
}
