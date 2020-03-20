package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal numberOfPeople;

    public Country(final String countryName, final BigDecimal numberOfPeople) {
        this.countryName = countryName;
        this.numberOfPeople = numberOfPeople;
    }

    public String getCountryName() {
        return countryName;
    }
//to jest getPeopleQuantity
    public BigDecimal getNumberOfPeople() {
        return numberOfPeople;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                '}';
    }
}
