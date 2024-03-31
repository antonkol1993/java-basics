package com.point.hw;

import java.util.Comparator;

public class ComparatorByDistance implements Comparator<Point> {

    private int startX = 0;
    private int startY = 0;


    private double distance(Point o) {
        double length = startY - o.getY();
        double breath = startX - o.getX();

        return Math.sqrt(Math.pow(length, 2) + Math.pow(breath, 2));
    }

    @Override
    public int compare(Point o1, Point o2) {

        return (int) (distance(o1) - distance(o2));
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }
}
