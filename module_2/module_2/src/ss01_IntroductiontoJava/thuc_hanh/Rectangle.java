package ss01_IntroductiontoJava.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width, height, area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        width = scanner.nextFloat();
        System.out.println("Nhập chiều cao: ");
        height = scanner.nextFloat();
        area = width * height;
        System.out.print("Diện tích là: " + area);

    }
}
