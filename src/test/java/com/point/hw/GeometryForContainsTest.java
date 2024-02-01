package com.point.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeometryForContainsTest {



    @ParameterizedTest
    @CsvSource(value = {
            "2/5/4/7                / 8/11",
            "10/6/9/5               / 111/107",
            "12.5 /5.5/14.5/7.5     / 0 /-7",

            "0 /0 /10 /10           / 100.5 /100.5"

    }, delimiter = '/')
    void isParallelForTrueTestNo1(double x1, double y1, double x2, double y2,
                                  double x, double y) {
        Geometry geometry = new Geometry();
        Line line1 = new Line(new Point(x1, y1), new Point(x2, y2));
        Point point = new Point(x, y);
        Assertions.assertTrue(geometry.contains(line1, point));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "2/5/4/7                / 2/6",
            "10/6/9/5               / 10/5",
            "12.5 /5.5/14.5/7.5     / 14.5 /5.5",

            "12.5 /5.5/14.5/7.5     / 14.5 /5.5"

    }, delimiter = '/')
    void isParallelForFalseTestNo2(double x1, double y1, double x2, double y2,
                                   double x, double y) {
        Geometry geometry = new Geometry();
        Line line1 = new Line(new Point(x1, y1), new Point(x2, y2));
        Point point = new Point(x, y);
        Assertions.assertFalse(geometry.contains(line1, point));
    }
}
