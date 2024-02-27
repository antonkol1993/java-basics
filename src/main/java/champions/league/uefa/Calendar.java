package champions.league.uefa;

import java.util.List;

import static champions.league.uefa.Names.*;

public enum Calendar {



    HOME13_02(Location.HOME,List.of(COPENHAGEN, RB_LEIPZIG)),
    GUEST13_02(Location.GUEST,List.of(MANCHESTER_CITY, REAL_MADRID)),
    HOME14_02(Location.HOME,List.of(PARIS_SAN_GERMAN, LAZIO)),
    GUEST14_02(Location.GUEST,List.of(REAL_SOCIEDAD, BAYERN_MUNICH)),
    HOME20_02(Location.HOME,List.of(INTER, PSV_EINDHOVEN)),
    GUEST20_02(Location.GUEST,List.of(ATLETIKO, BORUSSIA)),
    HOME21_02(Location.HOME,List.of(PORTO, NAPOLI)),
    GUEST21_02(Location.GUEST,List.of(ARSENAL, BARCELONA)),
    HOME05_03(Location.HOME,List.of(REAL_SOCIEDAD, BAYERN_MUNICH)),
    GUEST05_03(Location.GUEST,List.of(PARIS_SAN_GERMAN,LAZIO)),
    HOME06_03(Location.HOME,List.of(MANCHESTER_CITY,REAL_MADRID)),
    GUEST06_03(Location.GUEST,List.of(COPENHAGEN,RB_LEIPZIG)),
    HOME12_03(Location.HOME,List.of(ARSENAL,BARCELONA)),
    GUEST12_03(Location.GUEST,List.of(PORTO,NAPOLI)),
    HOME13_03(Location.HOME,List.of(ATLETIKO,BORUSSIA)),
    GUEST13_03(Location.GUEST,List.of(INTER,PSV_EINDHOVEN));



    Calendar(Location location,List<Names> matchList) {
        this.location = location;
    }
    private Location location;
    public Location getLocation() {
        return location;
    }
}
