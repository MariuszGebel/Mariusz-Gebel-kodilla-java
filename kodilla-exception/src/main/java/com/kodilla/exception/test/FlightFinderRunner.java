package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Warsaw", "Haga");

        try {
            flightFinder.findFlight(flight);
            System.out.println("Flight from " + flight.getDepartureAirport() + " to "
            + flight.getArrivalAirport() + " can be booked");
        } catch (RouteNotFoundException e) {
            System.out.println(flight.getDepartureAirport() + " or " + flight.getArrivalAirport() +
                    " is not found!");
        }
    }
}
