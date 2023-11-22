package student.repositories;

import student.models.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();

    boolean checkExist(String id);

    void addNewStudent(Student student);
}
