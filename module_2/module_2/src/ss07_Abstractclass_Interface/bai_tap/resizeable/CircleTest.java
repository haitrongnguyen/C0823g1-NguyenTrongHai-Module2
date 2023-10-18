package ss07_Abstractclass_Interface.bai_tap.resizeable;

import ss07_Abstractclass_Interface.bai_tap.resizeable.Circle;

public class CircleTest {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
//        Circle circle = new Circle(1);
//        System.out.println(circle.getArea());
//        circle.resize();
//        System.out.println(circle.getArea());
        Circle circle = new Circle(3.5);
        System.out.println("Pre-increase");
        System.out.println(circle.getArea());
        circle.resize(Math.random()+1);
        System.out.println("After-increase");
        System.out.println(circle.getArea());
    }
}
