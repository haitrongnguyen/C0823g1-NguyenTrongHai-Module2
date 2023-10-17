package ss06_Inheritance.bai_tap.tritangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Nhập độ dài cạnh 1: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        triangle.setSide1(side1);
        System.out.println("Nhập độ dài cạnh 2: ");
        double side2 = Double.parseDouble(scanner.nextLine());
        triangle.setSide2(side2);
        System.out.println("Nhập độ dài cạnh 3: ");
        double side3 = Double.parseDouble(scanner.nextLine());
        triangle.setSide3(side3);
        System.out.println("Nhập màu sắc: ");
        String color = scanner.nextLine();
        triangle.setColor(color);
        System.out.println(triangle);
        System.out.println("Area: " + triangle.getArea() + " Perimeter: " + triangle.getPerimeter() + " Color " + triangle.getColor());
    }
}
