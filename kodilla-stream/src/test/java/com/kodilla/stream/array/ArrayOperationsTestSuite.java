package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] testNumbers = new int[]{1, 2, 3, 4, 18, 22, 59, 23, 76, 11, 87, 55, 76, 99, 6, 10, 43, 77, 62, 16};

        //When
        Double avr = ArrayOperations.getAverage(testNumbers);

        //Then
        Assert.assertEquals(37.5, avr, 0.001);
        System.out.println("Expected average: 37.5");
    }
}
