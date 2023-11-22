package chuyen_bay.views;

import chuyen_bay.controller.FlyController;
import chuyen_bay.models.services.Fly;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FlyViews {
    private static Scanner scanner = new Scanner(System.in);
    private static FlyController flyController = new FlyController();
    public static void main(String[] args) {
        Integer choice;
        do {
            System.out.println("-----Menu-----\n" +
                    "1. Hiển thị danh sách\n" +
                    "2. Thêm chuyến bay\n" +
                    "3. Thoát");
            choice = inputChoice();
            switch (choice){
                case 1:
                    displayList();
                    break;
                case 2:
                    addNewFly();
                    break;
                case 3:System.exit(0);
            }
        }while (true);

    }

    private static void addNewFly() {
        int flyCode;
        boolean checkExist;
        Fly fly;
        do {
            flyCode = inputFlyCode();
            checkExist = flyController.checkExist(flyCode);
            if (checkExist){
                System.out.println("Mã đã tồn tại");
            }
        }while (checkExist);
        fly = inputInformationFly();
        fly.setFlyCode(flyCode);
        flyController.addNewFly(fly);
        System.out.println("Thêm thành công");
    }

    private static Fly inputInformationFly() {
        System.out.println("Nhập ngày bay");
        String dayFly = checkDayFly();
        System.out.println("Nhập giờ bay (VD: 12h00)");
        String hourFly = checkHourFly();
        System.out.println("Nhập nơi đến");
        String placeTo = checkFormat();
        System.out.println("Nhập nơi nơi bắt đầu bay");
        String placeFrom = checkFormat();
        return new Fly(dayFly,hourFly,placeTo,placeFrom);
    }

    private static String checkFormat() {
        String place;
        boolean checkPlace;
        do {
            place = scanner.nextLine();
            checkPlace = Pattern.matches("^[A-Z].+",place);
            if (!checkPlace){
                System.out.println("Vui lòng nhập đúng định dạng");
            }
        }while (!checkPlace);
        return place;
    }

    private static String checkHourFly() {
        String hourFly;
        boolean checkHourFly;
        do {
            hourFly = scanner.nextLine();
            checkHourFly = Pattern.matches("^([01][0-9]|[0-9]|2[0-3])H[0-6][0-9]$",hourFly);
            if (!checkHourFly){
                System.out.println("Vui lòng nhập đúng định dạng");
            }
        }while (!checkHourFly);
        return hourFly;
    }

    private static String checkDayFly() {
        String dayFly;
        boolean checkDayFly;
        do {
            dayFly = scanner.nextLine();
            checkDayFly = Pattern.matches("^([0-9]|[0][0-9]|[012][0-9]|3[01])/([0-9]|[0][0-9]|1[012])/20[0-9]{2}$",dayFly);
            if (!checkDayFly){
                System.out.println("Vui lòng nhập đúng định dạng");
            }
        }while (!checkDayFly);
        return  dayFly;
    }

    private static int inputFlyCode() {
        int flyCode = 0;
        boolean checkCode;
        do {
            checkCode = true;
            try {
                System.out.println("Nhập mã chuyến bay");
                flyCode = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Phải là số");
                checkCode = false;
            }
        }while (!checkCode);
        return flyCode;
    }

    private static void displayList() {
        System.out.println("---Danh sách chuyến bay----");
        List<Fly> flies = flyController.getAll();
        for (Fly fly:flies){
            System.out.println(fly);
        }
    }

    private static Integer inputChoice() {
        Integer choice = null;
        try {
            System.out.println("Chọn chức năng");
            choice = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.err.println("Phải là số");
        }
        return choice;
    }
}
