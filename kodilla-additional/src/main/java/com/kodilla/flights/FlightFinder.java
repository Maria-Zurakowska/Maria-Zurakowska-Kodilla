package com.kodilla.flights;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightFinder {

    public static Map<Flight,Flight> find(City from, City to) {
        List<Flight> departures = findFlightsFrom(from);
        List<Flight> arrivals = findFlightsTo(to);

        return departures
                .stream()
// f->strumien obiektow flight departures
                .flatMap(f -> findMatchingFlights(f, arrivals).entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    // klucz - lotnisko wylotu, wartosc - lotnisko przylotu
    private static Map<Flight, Flight> findMatchingFlights(Flight flight, List<Flight> arrivals) {
        return arrivals
                .stream()
                .filter(a -> a.getDeparture() == flight.getArrival()) //a-lot z 2 kolekcji (11) / flight z kolekcji (10)
                .collect(Collectors.toMap(a -> flight, a -> a));
    }

    private static List<Flight> findFlightsTo(City to) {
        return FlightRepository
                .getFlights()
                .stream()
                .filter(f -> f.getArrival() == to)
                .collect(Collectors.toList());
    }

    private static List<Flight> findFlightsFrom(City from) {
        return FlightRepository
                .getFlights()
                .stream()
                .filter(f -> f.getDeparture() == from)
                .collect(Collectors.toList());
    }
}
