package next.day;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class DateUtilsTest {

    void test(DateState expected, DateState initial) {
        DateState actual = DateUtils.calculateNextDay(initial);
        Assertions.assertEquals(expected, actual);

//        boolean equals = expected.equals(actual);
    }
}
