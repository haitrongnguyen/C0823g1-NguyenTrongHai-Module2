package ss04_Class_Obj.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "Rectangle{" + "width: " + width + " height: " + height + " }";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width:");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter height:");
        double height = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(width, height);
        double area = rectangle.getArea();
        double perimeter = rectangle.getPerimeter();
        String display = rectangle.display();
        System.out.println("Your rectangle: " + display);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

}
