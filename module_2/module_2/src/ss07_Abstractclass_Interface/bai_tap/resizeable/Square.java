package ss07_Abstractclass_Interface.bai_tap.resizeable;

import ss07_Abstractclass_Interface.bai_tap.colorable.Colorable;

public class Square extends Shape implements Resizeable, Colorable {


    private double side;

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void resize(double percent) {
        setSide(side*percent);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
