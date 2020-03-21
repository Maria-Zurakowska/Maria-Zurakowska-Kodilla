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
        Country poland = new Country("Poland", new BigDecimal("34535"));
        Country china = new Country("China", new BigDecimal("3453"));
        Country egypt = new Country("Egypt", new BigDecimal("542235"));
        Country canada = new Country("Canada", new BigDecimal("34545"));


        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        Continent america = new Continent("America");

        europe.addCountry(poland);
        asia.addCountry(china);
        africa.addCountry(egypt);
        america.addCountry(canada);


        //When
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(america);

        BigDecimal current = world.getPeopleQuantity();

        //Then
        BigDecimal expected = new BigDecimal("614768");
        Assert.assertEquals(expected,current);
    }
}
