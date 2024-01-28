package point.by.anton;

import java.util.Objects;

public class Line3D {
    private final Point3D startPoint;
    private final Point3D endPoint;

    public Line3D(Point3D startPoint, Point3D endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line3D(double x1, double y1, double z1, double x2, double y2, double z2) {
        this.startPoint = new Point3D(x1, y1, z1);
        this.endPoint = new Point3D(x2, y2, z2);
    }

    public Point3D getStartPoint() {
        return startPoint;
    }

    public Point3D getEndPoint() {
        return endPoint;
    }

    @Override
    public String toString() {
        return "Line3D{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }

    //todo equals and hashcode
}
