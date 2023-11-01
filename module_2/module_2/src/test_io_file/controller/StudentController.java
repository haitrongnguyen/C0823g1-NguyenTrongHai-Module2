package test_io_file.controller;

import test_io_file.models.Student;
import test_io_file.services.IStudentService;
import test_io_file.services.impl.StudentService;

import java.util.List;

public class StudentController {
    private IStudentService studentService = new StudentService();
    public List<Student> getAll() {
        return studentService.getAll();
    }

    public boolean checkId(Integer id) {
        return studentService.checkId(id);
    }

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    public void removeStudent(Integer id) {
        studentService.removeStudent(id);
    }

    public void editStudent(Integer id, Student student) {
        studentService.editStudent(id,student);
    }
}
