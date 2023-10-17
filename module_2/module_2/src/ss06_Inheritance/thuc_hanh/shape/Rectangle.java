package ss06_Inheritance.thuc_hanh.shape;

public class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;
    Rectangle(){}
    Rectangle(double width,double length){
        this.length = length;
        this.width  = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;

    }

    @Override
    public String toString() {
        return "A Rectangle with width="+getWidth()+
                " and length="+getLength()+
                ", which is a subclass of "+super.toString();
    }
}
