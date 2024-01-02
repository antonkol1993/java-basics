package next.day;

import java.util.Objects;

public class DateState {

    private int day;
    private int month;
    private int year;

    private DateState() {
    }

    public static DateState of(int day, int month, int year) {
        DateState result = new DateState();
        result.day = day;
        result.month = month;
        result.year = year;
        return result;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateState dateState = (DateState) o;
        return this.day == dateState.day
                && this.month == dateState.month
                && this.year== dateState.year;
    }

    @Override
    public String toString() {
        return "DateState{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
