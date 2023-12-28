package by.anton.app;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;


import java.util.Arrays;
import java.util.List;

import static by.anton.app.MathUtils.fibonacci;

public class MathUtilsTest{



    //    @BeforeAll
//    public static void beforeAll() {
//
//    }
//
//    @BeforeEach
//    public void before() {
//
//    }

    private static int index;
    private long result;

        @Disabled

    @Test
    public void testFibonacci() {

        MathUtils mathUtils = new MathUtils(8, 7);
        result = mathUtils.getResult();
        index = mathUtils.getIndex();
        Assertions.assertEquals(result, fibonacci(index));

        MathUtils mathUtils2 = new MathUtils(13, 8);
        result = mathUtils2.getResult();
        index = mathUtils2.getIndex();
        Assertions.assertEquals(result, fibonacci(index));


        MathUtils mathUtils3 = new MathUtils(89, 12);
        result = mathUtils3.getResult();
        index = mathUtils3.getIndex();
        Assertions.assertEquals(result, fibonacci(index));



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
// void testWithParameters(int aaaa, long bbbb) {

//        index = aaaa;
//    result = bbbb;
//    Assertions.assertEquals(5L, 5L);

//        //test code
//    }


//        @Disabled
//    @Test
//    public void testFactorial() {
//        Assertions.assertEquals(1L, factorial(1));
//        Assertions.assertEquals(10L, factorial(4));
//
//    }


}
