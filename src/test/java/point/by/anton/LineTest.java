package point.by.anton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LineTest {
//    @ParameterizedTest
//    @MethodSource("providePointDataset")
//    public void lineBooleanTest(int startX, int startY, int endX, int endY, int startX2, int startY2, int endX2, int endY2, boolean inference) {
//        Line line1 = new Line(new Point(startX, startY), new Point(endX, endY));
//        Line line2 = new Line(new Point(startX2, startY2), new Point(endX2, endY2));
//        Assertions.assertEquals(inference, Line.compare(line1, line2));
//
//    }
//    private static Stream<Arguments> providePointDataset() {
//        return Stream.of(
//
//                Arguments.of(2, 3, 4, 5, 6, 7, 8, 9, true),
//                Arguments.of(2, 5, 9, 2, 4, 9, 1, 0, false),
//                Arguments.of(2, 3, 4, 5, 0, 0, 5, 5, false),
//                Arguments.of(2, 3, 8, 5, 0, 0, 2, 2, true)
//
//        );
//    }



//    @ParameterizedTest
//    @CsvSource(value = {
//            "4,5,5",
//            "7,9,10",
//            "2,7,6.082762530298219"
//    })
//    void lineLengthTest(int endX, int endY, double resultInLength) {
//        Line line = new Line(new Point(endX, endY));
//        Assertions.assertEquals(resultInLength, line.length());
//    }


}