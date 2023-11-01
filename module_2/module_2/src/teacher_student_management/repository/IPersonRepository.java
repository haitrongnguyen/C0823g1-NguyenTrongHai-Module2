package teacher_student_management.repository;

import teacher_student_management.model.Student;
import teacher_student_management.model.Teacher;

import java.util.List;

public interface IPersonRepository {

    void saveTeacher(Teacher teacher);

    List<Teacher> getAllTeacher();

    List<Student> getAllStudent();

    void saveStudent(Student student);


    boolean checkCodeStudent(Integer code);

    boolean checkCodeTeacher(Integer code);

    Teacher getTeacher(Integer code);

    void removeTeacher(Integer code);

    Student getStudent(Integer code);

    void removeStudent(Integer code);
}
