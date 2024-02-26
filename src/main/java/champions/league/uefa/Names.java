package champions.league.uefa;

import static champions.league.uefa.Country.*;


public enum Names {
    COPENHAGEN(DEUTSCH),
    MANCHESTER_CITY(ENGLAND),
    REAL_MADRID(SPAIN),
    RB_LEIPZIG(GERMANY),
    PARIS_SAN_GERMAN(FRANCE),
    REAL_SOCIEDAD(SPAIN),
    LAZIO(ITALY),
    BAYERN_MUNICH(GERMANY),
    INTER(ITALY),
    ATLETIKO(SPAIN),
    PSV_EINDHOVEN(HOLLAND),
    BORUSSIA(GERMANY),
    PORTO(PORTUGAL),
    ARSENAL(ENGLAND),
    NAPOLI(ITALY),
    BARCELONA(SPAIN);


    private Country country;

    Names(Country country) {
        this.country = country;
    }


    public Country getCountry() {
        return country;
    }
}
