package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
       //When
        BigDecimal calculatedCost = theOrder.getPizzaCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getPizzaDescription();
        //Then
        assertEquals("Basic pizza", description);
    }

    @Test
    public void testBasicPizzaWithChickenGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChickenDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getPizzaCost();
        //Then
        assertEquals(new BigDecimal(28), theCost);
    }

    @Test
    public void testBasicPizzaWithVegetablesGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new VegetablesDecorator(theOrder);
        //When
        String description = theOrder.getPizzaDescription();
        //Then
        assertEquals("Basic pizza + vegetables", description);
    }

    @Test
    public void testBasicPizzaWithVegetablesAndTomatoSauceGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new VegetablesDecorator(theOrder);
        theOrder = new TomatoSauceDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getPizzaCost();
        System.out.println(theOrder.getPizzaCost());
        //Then
        assertEquals(new BigDecimal(27), theCost);
    }

    @Test
    public void testBasicPizzaWithChickenAndGarlicSauceGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new GarlicSauceDecorator(theOrder);
        //When
        String description = theOrder.getPizzaDescription();
        System.out.println(theOrder.getPizzaDescription());
        //Then
        assertEquals("Basic pizza + chicken + garlic sauce", description);
    }
}
