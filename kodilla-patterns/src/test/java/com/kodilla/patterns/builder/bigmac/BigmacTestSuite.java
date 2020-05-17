package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void BigmacTestSuite(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                        .ingredient("lettuce")
                        .ingredient("onion")
                        .ingredient("bacon")
                        .ingredient("cucumber")
                        .ingredient("chili peppers")
                        .ingredient("mushrooms")
                        .ingredient("prawns")
                        .ingredient("cheese")
                        .burgers(2)
                        .sauce("ketchup")
                        .bun("thick")
                        .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();

        //Then
        Assert.assertEquals(8, howManyIngredients);
        Assert.assertEquals(2,howManyBurgers);


    }
}
