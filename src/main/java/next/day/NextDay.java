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

    public NextDay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private int day;
    private int month;
    private int year;


    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }

    public int nextDay(int day2, int month2, int year2) {
        this.day = day2;
        this.month = month2;
        this.year = year2;

        if (year < 0) {
            return 0;
        }
        if (month <= 0 | month > 12) {
            return 0;
        }


        //////////////////////////////////// большие месяцы

        if (month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
            if (day <= 0 | day > 31) {
                System.out.println("We don't have this date ");
                return 0;
            } else if (day < 31) {
                day2++;
            } else {
                day2 = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }

        }   ////////////////////////////////////////// маленькие месяцы
        else {
            if (day <= 0 | day > 30) {
                System.out.println("We don't have this date ");
                return 0;
            } else if (day < 30) {
                day2++;
            } else {
                day2 = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }

            if (month == 2 & year % 4 == 0) {
                if (day <= 0 | day > 29) {
                    return 0;
                } else if (day < 29) {
                    day2++;
                } else {
                    day2 = 1;
                    month++;
                }
            } else if (month == 2 & year % 4 != 0) {
                if (day <= 0 | day > 28) {
                    return 0;
                } else if (day < 28) {
                    day2++;
                } else {
                    day2 = 1;
                    month++;
                }
            } else {
                day2 += 1;
            }
        }
        this.day = day2;
        return this.day;

    }

    public int nextMonth(int month) {

        this.month = month;
        return this.month;
    }

    public int nextYear(int year) {


        this.year = year;
        return this.year;
    }

    public int[] nextDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        nextDay(day, month, year);



        int[] nextDate = {this.day, this.month, this.year};
        return nextDate;
    }

    public static void main(String[] args) {
        NextDay nextDay = new NextDay(2,1,27);

        System.out.println(Arrays.toString(nextDay.nextDate(31, 5, 12)));
        System.out.println(nextDay.nextDay(31, 8, 3));
        System.out.println(Arrays.toString(nextDay.nextDate(31,12,2023)));
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
}


