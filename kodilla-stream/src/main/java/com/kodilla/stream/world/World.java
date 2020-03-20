package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continents = new ArrayList<>();


    public void addContinent (Continent continent){
        continents.add(continent);
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public BigDecimal getPeopleQuantity(BigDecimal peopleQuantity){
        return continents.stream()
                .flatMap(continents ->continents.getCountries().stream())
                .map(Country::getNumberOfPeople)
                .reduce(BigDecimal.ZERO,(sum,current) ->sum = sum.add(current));



    }
}
