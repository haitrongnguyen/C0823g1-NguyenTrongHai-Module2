/*Từ đó, có thể rút gọn thành các quy tắc xác định năm nhuận:

        Những năm chia hết cho 4 mà không chia hết cho 100 là năm nhuận

        Những năm chia hết cho 100 mà không chia hết cho 400 thì KHÔNG PHẢI là năm nhuận

        Những năm chia hết đồng thời cho 100 và 400 là năm nhuận*/

import java.util.Scanner;

public class LeapYearCalculator {
    /* public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int year;
         System.out.println("Enter the year");
         year = scanner.nextInt();
         if (year%4==0) {
             if (year%100==0){
                 if (year%400==0){
                     System.out.printf("'%d' is a leep year",year);
                 }else {
                     System.out.printf("'%d' is not a leep year",year);
                 }
             }else {
                 System.out.printf("'%d' is a leep year",year);
             }
         }else {
             System.out.printf("'%d' is not a leep year",year);
         }
     }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("enter the year: ");
        year = scanner.nextInt();
        boolean isLeepYear = false;
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
            System.out.printf("'%d' is a leep year", year);
        } else {
            System.out.printf("'%d' is not a leep year", year);
        }
    }
}
