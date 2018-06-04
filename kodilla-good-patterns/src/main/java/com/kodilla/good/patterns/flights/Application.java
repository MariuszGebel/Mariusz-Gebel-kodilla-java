package com.kodilla.good.patterns.flights;

import static com.kodilla.good.patterns.flights.FlightDirectory.*;

public class Application {
    public static void main(String[] args){
        FlightDirectory theFlightDirectory = new FlightDirectory();

        System.out.println("ALL FLIGHTS FROM WARAW");
        theFlightDirectory.getList().stream()
                .filter(flights -> flights.getFlightFrom().equals(WARSAW))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("ALL FLIGHTS TO WROCLAW");
        theFlightDirectory.getList().stream()
                .filter(flights -> flights.getFlightTo().equals(WROCLAW))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("ALL FLIGHTS FROM WARSAW TO KATOWICE VIA RADOM");
        theFlightDirectory.getList().stream()
                .filter(flights -> flights.getFlightFrom().equals(WARSAW)
                || flights.getFlightTo().equals(KATOWICE))
                .filter(flights -> flights.getFlightTo().equals(RADOM)
                        || flights.getFlightFrom().equals(RADOM))
                .forEach(System.out::println);
    }
}
