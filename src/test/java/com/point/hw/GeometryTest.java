package com.point.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeometryTest {
    @ParameterizedTest
    @CsvSource(value = {
            "2/5/4/7            / 2/5/6/9",
            "10/6/9/5          / 10/5/20/15",
            "12.5 /5.5/14.5/7.5 / 14.5 /5.5/18.5/9.5"

    }, delimiter = '/')
    void isParallelForTrueTestNo1(double x1, double y1, double x2, double y2,
                                  double b1, double c1, double b2, double c2) {
        Geometry geometry = new Geometry();
        Line line1 = new Line(new Point(x1, y1), new Point(x2, y2));
        Line line2 = new Line(new Point(b1, c1), new Point(b2, c2));
        Assertions.assertTrue(geometry.isParallel(line1, line2));

    }

    @ParameterizedTest
    @CsvSource(value = {
            "2/5/4/8            / 2/5/6/9",
            "10/6/9/23          / 10/5/560/15",
            "12.5 /5.5/14.5/7.5 / 14.5 /5.0/18.5/9.5"

    }, delimiter = '/')
    void isParallelForFalseTestNo2(double x1, double y1, double x2, double y2,
                                   double b1, double c1, double b2, double c2) {
        Geometry geometry = new Geometry();
        Line line1 = new Line(new Point(x1, y1), new Point(x2, y2));
        Line line2 = new Line(new Point(b1, c1), new Point(b2, c2));
        Assertions.assertFalse(geometry.isParallel(line1, line2));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "2/5/2/5            / 2/9/2/9",
            "10/23/10/23         / 10/15/10/15",
            "12.5 /7.5/14.5/7.5 / 18.5 /9.5/18.5/9.5",
            "0/ 0/ 1/ 2         / 0 / 0/ 0/ 0"

    }, delimiter = '/')
    void isParallelForFalseTestNo3(double x1, double y1, double x2, double y2,
                                   double b1, double c1, double b2, double c2) {
        Geometry geometry = new Geometry();
        Line line1 = new Line(new Point(x1, y1), new Point(x2, y2));
        Line line2 = new Line(new Point(b1, c1), new Point(b2, c2));
        Assertions.assertThrows(RuntimeException.class,
                () -> geometry.isParallel(line1,line2) );
    }


}
