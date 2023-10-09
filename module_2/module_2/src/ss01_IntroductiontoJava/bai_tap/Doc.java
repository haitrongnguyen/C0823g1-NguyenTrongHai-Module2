package ss01_IntroductiontoJava.bai_tap;

import java.util.Scanner;

public class Doc {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        number = Integer.parseInt(scanner.nextLine());
        System.out.println("Đọc bằng tiếng Anh: ");
        System.out.println(docSoThanhChuoi(number));
    }

    public static String docSoThanhChuoi(int number) {
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] tens10 = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eightteen", "nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eightty",
                "ninety"};
        String result = "";
        if (number <= 10) {
            result = ones[number];
        } else if (number < 20) {
            result = tens10[number % 10];
        } else if (number <= 99) {
            result = tens[number / 10] + " " + ones[number % 10];
        } else if (number <= 999) {
            if (number % 100 == 0) {
                result = ones[number / 100] + "hundred";
            } else if (number % 100 < 10) {
                result = ones[number / 100] + "hundred and " + ones[number % 100];
            } else if (number % 100 < 20) {
                result = ones[number / 100] + "hundred and " + tens[number % 100 - 10];
            } else {
                result = ones[number / 100] + "hundred and " + tens[(number % 100) / 10] + " " + ones[(number % 100) % 10];
            }

        }
        return result;
    }
}

