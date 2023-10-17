package ss06_Inheritance.bai_tap.circle;

public class Cylinder extends Circle {
    private double height;

    public double getCylindricalVolume() {
        return super.getArea() * height;
    }

    public Cylinder() {
        this.height = 1;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder has " +
                "height = " + height +
                " with bottom surface area is " + super.toString() +
                ", Cylinder volume = " + getCylindricalVolume() +
                '}'
                ;
    }
}
