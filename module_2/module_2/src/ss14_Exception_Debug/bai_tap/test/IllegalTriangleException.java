package ss14_Exception_Debug.bai_tap.test;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {

    private IllegalTriangleException(String s) {
        super(s);
    }

    private static void validate(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Độ dài cạnh của tam giác không được âm");
        }
        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new IllegalTriangleException("Đây không phải độ dài 3 cạnh tam giác");
        }
    }

    public static void main(String[] args) throws IllegalTriangleException {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập cạnh thứ nhất");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh thứ hai");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh thứ ba");
            int c = Integer.parseInt(scanner.nextLine());
        try {
            validate(a, b, c);
        }catch (IllegalTriangleException m){
            System.out.println("Đã xảy ra ngoại lệ: "+m);
        }

    }
}
