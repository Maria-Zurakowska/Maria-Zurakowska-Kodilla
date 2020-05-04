package FlightServiceSystem;
import java.util.List;

public class FlightRunner {

    public static void main(String[] args) {
        List<Flight> flights = FlightFinder.findFlightsFrom(City.WAW);
        List<Flight> flightsTo = FlightFinder.findFlightsTo(City.GDN);
        System.out.println(flights);
        System.out.println(flightsTo);
    }
}
