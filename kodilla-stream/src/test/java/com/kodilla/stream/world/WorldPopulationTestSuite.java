package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;

public class WorldPopulationTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("ASIA");
        europe.addCountry(new Country("China",  new BigInteger("1500000000")));
        europe.addCountry(new Country("India",  new BigInteger("1300000000")));
        europe.addCountry(new Country("Japan",  new BigInteger("50000000")));

        Continent asia = new Continent("EUROPE");
        europe.addCountry(new Country("Poland",  new BigInteger("38000000")));
        europe.addCountry(new Country("Germany",  new BigInteger("54000000")));
        europe.addCountry(new Country("Finland",  new BigInteger("6000000")));

        Continent africa = new Continent("AFRICA");
        europe.addCountry(new Country("Maroco",  new BigInteger("3000000")));
        europe.addCountry(new Country("Saudi Arabia",  new BigInteger("100000000")));
        europe.addCountry(new Country("RPA",  new BigInteger("45000000")));

        World worldContinents = new World();
        worldContinents.addContinent(europe);
        worldContinents.addContinent(asia);
        worldContinents.addContinent(africa);

        //When
        BigInteger actualPeopleQuantity = worldContinents.getPeopleQuantity();

        //Then
        Assert.assertEquals(actualPeopleQuantity, new BigInteger("3096000000"));
        System.out.println("Actual number of people: " + actualPeopleQuantity);
        System.out.println("Expected number of people: " + new BigInteger("3096000000"));


    }
}
