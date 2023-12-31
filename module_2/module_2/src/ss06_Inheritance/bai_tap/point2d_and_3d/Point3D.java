package ss06_Inheritance.bai_tap.point2d_and_3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        setZ(z);
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
