package ss01_IntroductiontoJava.thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte month;
        String dayInMonth;
        System.out.println("Nhập vào tháng muốn kiểm tra");
        month = Byte.parseByte(scanner.nextLine());
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "31";
                break;
            case 2:
                dayInMonth = "28 hoặc 29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30";
                break;
            default:
                dayInMonth = "";
        }
        if (!dayInMonth.isEmpty()) {
            System.out.printf("Tháng %d có %s ngày", month, dayInMonth);
        } else {
            System.out.println("Tháng không hợp lệ");
        }
    }
}
