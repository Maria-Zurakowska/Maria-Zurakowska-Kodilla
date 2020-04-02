package com.kodilla.flights;

public class Flight {
    private City departure;
    private City arrival;

    public City getDeparture() {
        return departure;
    }

    public City getArrival() {
        return arrival;
    }

    public Flight(City departure, City arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure=" + departure +
                ", arrival=" + arrival +
                '}';
    }
}
