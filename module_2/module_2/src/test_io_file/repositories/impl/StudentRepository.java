package test_io_file.repositories.impl;

import test_io_file.models.Student;
import test_io_file.repositories.IStudentRepository;
import test_io_file.untils.StudentReader;
import test_io_file.untils.StudentWrite;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> students = new ArrayList<>();
    @Override
    public List<Student> getAll() {
       return StudentReader.reader("students.csv");
    }

    @Override
    public boolean checkId(Integer id) {
        students = StudentReader.reader("students.csv");
        for (Student student: students){
            if (student.getId() == id){
                return true;
            }
        }
        return false;
    }

    @Override
    public void saveStudent(Student student) {
        StudentWrite.writeStudent("students.csv",student);
    }

    @Override
    public void removeStudent(Integer id) {
        students = StudentReader.reader("students.csv");
        for (Student student: students){
            if (student.getId() == id){
                students.remove(student);
                break;
            }
        }
        StudentWrite.writeStudents("students.csv",students);
    }

    @Override
    public void editStudent(Integer id,Student student) {
        students = StudentReader.reader("students.csv");
        for (Student student1: students){
            if (student1.getId() == id){
                student1.setName(student.getName());
                student1.setDateOfBirth(student.getDateOfBirth());
                student1.setClassName(student.getClassName());
            }
        }
        StudentWrite.writeStudents("students.csv",students);
    }
}
