package by.anton.app;


import next.day.NextDay;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayTest {


    @ParameterizedTest
    @CsvSource(value =
            {
                    "3.3.18",
                    "4.5.12",
                    "1.7.10",
                    "31.12.11"

            }, delimiter = '.')
    void nextDayTest(int day, int month, int year) {
        NextDay nextDay = new NextDay(day,month,year);
//        nextDay.nextDate(nextDay.nextDay(day), nextDay.nextMonth(month), nextDay.nextYear(year));

        int[] dateTest = {day, month, year };
        dateTest = nextDay.nextDate(day, month, year);
        assertEquals(Arrays.toString(dateTest), Arrays.toString(nextDay.nextDate(day,month,year)));
//        System.out.println(Arrays.toString(nextDay.nextDate(31,12,23)));


//                System.out.println(nextDay.getDay() + " " + nextDay.nextMonth(month) + " " + nextDay.nextYear(year));
//            assertEquals(day, nextDay.nextDay(day, month, year));









    }


}
