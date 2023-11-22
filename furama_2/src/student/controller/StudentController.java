package student.controller;

import student.models.Student;
import student.service.IStudentService;
import student.service.impl.StudentService;

import java.util.List;

public class StudentController {
    private IStudentService studentService = new StudentService();

    public List<Student> getAll() {
        return studentService.getAll();
    }

    public boolean checkExist(String id) {
        return studentService.checkExist(id);
    }

    public void addNewStudent(Student student) {
        studentService.addNewStudent(student);
    }
}
