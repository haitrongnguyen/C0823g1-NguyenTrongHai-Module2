package test_io_file.views;

import test_io_file.controller.StudentController;
import test_io_file.models.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);
    private static Integer choice;
    private static Integer id;

    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        Student student;
        boolean checkId;
        do {
            System.out.println("--Quản lí học viên---\n" +
                    "1. Xem danh sách học viên\n" +
                    "2. Thêm học viên\n" +
                    "3. Xóa học viên\n" +
                    "4. Sửa thông tin học viên\n" +
                    "5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    List<Student> list = studentController.getAll();
                    System.out.println("----Danh sách học viên----");
                    for (Student student1 : list) {
                        System.out.println(student1);
                    }
                    break;
                case 2:
                    do {
                        id = inputId();
                        checkId = studentController.checkId(id);
                        if (checkId) {
                            System.out.println("Id đã tồn tại");
                        }
                    } while (checkId);
                    student = inputInformation();
                    student.setId(id);
                    studentController.addStudent(student);
                    System.out.println("Thêm thành công");

                    break;
                case 3:
                    do {
                        id = inputId();
                        checkId = studentController.checkId(id);
                        if (checkId) {
                            System.out.println("Bạn muốn xóa học viên có id " + id + "\n" +
                                    "1. Yes\n" +
                                    "2. No");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                    studentController.removeStudent(id);
                                    System.out.println("Xóa thành công");
                                    break;
                                case 2:
                                    break;
                            }

                        } else {
                            System.out.println("Id không tồn tại");
                        }
                    } while (!checkId);


                    break;
                case 4:
                    do {
                        id = inputId();
                        checkId = studentController.checkId(id);
                    } while (!checkId);

                    if (checkId) {
                        student = inputInformation();
                        studentController.editStudent(id, student);
                        System.out.println("Sửa thành công");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;

            }
        } while (true);

    }

    private static Student inputInformation() {
        System.out.println("Nhập tên học viên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập tên lớp");
        String className = scanner.nextLine();
        return new Student(name, dateOfBirth, className);
    }

    private static Integer inputId() {
        System.out.println("Nhập id: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
