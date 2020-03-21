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
        List<Country> countries = new ArrayList<>();
        continents.add(new Continent("Asia"));
        continents.add(new Continent("Europe"));
        continents.add(new Continent("Africa"));
        continents.add(new Continent("America"));

        countries.add(new Country("France", new BigDecimal("4353")));
        countries.add(new Country("Spain", new BigDecimal("463636")));
        countries.add(new Country("Estonia", new BigDecimal("246224")));
        countries.add(new Country("Sweden", new BigDecimal("230235")));


        //When
        World world = new World();
        BigDecimal current = world.getPeopleQuantity();

        //Then
        BigDecimal expected = new BigDecimal("5435353534");
        Assert.assertEquals(expected,current);
    }
}
