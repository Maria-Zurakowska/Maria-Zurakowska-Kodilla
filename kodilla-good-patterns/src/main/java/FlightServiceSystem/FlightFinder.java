package FlightServiceSystem;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public static List<Flight> findMatchingFlights(City to, City through, City from) {
        List<Flight> stage1 = FlightRepository
                .getFlights()
                .stream()
                .filter(f -> f.getArrival() == through)
                .filter(f -> f.getDeparture() == from)
                .collect(Collectors.toList());
        List<Flight> stage2 = FlightRepository
                .getFlights()
                .stream()
                .filter(f -> f.getArrival() == to)
                .filter(f -> f.getDeparture() == through)
                .collect(Collectors.toList());
        stage1.addAll(stage2);
        return stage1;
    }

    public static List<Flight> findFlightsTo(City to) {
        return FlightRepository
                .getFlights()
                .stream()
                .filter(f -> f.getArrival() == to)
                .collect(Collectors.toList());
    }

    public static List<Flight> findFlightsFrom(City from) {
        return FlightRepository
                .getFlights()
                .stream()
                .filter(f -> f.getDeparture() == from)
                .collect(Collectors.toList());
    }
}
