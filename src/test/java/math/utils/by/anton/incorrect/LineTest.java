package math.utils.by.anton.incorrect;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import point.by.anton.incorrect.LineOld;
import point.by.anton.incorrect.Point;


import static org.junit.jupiter.api.Assertions.*;


class LineTest {


    @ParameterizedTest
    @CsvSource(value = {
            "2.2.3.3  .   6.6   ",
            "2.2.3.3  .   7.7   ",
            "2.2.3.3  .   1000.1000   ",
            "2.2.3.3  .   10.10   ",
    }, delimiter = '.')
    public void testPointIsInCoordinate(double x1, double y1, double x2, double y2, double X, double Y) {
        LineOld line3 = new LineOld(new Point( x1, y1), new Point(x2, y2));


        assertEquals(new Point(), new Point());
//        assertNotEquals();
        assertTrue(!new Point().equals(new Point()));
        assertFalse(new Point().equals(new Point()));
//        assertTrue(line3.isPointOnTheLine(X, Y));

    }

    @ParameterizedTest
    @CsvSource(value = {
            "2.2.5.3  .   6.6   ",
            "2.2.3.6  .   7.7   ",
            "2.2.3.4  .   1000.1000   ",
            "2.2.231.9  .   32.10   ",
    }, delimiter = '.')
    public void testPointIsNOTInCoordinate(double x1, double y1, double x2, double y2, double X, double Y) {
        LineOld line3 = new LineOld(new Point( x1, y1), new Point(x2, y2));


//        assertFalse(line3.isPointOnTheLine(X, Y));

    }

    @ParameterizedTest
    @CsvSource(value = {
            "2.2.2.3  .   6.6   ",
            "3.2.3.6  .   7.7   ",
            "10000.2.10000.4  .   1000.1000   ",
            "999.2.999.9  .   32.10   ",
    }, delimiter = '.')
    public void testToThrowsInCanonicalEquationOfTheLine(double x1, double y1, double x2, double y2, double X, double Y) {
        LineOld line3 = new LineOld(new Point( x1, y1), new Point(x2, y2));


//        assertThrows(RuntimeException.class,
//                () -> line3.isPointOnTheLine(X, Y) );

    }


}