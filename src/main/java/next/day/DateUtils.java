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

        boolean isLeapYear = initial.getYear() % 4 == 0;
        int lastDayOfMonth;

        DateState result = DateState.of(currentDay + 1, currentMonth, initial.getYear());
//
        return result;
    }

    public static void main(String[] args) {
        DateState.of(2,3,5);

        System.out.println(DateUtils.calculateNextDay(DateState.of(2,3,5)));

    }

}