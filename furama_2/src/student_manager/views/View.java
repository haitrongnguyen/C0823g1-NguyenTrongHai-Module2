package student_manager.views;

import student_manager.controllers.Controller;
import student_manager.utils.Choice;

import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);
    private static Controller controller = new Controller();
    public static void main(String[] args) {
        int choice;
        System.out.println("---Chương trình quản lý sinh viên---\n" +
                "1. Thêm mới giảng viên hoặc học sinh\n" +
                "2. Xóa giảng viên hoặc học sinh\n" +
                "3. Xem danh sách giảng viên hoặc học sinh\n" +
                "4. Thoát");
        System.out.print("Chọn chức năng: ");
        choice = Choice.checkChoice();
        switch (choice){
            case 1:
                System.out.println("Chọn chức năng\n" +
                        "1. Giảng viên\n" +
                        "2. Sinh viên");
                choice = Choice.checkChoice();
                switch (choice){
                    case 1:
                        addTeacher();
                }
                break;
        }
    }

    private static void addTeacher() {
        String code = inputCode();
    }

    private static String inputCode() {
        System.out.println("Nhập mã giảng viên (GV-xxx, x là số)");
        String code;
        boolean checkCode;
        do {
            code = scanner.nextLine();
            checkCode = controller.checkCode(code);
        }while (true);
    }
}
