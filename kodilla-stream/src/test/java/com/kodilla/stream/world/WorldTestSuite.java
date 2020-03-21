package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        List<Continent> continents = new ArrayList<>();
        continents.add(new Continent("Asia"));
        continents.add(new Continent("Europe"));
        continents.add(new Continent("Africa"));
        continents.add(new Continent("America"));

        //When
        World world = new World();
        BigDecimal bigd = new BigDecimal("5435353534");
        Country country = new Country("Asia",bigd);
        country.getNumberOfPeople();
        BigDecimal current = world.getPeopleQuantity(country.getNumberOfPeople());

        //Then
        BigDecimal expected = new BigDecimal("5435353534");
        Assert.assertEquals(expected,current);
    }
}
