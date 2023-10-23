package teacher_student_management.repository;

import teacher_student_management.model.Person;
import teacher_student_management.model.Student;
import teacher_student_management.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository implements IPersonRepository{
    private static List<Person> personList = new ArrayList<>();
    @Override
    public void addStudent(String code, String name, String dayOfBirth, String gender, String className, double score) {
        personList.add(new Student("1","A","1/1/17","Male","A1",5));
        personList.add(new Student("2","B","2/1/17","FeMale","A1",6));
    }

    @Override
    public void addTeacher(String code, String name, String dayOfBirth, String gender, String level) {

    }

    @Override
    public void removeStudent(String code) {

    }

    @Override
    public void removeTeacher(String code) {

    }

    @Override
    public void displayStudent() {

    }

    @Override
    public void displayTeacher() {

    }
}
