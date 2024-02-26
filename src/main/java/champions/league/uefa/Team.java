package champions.league.uefa;

import java.util.List;

public class Team {

    private final Names name;
    List<Calendar> calendarList;
    private final Location location;


    public Team(Names name, List<Calendar> calendarList, Location location) {
        this.name = name;
        this.calendarList = calendarList;
        this.location = location;
    }



    public Country getCountry() {
        return name.getCountry();
    }

    public Names getName() {
        return name;
    }

    public List<Calendar> getCalendarList() {
        return calendarList;
    }

    public Location getLocation() {
        return location;
    }
}
