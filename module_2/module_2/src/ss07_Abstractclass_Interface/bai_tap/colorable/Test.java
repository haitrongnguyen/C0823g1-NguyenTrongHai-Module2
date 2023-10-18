package ss07_Abstractclass_Interface.bai_tap.colorable;

import ss07_Abstractclass_Interface.bai_tap.resizeable.Circle;
import ss07_Abstractclass_Interface.bai_tap.resizeable.Rectangle;
import ss07_Abstractclass_Interface.bai_tap.resizeable.Shape;
import ss07_Abstractclass_Interface.bai_tap.resizeable.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2, 3);
        shapes[2] = new Square(2);
        shapes[3] = new Circle(3);
        shapes[4] = new Square(3);
        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                Colorable colorable = (Colorable) shape;
                colorable.howToColor();
            } else if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("CircleArea: " + circle.getArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("RectangleArea: " + rectangle.getArea());
            }

        }
    }
}
