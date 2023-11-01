package teacher_student_management.controller;

import teacher_student_management.model.Person;
import teacher_student_management.model.Student;
import teacher_student_management.model.Teacher;
import teacher_student_management.service.IPersonService;
import teacher_student_management.service.PersonService;

import java.util.List;

public class PersonController {
    private IPersonService personService = new PersonService();

    public void addTeacher(Teacher teacher) {
        personService.addTeacher(teacher);
    }

    public List<Teacher> getAllTeacher() {
        return personService.getAllTeacher();
    }

    public List<Student> getAllStudent() {
        return personService.getAllStudent();
    }

    public void addStudent(Student student) {
        personService.addStudent(student);
    }




    public boolean checkCodeStudent(Integer code) {
        return personService.checkCodeStudent(code);
    }

    public boolean checkCodeTeacher(Integer code) {
        return personService.checkCodeTeacher(code);
    }

    public Teacher getTeacher(Integer code) {
        return personService.getTeacher(code);
    }

    public void removeTeacher(Integer code) {
        personService.removeTeacher(code);
    }

    public Student getStudent(Integer code) {
        return personService.getStudent(code);
    }

    public void removeStudent(Integer code) {
        personService.removeStudent(code);
    }
}
