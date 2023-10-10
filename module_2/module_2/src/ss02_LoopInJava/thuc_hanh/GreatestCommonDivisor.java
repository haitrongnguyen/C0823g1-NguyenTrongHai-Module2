package ss02_LoopInJava.thuc_hanh;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số b: ");
        int b = Integer.parseInt(scanner.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b != 0) {
            System.out.println("UCLN là: " + b);
        } else if (a != 0 && b == 0) {
            System.out.println("UCLN là: " + a);
        } else if (a == 0 && b == 0) {
            System.out.println("Không có UCLN");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("UCLN là: " + a);
        }
    }
}
