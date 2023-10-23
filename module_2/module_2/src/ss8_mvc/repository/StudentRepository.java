package ss8_mvc.repository;


import ss8_mvc.model.Student;

import java.util.ArrayList;

public class StudentRepository implements IStudentRepository {
    private static ArrayList<Student> students = new ArrayList<>();
    static {
        students.add(new Student(1,"Dụng"));
        students.add(new Student(2,"Tuấn"));
        students.add(new Student(3,"Vi"));
        students.add(new Student(4,"Độ"));
        students.add(new Student(5,"Hải"));
    }

    @Override
    public void showList() {
        for (Student s: students) {
            System.out.println(s);
        }
    }
    public void addStudent(){
    }
}
