package ss06_Inheritance.bai_tap.circle;

public class Circle {
    private double radius;
    private String color;

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

    public Circle() {
        this.radius = 1;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle has " +
                "radius= " + getRadius() +
                ", color= " + getColor() +
                ",Circle area = " + getArea();
    }
}
