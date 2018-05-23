package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> continentCountries = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
     }

    public void addCountry(Country country) {
        continentCountries.add(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getContinentCountries() {
        return continentCountries;
    }
}
