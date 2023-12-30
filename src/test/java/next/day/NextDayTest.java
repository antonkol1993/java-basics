package next.day;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDayTest {


    @ParameterizedTest
    @CsvSource(value =
            {
                    "3.3.18",
                    "29.2.12",
                    "28.2.115",
                    "31.12.11"

            }, delimiter = '.')
    void nextDayTest(int day, int month, int year) {
        NextDay nextDay = new NextDay(day, month, year);
        int[] dateTest = nextDay.nextDate(day, month, year);

        assertEquals(Arrays.toString(dateTest), Arrays.toString(nextDay.nextDate(day, month, year)));
        System.out.println(nextDay.getDay() + " " + nextDay.getMonth() + " " + nextDay.getYear());
    }

}
