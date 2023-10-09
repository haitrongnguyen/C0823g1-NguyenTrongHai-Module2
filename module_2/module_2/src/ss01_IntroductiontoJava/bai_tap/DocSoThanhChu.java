package ss01_IntroductiontoJava.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhập vào một số");
        number = Integer.parseInt(scanner.nextLine());
        System.out.println("Chuyển sang tiếng Anh");
        System.out.println(docSoThanhChuoi(number));
    }

    public static String docSoThanhChuoi(int number) {
        String result = "";
        if (number <= 10) {
            result = traVeDonVi(number);
        } else if (number < 20) {
            result = traVeNhoHon20(number);
        } else if (number <= 99) {
            result = traVeHangChuc(number) + traVeDonVi(number % 10);
        } else {
            if (number % 100 == 0) {
                result = traVeDonVi(number / 100) + "hundred";
            } else {
                result = traVeDonVi(number / 100) + "hundred and " + traVeHangChuc((number % 100) / 10) +
                        traVeDonVi((number % 100) % 10);
            }
        }
        return result;
    }
    public static String traVeDonVi(int number) {
        String[] donVi = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        return donVi[number];
    }

    public static String traVeNhoHon20(int number) {
        String[] tens10 = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eightteen", "nineteen"};
        return tens10[number % 10];
    }

    public static String traVeHangChuc(int number) {
        String[] tens = {"", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eightty",
                "ninety"};
        return tens[number / 10];
    }
}
