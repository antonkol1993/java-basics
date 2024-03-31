package com.point.hw;

import java.util.Comparator;

public class CustomPointDistanceComparator implements Comparator<Point> {

    private Point startPoint;

    public CustomPointDistanceComparator() {
        this.startPoint = new Point(0,0);
    }

    public CustomPointDistanceComparator(Point startPoint) {
        this.startPoint = startPoint;
    }

    @Override
    public int compare(Point o1, Point o2) {
        return 0;
    }

    private double distance(Point p) {
        double x = p.getX() - startPoint.getX();
        double y = p.getY() - startPoint.getY();

        return Math.sqrt(x * x  + y * y);
    }
}
