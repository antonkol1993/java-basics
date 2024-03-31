package com.point.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        Point line1 = new Point(5, 5);
        List<Point> pointsList = getPoints(line1);

//        Line line2 = new Line(new Point(4, 4), new Point(8, 8));
        Point point = new Point(111, 112);


        ComparatorPoint comparatorPoint = new ComparatorPoint();
        TreeSet<Point> points = new TreeSet<>(comparatorPoint);
        points.addAll(pointsList);
        System.out.println(points);

        ComparatorByDistance comparatorByDistance = new ComparatorByDistance();
        comparatorByDistance.setStartX(-4533);
        comparatorByDistance.setStartY(3);
        points = new TreeSet<>(comparatorByDistance);
        points.addAll(pointsList);
        System.out.println(points);


    }


    private static List<Point> getPoints(Point line1) {
        Point line2 = new Point(5, 5);
        Point line3 = new Point(5, 6);
        Point line4 = new Point(0, 2);
        Point line5 = new Point(110, 2);
        Point line6 = new Point(20, 2);
        Point line7 = new Point(6, 43322);
        Point line8 = new Point(-4570, 1);
        Point line9 = new Point(-4534, 4);
        List<Point> pointsList = new ArrayList<>();
        pointsList = List.of(
                line1,
          line2,
          line3,
          line4,
          line5,
          line6,
          line7,
          line8,
          line9
        );
        return pointsList;
    }


}
