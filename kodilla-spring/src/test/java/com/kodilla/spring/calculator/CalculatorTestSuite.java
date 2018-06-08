package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultSum = calculator.add(55.55, 22.22);
        double resultSub = calculator.sub(55.55, 22.22);
        double resultMul = calculator.mul(55.55, 22.22);
        double resultDiv = calculator.div(55.55, 22.22);
        //Then
        Assert.assertEquals(77.77, resultSum, 0.01);
        Assert.assertEquals(33.33, resultSub, 0.01);
        Assert.assertEquals(1234.321, resultMul, 0.001);
        Assert.assertEquals(2.5, resultDiv, 0.01);
        System.out.println(resultSum);
        System.out.println(resultSub);
        System.out.println(resultMul);
        System.out.println(resultDiv);
    }
}
