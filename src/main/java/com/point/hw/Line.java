package com.point.hw;

public class Line {

    private Point startPoint;
    private Point endPoint;

    public Line(double x1,double y1,double x2,double y2) {
        this.startPoint = new Point(x1,y1);
        this.endPoint = new Point(x2,y2);
    }

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }



    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

}
