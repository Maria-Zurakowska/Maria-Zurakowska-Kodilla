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
        BigDecimal totalContinents = continents.stream()
                .map(Continent::getCountries)
                .reduce(BigDecimal.ZERO,(sum, current) -> sum = sum.add(current));


        //Then
        BigDecimal expected = new BigDecimal("5435353534");
        Assert.assertEquals(expected,totalContinents);

    }
}
