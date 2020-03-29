package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchRunner {
    public HashMap<String,Boolean> findFlight (Flight flight) throws RouteNotFoundException {
        HashMap<String,Boolean> flightSearchMap = new HashMap<>();

        flightSearchMap.put("New York",true);
        flightSearchMap.put("Warsaw",true);
        flightSearchMap.put("Oslo",false);
        flightSearchMap.put("New York",true);
        flightSearchMap.put("Prague",false);

        if(flightSearchMap.containsKey(flight.getArrivalAirport())){
            if(flightSearchMap.get(flight.getArrivalAirport())){
                System.out.println("The airport is available");
            } else {
                System.out.println("The airport is not available");
            }
        } else {
            throw new RouteNotFoundException("Route not found");
        }

    return  flightSearchMap;
    }

    public static void main(String[] args) throws RouteNotFoundException {

        Flight flight1 = new Flight("New York","Warsaw");
        Flight flight2 = new Flight("Warsaw","New York");
        Flight flight3 = new Flight("Prague","Warsaw");
        Flight flight4 = new Flight("Oslo","Warsaw");
        Flight flight5 = new Flight("New York","Oslo");

        FlightSearchRunner flightSearchRunner = new FlightSearchRunner();

        System.out.println(flightSearchRunner.findFlight(flight5));


    }

}
