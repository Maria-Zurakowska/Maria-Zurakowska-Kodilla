package com.kodilla.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight(City.WAW,City.JFK));
        flights.add(new Flight(City.JFK,City.LAX));
        flights.add(new Flight(City.LAX,City.JFK));
        flights.add(new Flight(City.JFK,City.MIA));

        return flights;
    }

}
