package ss8_mvc.view;

import ss8_mvc.controller.StudentController;
import ss8_mvc.model.Student;

import java.util.Scanner;

public class CodegymManagement {
    private static Student student;
    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        StudentController studentController = new StudentController();

        do{
            System.out.println("Vui lòng chọn chức năng:\n" +
                    "1. Xem danh sách.\n" +
                    "2. Thêm mới học viên. \n" +
                    "3. Sửa học viên. \n" +
                    "4. Xóa học viên. \n" +
                    "5. Thoát chương trình");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    studentController.showList();
                    break;
                case 2:
                    student = inputInformation();
                    studentController.addStudent(student);
                    break;
                case 3:
                    // sua
                    break;
                case 4:
                    //xoa
                    break;
                case 5:
                    System.out.println("Hẹn gặp lại");
                    System.exit(1);
                default:
                    System.out.println("Vui lòng chọn đúng số trong danh sách chức năng");
            }
        }while (true);

    }

    private static Student inputInformation() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        return new Student(id,name);
    }
}
