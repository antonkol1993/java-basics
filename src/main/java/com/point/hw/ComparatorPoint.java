package com.point.hw;

import java.util.Comparator;

public class ComparatorPoint implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {

        int compare = Double.compare(o1.getX() + o1.getY(), o2.getX() + o2.getY());
        return compare;
    }
}
