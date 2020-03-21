package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){

        //Given
        int[] array = new int[2];
        array[0] = 4;
        array[1] = 6;

        //When
       getAverage(array);

        //Then
        Assert.assertEquals(5,getAverage(array));
    }
}
