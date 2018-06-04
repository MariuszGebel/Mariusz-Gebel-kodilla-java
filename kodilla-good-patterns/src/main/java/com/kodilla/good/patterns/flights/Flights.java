package com.kodilla.good.patterns.flights;

import java.util.Objects;

public final class Flights {
    private final String flightFrom;
    private final String flightTo;

    public Flights(final String flightFrom, final String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    @Override
    public String toString() {
        return "Flight From='" + flightFrom + '\'' +
                ", Flight To='" + flightTo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return Objects.equals(flightFrom, flights.flightFrom) &&
                Objects.equals(flightTo, flights.flightTo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(flightFrom, flightTo);
    }
}
