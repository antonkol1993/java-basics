package com.point.hw;

public class Line {

    private Point startLine;
    private Point endLine;

    public Line(double x1,double y1,double x2,double y2) {
        this.startLine = new Point(x1,y1);
        this.endLine = new Point(x2,y2);
    }

    public Line(Point startLine, Point endLine) {
        this.startLine = startLine;
        this.endLine = endLine;
    }


}
