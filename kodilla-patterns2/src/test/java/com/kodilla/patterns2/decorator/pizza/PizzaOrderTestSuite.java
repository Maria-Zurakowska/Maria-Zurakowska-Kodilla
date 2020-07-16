package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.ChildSeatDecorator;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.UberNetworkOrderDecorator;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithPepperoniGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal("25"), theCost);
    }
    @Test
    public void testPizzaWithPepperoniGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniDecorator(theOrder);

        //When
        String description = theOrder.getDescription();
        String baking = theOrder.bakePizza();
        //Then
        Assert.assertEquals("Pizza with pepperoni", description);
        Assert.assertEquals("Baking Pepperoni pizza!",baking);
    }
    @Test
    public void testPizzaWithFetaGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new FetaDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal("23"), theCost);
    }
    @Test
    public void testPizzaWithFetaGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new FetaDecorator(theOrder);

        //When
        String description = theOrder.getDescription();
        String baking = theOrder.bakePizza();
        //Then
        Assert.assertEquals("Pizza with feta", description);
        Assert.assertEquals("Baking Greek pizza!",baking);
    }


}
