package ss06_Inheritance.bai_tap.circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "blue");
        System.out.println(circle);
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Cylinder cylinder = new Cylinder(4, 5, "yellow");
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
    }
}
