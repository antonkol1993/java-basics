package next.day;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDayTest {


    @ParameterizedTest
    @CsvSource(value =
            {
                    "3.3.18   . 2.3.18",
                    "1.3.12  . 29.2.12",
                    "1.3.115 . 28.2.115",
                    "1.1.12 . 31.12.11"

            }, delimiter = '.')
    void nextDayTest(int day, int month, int year, int dayToMethod, int monthToMethod, int yearToMethod) {
        NextDay nextDay = new NextDay(day, month, year);
        nextDay.nextDay();

        assertEquals(day, nextDay.getDay(), "day checker for %s/%s/%s".formatted(dayToMethod, monthToMethod, yearToMethod));
        assertEquals(month, nextDay.getMonth());
        assertEquals(year, nextDay.getYear());
//        assertEquals(Arrays.toString(dateTest), Arrays.toString(nextDay.nextDate(dayToMethod, monthToMethod, yearToMethod)));
//        System.out.println(nextDay.getDay() + " " + nextDay.getMonth() + " " + nextDay.getYear());
    }

    @Test
    void testExpectedException() {
        Executable executable = () -> {
            NextDay nextDay = new NextDay(1, 13, 2000);
            nextDay.nextDay();
        };

        Assertions.assertThrows(RuntimeException.class, executable);
    }
}
