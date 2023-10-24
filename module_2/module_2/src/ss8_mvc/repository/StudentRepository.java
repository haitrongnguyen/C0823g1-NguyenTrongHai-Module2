package ss8_mvc.repository;


import ss8_mvc.model.Student;

public class StudentRepository implements IStudentRepository {
    private static Student[] students = new Student[10];
    static {
        students[0] = new Student(1,"Dụng");
        students[1] = new Student(2,"Tuấn");
        students[2] = new Student(3,"Vi");
        students[3] = new Student(4,"Độ");
        students[4] = new Student(5,"Hải");
    }

    @Override
    public void showList() {
        for (Student s: students) {
            System.out.println(s);
        }
    }
}
