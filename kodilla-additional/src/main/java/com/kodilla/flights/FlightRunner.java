package com.kodilla.flights;

import java.util.List;
import java.util.Map;

public class FlightRunner {
    public static void main(String[] args) {
        Map<Flight,Flight> flights = FlightFinder.find(City.WAW, City.MIA);
        System.out.println(flights);

    }
}
