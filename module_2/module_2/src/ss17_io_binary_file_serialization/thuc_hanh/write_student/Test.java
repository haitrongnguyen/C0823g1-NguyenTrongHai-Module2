package ss17_io_binary_file_serialization.thuc_hanh.write_student;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        studentList.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        studentList.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        studentList.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        studentList.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        WriteDataToFile.writeData("src/ss17_io_binary_file_serialization/thuc_hanh/write_student/student.txt",studentList);
        List<Student> students = ReadDataToFile.readStudent("src/ss17_io_binary_file_serialization/thuc_hanh/write_student/student.txt");
        for(Student student: students){
            System.out.println(student);
        }
    }
}
