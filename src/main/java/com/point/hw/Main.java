package com.point.hw;

public class Main {

    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        Line line1 = new Line(new Point(5, 5), new Point(6, 6));
        Line line2 = new Line(new Point(5, 5), new Point(8, 8));
        Line line3 = new Line(new Point(5, 6), new Point(7, 8));
        Line line4 = new Line(new Point(0, 2), new Point(2, 4));
//        Line line2 = new Line(new Point(4, 4), new Point(8, 8));
        Point point = new Point(111, 112);
        System.out.println(geometry.contains(line3, point));


//        Point parallel = geometry.isParallel(null, null);
    }
}
