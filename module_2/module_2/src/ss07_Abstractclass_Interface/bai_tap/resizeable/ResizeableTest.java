package ss07_Abstractclass_Interface.bai_tap.resizeable;

import javax.xml.soap.SOAPElementFactory;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[]shapes = new Shape[2];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2,3);
        for (Shape shape:shapes){

            if (shape instanceof Circle){
                System.out.println("Pre-increase");
                System.out.println(((Circle) shape).getArea());
                ((Circle) shape).resize(100);
                System.out.println("After-increase");
                System.out.println(((Circle) shape).getArea());

            }else if (shape instanceof Rectangle){
                System.out.println("Pre-increase");
                System.out.println(((Rectangle) shape).getArea());
                ((Rectangle) shape).resize(100);
                System.out.println("After-increase");
                System.out.println(((Rectangle) shape).getArea());

            }
        }
    }
}
