package champions.league.uefa;

import java.util.List;

public class Team {

    private final Names name;
    private Location location;
    private Country country;
    private Calendar calendar;


    public Team(Names name) {
        this.name = name;
        this.location = calendar.getLocation();
        this.country = name.getCountry();

    }

    public Country getCountry() {
        return name.getCountry();
    }

    public Names getName() {
        return name;
    }

    public Calendar getCalendarList() {
        return calendar;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name=" + name +
                ", location=" + location +
                ", country=" + country +
                ", calendar=" + calendar +
                '}';
    }
}
