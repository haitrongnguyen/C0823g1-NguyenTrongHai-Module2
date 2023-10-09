package ss01_IntroductiontoJava.thuc_hanh;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        boolean isLeepYear = false;
        System.out.println("Nhập tháng muốn kiểm tra");
        year = Integer.parseInt(scanner.nextLine());
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeepYear = true;
                }
            } else {
                isLeepYear = true;
            }
        }
        if (isLeepYear) {
            System.out.printf("Năm %d là năm nhuận", year);
        } else {
            System.out.printf("Năm %d không phải là năm nhuận", year);
        }
    }
}
