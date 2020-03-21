package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){

        //Given
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = i*i;
        }

        //When
        Double average = ArrayOperations.getAverage(array);

        //Then
        Assert.assertEquals(average, 123.5, 0.001);
    }
}
