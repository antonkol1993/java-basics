package next.day;

public class DateUtils {

    public static DateState calculateNextDay(DateState initial) {
        //validation
        if (initial.getYear() < 0) {
            throw new RuntimeException("Incorrect date");
        }

        //----------

        int currentDay = initial.getDay();
        int currentMonth = initial.getMonth();

        boolean isLeapYear = isLeapYear(initial);
        int lastDayOfMonth;

        DateState result = DateState.of(currentDay + 1, currentMonth, initial.getYear());
//
        return result;
    }

    public static boolean isLeapYear(DateState initial) {
        return false;
    }

    public static int maxDayOfMonth(DateState initial) {
        return 31;
    }
}
