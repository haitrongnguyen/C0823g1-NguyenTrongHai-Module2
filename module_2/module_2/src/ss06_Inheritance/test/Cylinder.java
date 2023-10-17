package ss06_Inheritance.test;

public class Cylinder extends Circle {
    private double height;
    public double getAreaCylinder(){
        return super.getArea()*this.height;
    }
    Cylinder(){}
    public Cylinder(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder with height = "+getHeight()+
                ", area: "+getAreaCylinder()+
                " which bottom of the "+super.toString();
    }
}
