package ss05_AccessModifier_Static.bai_tap.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * 3.14;
    }

    @Override
    public String toString() {
        return "TestCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
