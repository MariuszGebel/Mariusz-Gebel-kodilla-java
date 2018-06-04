package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightDirectory {
    public static final String WARSAW = "Warsaw";
    public static final String GDANSK = "Gdańsk";
    public static final String POZNAN = "Poznań";
    public static final String KRAKOW = "Kraków";
    public static final String KATOWICE = "Katowice";
    public static final String RADOM = "Radom";
    public static final String WROCLAW = "Wrocław";
    public static final String SZCZECIN = "Szczecin";

    private final List<Flights> theFlightsList = new ArrayList<>();

    public FlightDirectory() {
        theFlightsList.add(new Flights(WARSAW, GDANSK));
        theFlightsList.add(new Flights(WARSAW, POZNAN));
        theFlightsList.add(new Flights(WARSAW, KATOWICE));
        theFlightsList.add(new Flights(WARSAW, RADOM));
        theFlightsList.add(new Flights(KATOWICE, KRAKOW));
        theFlightsList.add(new Flights(RADOM, KATOWICE));
        theFlightsList.add(new Flights(RADOM, WROCLAW));
        theFlightsList.add(new Flights(RADOM, SZCZECIN));
    }

    public List<Flights> getList() {
        return new ArrayList<>(theFlightsList);
    }
}
