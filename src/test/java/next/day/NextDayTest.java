package next.day;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {


    @ParameterizedTest
    @CsvSource(value =
            {       // maxDay()
                    "4.3.2019  . 3.3.2019",   // 1v +  + nextDate ( day < maxDay )
                    "8.5.2018  . 7.5.2018",

                    "1.3.2008  . 29.2.2008", // + isLeapYear method TEST,   // 2v + nextDate ( day == maxDay )
                    "1.3.2012  . 29.2.2012", // + isLeapYear method TEST,

                    "1.3.2000  . 28.2.2000", //  checking the year of multiplicity 100
                    "1.3.2100  . 28.2.2100",
                    "1.3.1990  . 28.2.1990",

                    "1.3.2002  . 28.2.2002",   // 3v + nextDate ( day == maxDay )
                    "1.3.2002  . 28.2.2002",

                    "1.11.2007  . 31.10.2007",   // 4v + nextDate ( day == maxDay )
                    "1.9.2008  . 31.8.2008", // + isLeapYear method TEST,

                    "1.12.2015  . 30.11.2015",   // 5v + nextDate ( day == maxDay )
                    "1.9.2016  . 31.8.2016", // + isLeapYear method TEST,
                    "1.7.2017  . 30.6.2017",
                    "1.5.2018  . 30.4.2018",
                    "1.10.2018  . 30.9.2018",

                    // nextDate()
                    "26.2.2015 . 25.2.2015",  // nextDate ( day < maxDay )
                    "2.12.2011 . 1.12.2011",

                    "1.9.2022  . 31.8.2022",  // nextDate ( day == maxDay  )
                    "1.11.2018  . 31.10.2018",

                    "1.1.2011  . 31.12.2010", // nextDate ( day == maxDay && month == 12 )
                    "1.1.2016  . 31.12.2015",

            }, delimiter = '.')
    public void testNextDay(int day, int month, int year, int dayToMethod, int monthToMethod, int yearToMethod) {
        NextDay nextDay = new NextDay(dayToMethod, monthToMethod, yearToMethod);
        nextDay.nextDate();
        assertEquals(day, nextDay.getNextDay(), "day checker for (%s.%s.%s)".formatted(dayToMethod, monthToMethod, yearToMethod));
        assertEquals(month, nextDay.getNextMonth(), "day checker for (%s.%s.%s)".formatted(dayToMethod, monthToMethod, yearToMethod));
        assertEquals(year, nextDay.getNextYear(), "day checker for (%s.%s.%s)".formatted(dayToMethod, monthToMethod, yearToMethod));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1 31 2000",

            "2 28 1993",
            "2 29 1992",
            "2 29 2004",

            "3 31 1991",
            "4 30 1990",
            "5 31 1900",
            "6 30 2022",
            "7 31 2020",
            "8 31 1998",
            "9 30 1997",
            "10 31 1996",
            "11 30 1995",
            "12 31 1994"
    }, delimiter = ' ')
    public void testMaxDayOfMonth(int month, int day, int year) {
        NextDay nextDay = new NextDay(day, month, year);

        assertEquals(day, nextDay.maxDayOfMonth());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "2004 ",
            "1992",
            "1996",
            "2008",
            "1988",
            "2012",
            "2016",

    }, delimiter = ' ')
    public void testIsLeapYear(int year) {
        NextDay nextDay = new NextDay(1, 1, year);
        assertTrue(nextDay.isLeapYear());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "2003 ",
            "1993",
            "1995",
            "2000",
            "1983",
            "2011",
            "1900",

    }, delimiter = ' ')
    public void testIsNotLeapYear(int year) {
        NextDay nextDay = new NextDay(1, 1, year);
        assertFalse(nextDay.isLeapYear());
    }


    @ParameterizedTest
    @CsvSource(value = {
            "1.13.2020",
            "32.12.-2015",
            "0.12.2023",

            "-1.133.2020",
            "14.0.2011",
            "33.15.-2000"
    }, delimiter = '.')
    void testExpectedExceptionNextDate(int day, int month, int year) {
        Executable executable = () -> {
            NextDay nextDay = new NextDay(day, month, year);
            nextDay.nextDate();
        };

        Assertions.assertThrows(RuntimeException.class, executable);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "-2003",
            "-1993",
            "-1995",
            "-2000",
            "-1983",
            "-2011",
            "-1",
    })
    void testExpectedExceptionisLeapYear(int year) {
        Executable executable = () -> {
            NextDay nextDay = new NextDay(1, 3, year);
            nextDay.isLeapYear();
        };

        Assertions.assertThrows(RuntimeException.class, executable);
    }

}
