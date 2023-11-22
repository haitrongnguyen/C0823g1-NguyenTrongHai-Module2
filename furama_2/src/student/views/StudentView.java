package student.views;

import student.controller.StudentController;
import student.models.Student;
import student.utils.exception.NumberFormat;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;


public class StudentView {
    private static  StudentController studentController = new StudentController();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("----Menu----\n" +
                    "1. Hiển thị\n" +
                    "2. Thêm mới");
            System.out.println("Chọn chức năng");
            choice = NumberFormat.checkNumber();
            switch (choice){
                case 1:
                    displayList();
                    break;
                case 2:
                    addNewStudent();
                    break;
                case 3:
                    System.exit(0);
            }
        }while (true);

    }

    private static void addNewStudent() {
        System.out.println("Nhập id sinh viên");
        String id;
        boolean checkExistId;
        do {
            id = inputId();
            checkExistId = studentController.checkExist(id);
            if (checkExistId){
                System.out.println("Id đã tồn tại. Vui lòng nhập Id khác");
            }
        }while (checkExistId);
        System.out.println("Nhập tên");
        String name = inputName();
        System.out.println("Nhập tuổi");
        int age = inputAge();
        System.out.println("Nhập tên lớp");
        String className = inputClassName();
        Student student = new Student(id,name,age,className);
        studentController.addNewStudent(student);
        System.out.println("Thêm thành công");
    }

    private static String inputClassName() {
        String className;
        boolean checkClassName;
        do {
            className = scanner.nextLine();
            checkClassName = Pattern.matches("^C0[0-9]$",className);
            if (!checkClassName){
                System.out.println("Vui lòng nhập đúng định dạng");
            }
        }while (!checkClassName);
        return className;
    }

    private static int inputAge() {
        int age;
        boolean isNotValidAge;
        do {
            age = NumberFormat.checkNumber();
            isNotValidAge = age<0 ||age>150;
            if (isNotValidAge){
                System.out.println("Vui lòng nhập đúng tuổi");
            }
        }while (isNotValidAge);
        return age;
    }

    private static String inputName() {
        String name;
        boolean checkName;
        do {
            name = scanner.nextLine();
            checkName = Pattern.matches("^[A-Z].+$",name);
            if (!checkName){
                System.out.println("Chữ cái đầu phải viết hoa");
            }
        }while (!checkName);
        return name;
    }

    private static String inputId() {
        String id;
        boolean checkId;
        do {
            id = scanner.nextLine();
            checkId = Pattern.matches("^S-[0-9]{4}",id);
            if (!checkId){
                System.out.println("Vui lòng nhập đúng định dạng");
            }
        }while (!checkId);
        return id;
    }

    public static void displayList() {
        List<Student> students = studentController.getAll();
        if (students.isEmpty()){
            System.out.println("Danh sách trống");
        }else {
            for (Student student: students){
                System.out.println(student);
            }
        }

    }
}
