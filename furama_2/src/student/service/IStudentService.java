package student.service;

import student.models.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();

    boolean checkExist(String id);

    void addNewStudent(Student student);
}
