package math.utils.by.anton;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static math.utils.by.anton.MathUtils.fibonacci;
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
    }

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
                Arguments.of(3L, 5),
                Arguments.of(5L, 6)
        );
    }


    @ParameterizedTest
    @MethodSource("provideFactorialDataSet")
    void testFactorialMethod(int index, Long result) {
        assertEquals(result, MathUtils.factorial(index));
    }

    private static Stream<Arguments> provideFactorialDataSet() {
        return Stream.of(
                Arguments.of(5, 15L),
                Arguments.of(6, 21L),
                Arguments.of(8, 36L),
                Arguments.of(9, 45L),
                Arguments.of(2, 3L)
        );
    }

}
