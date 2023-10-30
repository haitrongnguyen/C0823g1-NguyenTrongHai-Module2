package ss14_Exception_Debug.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class TriangleException {
    private static boolean checkInValidLength;

    private static int checkInValidNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.println("Nhập vào cạnh thứ " + number + " của tam giác");
            a = Integer.parseInt(scanner.nextLine());
            if (a <= 0) {
                System.err.println("Cạnh phải lớn hơn 0");
                System.out.print("Nhập lại: ");
                a = Integer.parseInt(scanner.nextLine());
            }
        } while (a <= 0);
        return a;
    }

    private static void checkInValidLength(int a, int b, int c) {
        checkInValidLength = true;
        try {
            if (a + b <= c || a + c <= b || b + c <= a) {
                checkInValidLength = false;
                throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại");
            }
            System.out.println("Tam giác có ba cạnh là: " + a + "\t" + b + "\t" + c);
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void main(String[] args) throws IllegalTriangleException {
        int a;
        int b;
        int c;
        do {
            a = checkInValidNumber(1);
            b = checkInValidNumber(2);
            c = checkInValidNumber(3);
            checkInValidLength(a, b, c);
        } while (!checkInValidLength);
    }
}