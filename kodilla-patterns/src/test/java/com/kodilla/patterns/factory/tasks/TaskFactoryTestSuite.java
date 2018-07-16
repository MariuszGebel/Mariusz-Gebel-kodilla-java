package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.doTask(TaskFactory.SHOPPING);

        //Then
        Assert.assertEquals("Shopping1", shopping.getTaskName());
        System.out.println("Task name: " + shopping.getTaskName());

        Assert.assertEquals("Task name: Shopping1 | What to buy: Cheese | Quantity: 1.5", shopping.executeTask());
        System.out.println("Task execution: " + shopping.executeTask());

        Assert.assertTrue(shopping.isTaskExecuted());
        System.out.println("Is task executed: " + shopping.isTaskExecuted());
        System.out.println();
    }

    @Test
    public void testFactoryPainting(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.doTask(TaskFactory.PAINTING);

        //Then
        Assert.assertEquals("Painting1", painting.getTaskName());
        System.out.println("Task name: " + painting.getTaskName());

        Assert.assertEquals("Task name: Painting1 | Color: White | What to paint: Dining Room", painting.executeTask());
        System.out.println("Task execution: " + painting.executeTask());

        Assert.assertTrue(painting.isTaskExecuted());
        System.out.println("Is task executed: " + painting.isTaskExecuted());
        System.out.println();
    }

    @Test
    public void testFactoryDriving(){
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.doTask(TaskFactory.DRIVING);

        //Then
        Assert.assertEquals("Driving1", driving.getTaskName());
        System.out.println("Task name: " + driving.getTaskName());

        Assert.assertEquals("Task name: Driving1 | Where: Berlin | Using: Fiat", driving.executeTask());
        System.out.println("Task execution: " + driving.executeTask());

        Assert.assertTrue(driving.isTaskExecuted());
        System.out.println("Is task executed: " + driving.isTaskExecuted());
        System.out.println();
    }

}
