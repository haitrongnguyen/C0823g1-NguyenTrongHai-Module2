package bai_thi.mvc.views;

import bai_thi.mvc.controllers.BugController;
import bai_thi.mvc.models.Bug;
import bai_thi.mvc.utils.exception.NumberFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BugView {
    private static BugController bugController = new BugController();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("---Quản lí Bug---\n" +
                    "1. Hiển thị danh sách Bug\n" +
                    "2. Thêm mới Bug");
            System.out.println("Chọn chức năng");
            choice = NumberFormat.checkNumber();
            switch (choice){
                case 1:
                    showListBug();
                    break;
                case 2:
                    addNewBug();
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }while (true);


    }

    private static void addNewBug() {
        System.out.println("Nhập Id Bug theo định dạng BUG-XXX, X là số");
        String id;
        boolean checkExist;
        do {
            id = inputIdBud();
            checkExist = bugController.checkExist(id);
            if (checkExist){
                System.out.println("ID trùng, vui lòng nhập lại");
            }
        }while (checkExist);
        System.out.println("Nhập Tên Bug");
        String name = inputInformation();
        System.out.println("Nhập Chi tiết Bug");
        String detail = inputInformation();
        System.out.println("Nhập thời gian");
        String time = inputInformation();
        System.out.println("Chọn mức độ nguy hại");
        String level = inputLevel();
        Bug bug = new Bug(id,name,detail,time,level);
        bugController.addNewBug(bug);
        System.out.println("Thêm thành công");
    }

    private static String inputLevel() {
        String level = null;
        System.out.println("Mức độ\n" +
                "1. Critical\n" +
                "2. Major\n" +
                "3. Medium\n" +
                "4. Low");
        System.out.println("Chọn mức độ");
        int choice = NumberFormat.checkNumber();
        switch (choice){
            case 1:
                level = "Critical";
                break;
                case 2:
                level = "Major";
                break;
            case 3:
                level = "Medium";
                break;
                case 4:
                level = "Low";
                break;
            default:
                System.out.println("Lựa chọn không đúng");
        }
        return level;
    }

    private static String inputInformation() {
        String name;
        boolean checkName;
        do {
                name = scanner.nextLine();
                checkName = Pattern.matches("^.+$",name);
                if (!checkName){
                    System.out.println("Trường bắt buộc phải nhập");
                }
        }while (!checkName);
        return name;
    }

    private static String inputIdBud() {
        String bugId;
        boolean checkBugId;
        do {
           bugId = scanner.nextLine();
           checkBugId = Pattern.matches("^BUG-[0-9]{3}$",bugId);
           if (!checkBugId){
               System.out.println("Vui lòng nhập đúng định dạng BUG-XXX, X là số");
           }
        }while (!checkBugId);
        return bugId;
    }

    private static void showListBug() {
        List<Bug> bugList = bugController.getAll();
        if (bugList.isEmpty()){
            System.out.println("Danh sách rỗng");
        }else {
            for (Bug bug: bugList){
                System.out.println(bug);
            }
        }
    }
}
