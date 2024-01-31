package com.point.hw;

public class Main {

    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        Line line1 = new Line(new Point(5, 5), new Point(4, 2));
        Line line2 = new Line(new Point(-10, -6), new Point(-9, 5));

        System.out.println(geometry.crossPoint(line2, line1));


        Point point = new Point(-14.25, -52.75);
        System.out.println(point.equals(geometry.crossPoint(line1,line2)));
        System.out.println(point);

//        Point parallel = geometry.isParallel(null, null);
    }
}
