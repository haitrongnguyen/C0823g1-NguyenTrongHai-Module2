package ss06_Inheritance.bai_tap.point;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(0,0);
        System.out.println(point1);
        MovablePoint point2 = new MovablePoint(0,0,1,1);
        System.out.println(point2);
        point2.move();
        System.out.println(point2.move());
        System.out.println(point2);
    }
}
