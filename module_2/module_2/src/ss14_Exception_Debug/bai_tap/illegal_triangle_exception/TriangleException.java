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
    private static void isInValidNumber(int a) throws IllegalTriangleException {
        if (a <= 0) {
            throw new IllegalTriangleException("Độ dài cạnh phải lớn hơn 0");
        }
    }

    private static void isInValidLength(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại");

        }
    }

    public static void main(String[] args) throws IllegalTriangleException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào cạnh thứ nhất của tam giác");
            int a = Integer.parseInt(scanner.nextLine());
            isInValidNumber(a);
            System.out.println("Nhập vào cạnh thứ hai của tam giác");
            int b = Integer.parseInt(scanner.nextLine());
            isInValidNumber(b);
            System.out.println("Nhập vào cạnh thứ ba của tam giác");
            int c = Integer.parseInt(scanner.nextLine());
            isInValidNumber(c);
            isInValidLength(a, b, c);
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }catch (NumberFormatException e){
            System.err.println("Bắt buộc là số");;
        }

    }
}
