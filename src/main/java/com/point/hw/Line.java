package com.point.hw;

public class Line {

    private Point startPoint;
    private Point endPoint;

    public Line(double x1, double y1, double x2, double y2) {
        this.startPoint = new Point(x1, y1);
        this.endPoint = new Point(x2, y2);
    }

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }


    @Override
    public boolean equals(Object o) {
        Geometry geometry = new Geometry();
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Line comeLine = (Line) o;
        return geometry.K(this) == geometry.K(comeLine) && geometry.B(this) == geometry.B(comeLine);
    }

    @Override
    public int hashCode() {
        int result = startPoint != null ? startPoint.hashCode() : 0;
        result = 31 * result + (endPoint != null ? endPoint.hashCode() : 0);
        return result;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

}
