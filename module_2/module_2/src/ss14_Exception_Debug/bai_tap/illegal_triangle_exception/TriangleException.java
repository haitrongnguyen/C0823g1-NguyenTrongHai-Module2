package ss14_Exception_Debug.bai_tap.illegal_triangle_exception;

import java.util.Scanner;

public class TriangleException {
    //    private static void illegalTriangleException(int a, int b, int c) throws IllegalTriangleException {
//        boolean isInValidNumber = (a <= 0 || b <= 0 || c <= 0);
//        boolean isValidLength = (a + b > c && b + c > a && a + c > b);
//        if (isInValidNumber) {
//            throw new IllegalTriangleException("Độ dài cạnh phải lớn hơn 0");
//        }
//        if (!isValidLength) {
//            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại");
//        }
//    }
    private static void checkInValidNumber(int a) throws IllegalTriangleException {
        if (a <= 0) {
            throw new IllegalTriangleException("Độ dài cạnh phải lớn hơn 0");
        }
    }

    private static void checkInValidLength(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại");
        }
    }

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        boolean checkValue;
        int a;
        int b;
        int c;
        do {
            checkValue = true;
            try {
                System.out.println("Nhập vào cạnh thứ nhất của tam giác");
                a = Integer.parseInt(scanner.nextLine());
                checkInValidNumber(a);
                System.out.println("Nhập vào cạnh thứ hai của tam giác");
                b = Integer.parseInt(scanner.nextLine());
                checkInValidNumber(b);
                System.out.println("Nhập vào cạnh thứ ba của tam giác");
                c = Integer.parseInt(scanner.nextLine());
                checkInValidNumber(c);
                checkInValidLength(a, b, c);
                System.out.println("Tam giác có ba cạnh là: " + a + "\t" + b + "\t" + c);
            } catch (IllegalTriangleException i) {
                System.err.println(i.getMessage());
                checkValue = false;
            } catch (NumberFormatException n) {
                System.err.println("Bắt buộc là số");
                checkValue = false;
            }
        } while (!checkValue);

    }
}
