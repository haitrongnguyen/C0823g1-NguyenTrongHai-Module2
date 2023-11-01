package teacher_student_management.service;

import teacher_student_management.model.Student;
import teacher_student_management.model.Teacher;
import teacher_student_management.repository.IPersonRepository;
import teacher_student_management.repository.PersonRepository;

import java.util.List;

public class PersonService implements IPersonService{
    private IPersonRepository personRepository = new PersonRepository();
    @Override
    public void addTeacher(Teacher teacher) {
        personRepository.saveTeacher(teacher);
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return personRepository.getAllTeacher();
    }

    @Override
    public List<Student> getAllStudent() {
        return personRepository.getAllStudent();
    }

    @Override
    public void addStudent(Student student) {
        personRepository.saveStudent(student);
    }


    @Override
    public boolean checkCodeStudent(Integer code) {
        return personRepository.checkCodeStudent(code);
    }

    @Override
    public boolean checkCodeTeacher(Integer code) {
        return personRepository.checkCodeTeacher(code);
    }

    @Override
    public Teacher getTeacher(Integer code) {
        return personRepository.getTeacher(code);
    }

    @Override
    public void removeTeacher(Integer code) {
        personRepository.removeTeacher(code);
    }

    @Override
    public Student getStudent(Integer code) {
        return personRepository.getStudent(code);
    }

    @Override
    public void removeStudent(Integer code) {
        personRepository.removeStudent(code);
    }
}
