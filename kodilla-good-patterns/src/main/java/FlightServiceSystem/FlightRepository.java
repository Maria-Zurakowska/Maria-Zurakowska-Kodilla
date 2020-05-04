package FlightServiceSystem;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight(City.WAW,City.GDN));
        flights.add(new Flight(City.KRK,City.GDN));
        flights.add(new Flight(City.RZE,City.SZZ));
        flights.add(new Flight(City.KTW,City.POZ));

        return flights;
    }
}
