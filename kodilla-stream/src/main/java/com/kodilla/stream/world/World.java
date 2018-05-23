package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public List<Continent> getContinents() {
        return continents;
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public BigInteger getPeopleQuantity() {
        BigInteger worldPopl = continents.stream()
                .flatMap(continent -> continent.getContinentCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));
        return worldPopl;
    }
}
