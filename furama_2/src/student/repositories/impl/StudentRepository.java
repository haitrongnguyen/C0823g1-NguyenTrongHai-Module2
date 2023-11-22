package student.repositories.impl;

import student.models.Student;
import student.repositories.IStudentRepository;
import student.utils.read_write.Read;
import student.utils.read_write.WriteStudent;

import java.util.List;

public class StudentRepository implements IStudentRepository {
    @Override
    public List<Student> getAll() {
        return Read.readStudent();
    }

    @Override
    public boolean checkExist(String id) {
        List<Student> students = Read.readStudent();
        for (Student student: students){
            if (student.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addNewStudent(Student student) {
        List<Student> students = Read.readStudent();
        students.add(student);
        WriteStudent.write(students);
    }
}
