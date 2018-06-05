package com.kodilla.good.patterns.flights;

import static com.kodilla.good.patterns.flights.FlightDirectory.*;

public class Application {
    public static void main(String[] args){
        FlightDirectory theFlightDirectory = new FlightDirectory();

        System.out.println("ALL FLIGHTS FROM WARAW");
        theFlightDirectory.flightsFrom(WARSAW);

        System.out.println();
        System.out.println("ALL FLIGHTS TO WROCLAW");
        theFlightDirectory.flightsTo(WROCLAW);

        System.out.println();
        System.out.println("ALL FLIGHTS FROM WARSAW TO KATOWICE VIA RADOM");
        theFlightDirectory.flightsVia(WARSAW, KATOWICE, RADOM);
    }
}
