package ss07_Abstractclass_Interface.bai_tap.resizeable;

import javax.xml.soap.SOAPElementFactory;

public class ResizeableTest {
    public static void main(String[] args) {
//        Shape[]shapes = new Shape[2];
//        shapes[0] = new Circle(2);
//        shapes[1] = new Rectangle(2,3);
//        for (Shape shape:shapes){
//
//            if (shape instanceof Circle){
//                System.out.println("Pre-increase");
//                System.out.println(((Circle) shape).getArea());
//                ((Circle) shape).resize(100);
//                System.out.println("After-increase");
//                System.out.println(((Circle) shape).getArea());
//
//            }else if (shape instanceof Rectangle){
//                System.out.println("Pre-increase");
//                System.out.println(((Rectangle) shape).getArea());
//                ((Rectangle) shape).resize(100);
//                System.out.println("After-increase");
//                System.out.println(((Rectangle) shape).getArea());
//
//            }
//        }
        double percent = Math.random() + 1;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2,3);
        shapes[2] = new Square(2);
        for (Shape shape : shapes) {
            System.out.println("Pre-increase");
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("Area Circle: " + circle.getArea());
                System.out.println("After-increase");
                circle.resize(percent);
                System.out.println("Area Circle: " + circle.getArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Area Rectangle: " + rectangle.getArea());
                System.out.println("After-increase");
                rectangle.resize(percent);
                System.out.println("Area Rectangle: " + rectangle.getArea());
            } else {
                Square square = (Square) shape;
                System.out.println("Area Square: " + square.getArea());
                System.out.println("After-increase");
                square.resize(percent);
                System.out.println("Area Square: " + square.getArea());
            }

        }
    }
}
