package next.day;/*
Напишите программу расчета даты следующего дня введя 3 числа - день, месяц и год.

пример:
Введите день: 15
Введите месяц: 3
Введите год: 2003
Следующий день: 16 3 2003
 */

import java.util.*;

public class NextDay {

    private int day;
    private int month;
    private int year;

    public NextDay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }

    public void nextDay() {
        if (year < 0) {
            throw new RuntimeException();
        }
        if (month <= 0 | month > 12) {
            throw new RuntimeException();
        }


        //////////////////////////////////// большие месяцы

        if (month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
            if (day <= 0 | day > 31) {
                throw new RuntimeException("We don't have this date");
            } else if (day < 31) {
                day++;
            } else {
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }

        }   ////////////////////////////////////////// маленькие месяцы
        else {
            if (day <= 0 | day > 30) {
                throw new RuntimeException("We don't have this date");
            } else if (day < 30) {
                day++;
            } else {
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }

            if (month == 2 & year % 4 == 0) {
                if (day <= 0 | day > 29) {
                    throw new RuntimeException();
                } else if (day < 29) {
                    day++;
                } else {
                    day = 1;
                    month++;
                }
            } else if (month == 2 & year % 4 != 0) {
                if (day <= 0 | day > 28) {
                    throw new RuntimeException();
                } else if (day < 28) {
                    day++;
                } else {
                    day = 1;
                    month++;
                }
            } else {
                day += 1;
            }
        }
    }
}


