package com.point.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class GeometryForCrossPointTest {

    @ParameterizedTest
    @CsvSource(value = {
            "2/5/4/7            / 2/5/4/7",
            "10/6/9/5          / 10/6/9/5",
            "12.5 /5.5/14.5/7.5 / 12.5 /5.5/14.5/7.5"
    }, delimiter = '/')
    void isParallelForExceptExceptionsTestNo1(double x1, double y1, double x2, double y2,
                                              double b1, double c1, double b2, double c2) {

        Geometry geometry = new Geometry();
        Line line1 = new Line(new Point(x1, y1), new Point(x2, y2));
        Line line2 = new Line(new Point(b1, c1), new Point(b2, c2));
        Assertions.assertThrows(RuntimeException.class, () -> geometry.crossPoint(line1, line2));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "2/5/4/7            / 1/10/3/12",
            "5/3/4/2          / 10/6/9/5",
            "12.5 /-5.5/14.5/-7.5 / -0.5 /5.5/1.5/3.5"
    }, delimiter = '/')
    void isParallelForNullTestNo2(double x1, double y1, double x2, double y2,
                                              double b1, double c1, double b2, double c2) {

        Geometry geometry = new Geometry();
        Line line1 = new Line(new Point(x1, y1), new Point(x2, y2));
        Line line2 = new Line(new Point(b1, c1), new Point(b2, c2));
        Assertions.assertNull(geometry.crossPoint(line1, line2));
    }
    @ParameterizedTest
    @CsvSource(value = {
            "2/4/5/7            / -2/-4/-3/-3  / -4/-2",
            "5/5/4/2          / -10/-6/-9/5 / -14.25 /-52.75"
    }, delimiter = '/')
    void isParallelForAssertTestNo3(double x1, double y1, double x2, double y2,
                                  double b1, double c1, double b2, double c2,
                                  double expectX,double expectY) {
        Point expectPoint = new Point(expectX, expectY);
        Geometry geometry = new Geometry();
        Line line1 = new Line(new Point(x1, y1), new Point(x2, y2));
        Line line2 = new Line(new Point(b1, c1), new Point(b2, c2));
        Assertions.assertEquals(expectPoint, geometry.crossPoint(line1, line2));
    }


    @ParameterizedTest
    @MethodSource("provideDataSet")
    void isParallelForAssertTestNo4(Line line1, Line line2, Point expectedPoint) {
        Assertions.assertEquals(expectedPoint, new Geometry().crossPoint(line1, line2));
    }

    private static Stream<Arguments> provideDataSet() {
        return Stream.of(
                Arguments.of(
                        new Line(new Point(2, 4), new Point(5, 7)),
                        new Line(new Point(-2, -4), new Point(-3, -3)),
                        new Point(-4, -2)),

                Arguments.of(
                        new Line(new Point(5, 5), new Point(4, 2)),
                        new Line(new Point(-10, -6), new Point(-9, 5)),
                        new Point(-14.25, -52.75))

        );
    }

}
