package ss05_AccessModifier_Static.bai_tap;

public class TestCircle {
    private double radius = 1.0;
    private String color = "red";
    TestCircle(){};
    TestCircle(double radius){
        this.radius = radius;
    }

    private double getRadius() {
        return radius;
    }

   private double getArea() {
        return Math.pow(this.radius,2)*3.14;
    }

    @Override
    public String toString() {
        return "TestCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
