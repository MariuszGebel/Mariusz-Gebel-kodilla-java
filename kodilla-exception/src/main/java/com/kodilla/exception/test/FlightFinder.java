package com.kodilla.exception.test;

import java.util.*;

public class FlightFinder {

    Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("London", false);
        airports.put("Berlin", true);
        airports.put("Paris", false);
        airports.put("Amsterdam", true);

        if(airports.containsKey(flight.getArrivalAirport())) {
            return airports.get(flight);
        } else {
            throw new RouteNotFoundException("Airport not found!");
        }
    }
}
