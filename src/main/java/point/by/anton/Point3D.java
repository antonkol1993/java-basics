package point.by.anton;

public class Point3D extends Point {

    private double z;

    public Point3D() {
        this(0d,0,0);
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(int x, int y, int z) {

    }

    public double getZ() {
        return z;
    }


}

