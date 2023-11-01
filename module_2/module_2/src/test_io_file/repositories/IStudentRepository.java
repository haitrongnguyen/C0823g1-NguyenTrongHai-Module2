package test_io_file.repositories;

import test_io_file.models.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();

    boolean checkId(Integer id);

    void saveStudent(Student student);

    void removeStudent(Integer id);

    void editStudent(Integer id,Student student);
}
