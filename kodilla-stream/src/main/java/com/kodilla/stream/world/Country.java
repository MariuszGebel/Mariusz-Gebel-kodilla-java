package com.kodilla.stream.world;

import java.math.BigInteger;

public final class Country {
    private final String countryName;
    private final BigInteger peopleQuantity;

    public Country(String countryName, BigInteger peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigInteger getPeopleQuantity() {
        return peopleQuantity;
    }
}
