package by.anton.app;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static by.anton.app.MathUtils.fibonacci;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @Test
    public void testFibonacciOld() {

        MathUtils mathUtils = new MathUtils(8, 7);
        long result = mathUtils.getResult();
        int index = mathUtils.getIndex();
        assertEquals(result, fibonacci(index));

        MathUtils mathUtils2 = new MathUtils(13, 8);
        result = mathUtils2.getResult();
        index = mathUtils2.getIndex();
        assertEquals(result, fibonacci(index));


        MathUtils mathUtils3 = new MathUtils(89, 12);
        result = mathUtils3.getResult();
        index = mathUtils3.getIndex();
        assertEquals(result, fibonacci(index));


//            for (int i = 0; i < 90; i++) {
//
//            }
//                Arrays.asList(new Object[][] {
//                { 5, 3L },
//                { 6, 5L },
//                { 11, 55L },
//                { 12, 89L },
//                { 13, 145L },
//        });


    }

//@ParameterizedTest
//@CsvSource (value = Arrays.asList(new Object[][]{
//        {5, 3L},
//        {6, 5L},
//        {11, 55L},
//        {12, 89L},
//        {13, 145L},
//})

    @ParameterizedTest
    @CsvSource(value = {
            "3:5",
            "5:6",
            "55:11",
            "89:12",
            "144:13"
    }, delimiter = ':')
    void testFibonacci(long expected, int index) {
        assertEquals(expected, fibonacci(index));
    }

    @ParameterizedTest
    @MethodSource("provideFibonacciDataSet")
    void testFibonacciWithMethod(long expected, int index) {
        assertEquals(expected, fibonacci(index));
    }

    private static Stream<Arguments> provideFibonacciDataSet() {
        return Stream.of(
                Arguments.of (3L, 5),
                Arguments.of (5L, 6)
        );
    }

}
