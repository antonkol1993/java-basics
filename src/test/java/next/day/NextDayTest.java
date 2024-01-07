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
            {       // maxDay()
                    "4.3.2019  . 3.3.2019 . false ",   // 1v +  + nextDate ( day < maxDay )
                    "8.5.2018  . 7.5.2018 . false",

                    "1.3.2008  . 29.2.2008 . true", // + isLeapYear method TEST,   // 2v + nextDate ( day == maxDay )
                    "1.3.2012  . 29.2.2012 . true", // + isLeapYear method TEST,

                    "1.3.2000  . 28.2.2000 . false", //  checking the year of multiplicity 100
                    "1.3.2100  . 28.2.2100 . false",
                    "1.3.1990  . 28.2.1990 . false",

                    "1.3.2002  . 28.2.2002 . false",   // 3v + nextDate ( day == maxDay )
                    "1.3.2002  . 28.2.2002 . false",

                    "1.11.2007  . 31.10.2007 . false",   // 4v + nextDate ( day == maxDay )
                    "1.9.2008  . 31.8.2008 . true", // + isLeapYear method TEST,

                    "1.12.2015  . 30.11.2015 . false",   // 5v + nextDate ( day == maxDay )
                    "1.9.2016  . 31.8.2016 . true", // + isLeapYear method TEST,
                    "1.7.2017  . 30.6.2017 . false",
                    "1.5.2018  . 30.4.2018 . false",
                    "1.10.2018  . 30.9.2018 . false",

                    // nextDate()
                    "26.2.2015 . 25.2.2015 . false",  // nextDate ( day < maxDay )
                    "2.12.2011 . 1.12.2011 . false",

                    "1.9.2022  . 31.8.2022 . false",  // nextDate ( day == maxDay  )
                    "1.11.2018  . 31.10.2018 . false",

                    "1.1.2011  . 31.12.2010 . false", // nextDate ( day == maxDay && month == 12 )
                    "1.1.2016  . 31.12.2015 . false",

            }, delimiter = '.')
    public void testNextDay(int day, int month, int year, int dayToMethod, int monthToMethod, int yearToMethod, boolean isLeapYear) {
        NextDay nextDay = new NextDay(dayToMethod, monthToMethod, yearToMethod);
        nextDay.nextDate();


        assertEquals(isLeapYear, nextDay.isLeapYear());

        assertEquals(day, nextDay.getNextDay(), "day checker for (%s.%s.%s)".formatted(dayToMethod, monthToMethod, yearToMethod));
        assertEquals(month, nextDay.getNextMonth(), "day checker for (%s.%s.%s)".formatted(dayToMethod, monthToMethod, yearToMethod));
        assertEquals(year, nextDay.getNextYear(), "day checker for (%s.%s.%s)".formatted(dayToMethod, monthToMethod, yearToMethod));
    }

    public void testMaxDayOfMonth() {}

    public void testIsLeapYear() {}
    public void testIsNotLeapYear() {}
//    @ParameterizedTest
//    @CsvSource (value = {
//            "1.12.-2020 . 31.12.-2015", // 1v  - Year < 0 ;
////            "1.12.-1",
////
////            "1.13.2020",    // month < 0 || month > 12
////            "1.15.2011",
////            "1.-5.2000"
//
//
//
//    }, delimiter = '.')
//    void testExpectedException(int day, int month,int year) {
//        Executable executable = () -> {
//            NextDay nextDay = new NextDay(1, 12, -2020);
//
//        };
//
//        Assertions.assertThrows(RuntimeException.class, executable);
//    }



//    void testExpectedException(int day, int month,int year) {
//        Executable executable = () -> {
//            NextDay nextDay = new NextDay(day, month, year);
//            nextDay.nextDate();
//
//        };
//
//        Assertions.assertThrows(RuntimeException.class, executable);
//    }

}
