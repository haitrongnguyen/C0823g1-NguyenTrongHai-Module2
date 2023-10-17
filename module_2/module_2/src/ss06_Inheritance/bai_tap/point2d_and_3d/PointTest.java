package ss06_Inheritance.bai_tap.point2d_and_3d;

import java.util.Arrays;

public class PointTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(5, 4);
        System.out.println(point2D);
        point2D.setXY(1, 2);
        System.out.println(point2D);
        point2D.setX(2);
        point2D.setY(4);
        System.out.println(point2D);
        Point3D point3D = new Point3D(1, 2, 5);
        System.out.println(point3D);
        Point3D point3D1 = new Point3D();
        point3D1.setX(1);
        point3D1.setY(2);
        point3D1.setZ(3);
        point3D1.setXYZ(3, 4, 5);
        System.out.println(point3D1);
        float[] result = point3D1.getXYZ();
        System.out.println(Arrays.toString(result));
        System.out.println(point3D1.getZ() + "");
        System.out.println(point3D1.getX() + "");
        Point3D point3D2 = new Point3D(1, 2, 3);
        System.out.println(point3D2);
    }


}
