package next.day;/*
Напишите программу расчета даты следующего дня введя 3 числа - день, месяц и год.

пример:
Введите день: 15
Введите месяц: 3
Введите год: 2003
Следующий день: 16 3 2003
 */


public class NextDay {

    private final int day;
    private final int month;
    private final int year;
    private int nextDay;
    private int nextMonth;
    private int nextYear;

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

    public int getNextDay() {
        return nextDay;
    }

    public int getNextMonth() {
        return nextMonth;
    }

    public int getNextYear() {
        return nextYear;
    }

    public int maxDay() {
        return switch (month) {
            case 2 -> isLeapYear() ? 29 : 28;
            case 4,6,9,11 -> 30;
            default -> 31;
        };

//        return
//
//                //            case 1,3,5,7,8,10,12 -> 31;
//
//
//
//                (month % 2 == 1 && month < 8) ? 31 : month == 2 && isLeapYear() ?
//                29 : month == 2 && !isLeapYear() ? 28 : month >= 8 && month % 2 == 0 ? 31 : 30;
    }

    public boolean isLeapYear() {
        boolean leapYear;
        if (year < 0) {
            throw new RuntimeException("negative numbers are not allowed");
        } else {
            leapYear = year % 4 == 0 && year % 100 != 0;
        }
        return leapYear;
    }

    public void nextDate() {
        if (maxDay() > day) {
            nextDay = day + 1;
            nextMonth = month;
            nextYear = year;
        } else {
            if (day > maxDay() || month < 1 || month > 12) {
                throw new RuntimeException("this is an unacceptable day or month");
            } else {
                nextDay = 1;
                nextMonth = month == 12 ? 1 : month + 1;
                nextYear = month == 12 ? year + 1 : year;
            }
        }
    }


    public static void main(String[] args) {

        NextDay nextDay1 = new NextDay(29, 2, 2000);
        nextDay1.nextDate();
        nextDay1.nextDate();
        nextDay1.nextDate();
        nextDay1.nextDate();
        nextDay1.nextDate();
        System.out.println(nextDay1.nextDay);
        System.out.println(nextDay1.nextMonth);
        System.out.println(nextDay1.nextYear);
        System.out.println(nextDay1.isLeapYear());

    }


}


