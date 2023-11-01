package teacher_student_management.view;

import teacher_student_management.controller.PersonController;
import teacher_student_management.model.Student;
import teacher_student_management.model.Teacher;

import java.util.List;
import java.util.Scanner;

public class PersonView {
    private static Scanner scanner = new Scanner(System.in);
    private static PersonController personController = new PersonController();

    public static void main(String[] args) {
        do {
            System.out.println("--Chương trình quản lí sinh viên---\n" +
                    "Chọn chức năng theo số để tiếp tục\n" +
                    "1. Thêm mới giảng viên hoặc học sinh\n" +
                    "2. Xóa giảng viên hoặc học sinh\n" +
                    "3. Xem danh sách giảng viên hoặc học sinh\n" +
                    "4. Thoát");
            System.out.println("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            Integer code;
            Teacher teacher;
            Student student;
            boolean checkCodeStudent = true;
            boolean checkCodeTeacher = true;
            switch (choice) {
                case 1:
                    System.out.println("1. Thêm mới giảng viên\n" +
                            "2. Thêm mới học sinh");
                    System.out.println("Chọn chức năng: ");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            do {
                                code = inputCode();
                                checkCodeTeacher = personController.checkCodeTeacher(code);
                                if (checkCodeTeacher) {
                                    System.out.println("Code đã tồn tại");
                                } else {
                                    teacher = inputInformationTeacher();
                                    teacher.setCode(code);
                                    personController.addTeacher(teacher);
                                    System.out.println("thêm thành công");
                                }
                            } while (checkCodeTeacher);

                            break;
                        case 2:
                            do {
                                code = inputCode();
                                checkCodeStudent = personController.checkCodeStudent(code);
                                if (checkCodeStudent) {
                                    System.out.println("Code đã tồn tại");
                                } else {
                                    student = inputInformationStudent();
                                    student.setCode(code);
                                    personController.addStudent(student);
                                }
                            } while (checkCodeStudent);

                            break;
                    }
                    break;
                case 2:
                    System.out.println("Bạn muốn xóa?\n" +
                            "1. Giảng viên\n" +
                            "2. Học sinh");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            do {
                                code = inputCode();
                                checkCodeTeacher = personController.checkCodeTeacher(code);
                                if (checkCodeTeacher) {
                                    teacher = personController.getTeacher(code);
                                    System.out.println("Bạn muốn xóa " + teacher + "\n" +
                                            "1. Đồng ý\n" +
                                            "2. Hủy");
                                    choice = Integer.parseInt(scanner.nextLine());
                                    if (choice == 1) {
                                        personController.removeTeacher(code);
                                        System.out.println("Xóa thành công");
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    System.out.println("Code không tồn tại");
                                }
                            } while (checkCodeTeacher);
                            break;
                        case 2:
                            do {
                                code = inputCode();
                                checkCodeStudent = personController.checkCodeStudent(code);
                                if (checkCodeStudent) {
                                    student = personController.getStudent(code);
                                    System.out.println("Bạn muốn xóa " + student + "\n" +
                                            "1. Đồng ý\n" +
                                            "2. Hủy");
                                    choice = Integer.parseInt(scanner.nextLine());
                                    if (choice == 1) {
                                        personController.removeStudent(code);
                                        System.out.println("Xóa Thành công");
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                            } while (checkCodeStudent);
                            break;
                    }
                    break;

                case 3:
                    System.out.println("1. Xem danh sách giảng viên\n" +
                            "2. Xem danh sách học sinh");
                    System.out.println("Chọn chức năng: ");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            List<Teacher> teachers = personController.getAllTeacher();
                            System.out.println("----Danh sách giảng viên----");
                            for (Teacher teacher1 : teachers) {
                                System.out.println(teacher1);
                            }
                            break;
                        case 2:
                            List<Student> students = personController.getAllStudent();
                            System.out.println("---Danh sách học sinh----");
                            for (Student student1 : students) {
                                System.out.println(student1);
                            }
                    }
                    break;
                case 4:
                    System.exit(0);
            }

        } while (true);
    }

    private static Student inputInformationStudent() {
        System.out.println("Họ và tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String day = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập lớp");
        String className = scanner.nextLine();
        System.out.println("Nhập điểm");
        Integer score = Integer.parseInt(scanner.nextLine());
        return new Student(name, day, gender, className, score);
    }

    private static Teacher inputInformationTeacher() {
        System.out.println("Họ và tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String day = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập trình độ chuyên môn");
        String level = scanner.nextLine();
        return new Teacher(name, day, gender, level);
    }

    private static Integer inputCode() {
        System.out.println("Nhập code");
        return Integer.parseInt(scanner.nextLine());
    }
}