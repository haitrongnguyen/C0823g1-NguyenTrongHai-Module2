package teacher_student_management.repository;

import teacher_student_management.model.Person;
import teacher_student_management.model.Student;
import teacher_student_management.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository implements IPersonRepository{
    private static List<Teacher> teacherList = new ArrayList<>();
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1,"nguyễn Văn A","15/01/1997","Male","C08",5));
        studentList.add(new Student(2,"nguyễn Văn A","15/01/1997","Male","C08",5));
        studentList.add(new Student(3,"nguyễn Văn A","15/01/1997","Male","C08",5));
        teacherList.add(new Teacher(4,"nguyễn Văn A","15/01/1997","Male","Đại học"));
        teacherList.add(new Teacher(5,"nguyễn Văn A","15/01/1997","Male","Cao đẳng"));

    }


    @Override
    public void saveTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherList;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentList;
    }

    @Override
    public void saveStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public boolean checkCodeStudent(Integer code) {
        for (Student student: studentList){
            if (student.getCode().equals(code)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkCodeTeacher(Integer code) {
        for (Teacher teacher: teacherList){
            if (teacher.getCode().equals(code)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Teacher getTeacher(Integer code) {
        for (Teacher teacher: teacherList){
            if (teacher.getCode().equals(code)){
                return teacher;
            }
        }
        return null;
    }

    @Override
    public void removeTeacher(Integer code) {
        for (Teacher teacher: teacherList){
            if (teacher.getCode().equals(code)){
                teacherList.remove(teacher);
                break;
            }
        }
    }

    @Override
    public Student getStudent(Integer code) {
        for (Student student:studentList){
            if (student.getCode().equals(code)){
                return student;
            }
        }
        return null;
    }

    @Override
    public void removeStudent(Integer code) {
        for (Student student: studentList){
            if (student.getCode().equals(code)){
                studentList.remove(student);
                break;
            }
        }
    }

}
