package ss8_mvc.controller;

import ss8_mvc.model.Student;
import ss8_mvc.service.IStudentService;
import ss8_mvc.service.StudentService;

public class StudentController {
    private IStudentService iStudentService = new StudentService();
    public void showList(){
        iStudentService.showList();
    }

    public void addStudent(Student student) {
        iStudentService.addStudent(student);
    }
}
