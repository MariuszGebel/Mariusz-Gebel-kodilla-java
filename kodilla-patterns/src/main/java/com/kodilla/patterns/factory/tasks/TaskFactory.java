package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING TASK";
    public static final String PAINTING = "PAINTING TASK";
    public static final String DRIVING = "DRIVING TASK";

    public final Task doTask(final String taskClass){
        switch (taskClass){
            case SHOPPING:
                return new ShoppingTask("Shopping1", "Cheese", 1.5);
            case PAINTING:
                return new PaintingTask("Painting1", "White", "Dining Room");
            case DRIVING:
                return new DrivingTask("Driving1", "Berlin", "Fiat");
            default:
                return null;
        }
    }
}
