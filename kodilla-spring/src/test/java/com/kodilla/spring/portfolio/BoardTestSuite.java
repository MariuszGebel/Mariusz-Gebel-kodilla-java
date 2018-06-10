package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.addToDoList("ToDo 1");
        board.addInProgressList("In Progress 1");
        board.addDoneList("Done 1");

        String task1 = board.getToDoList().tasks.toString();
        String task2 = board.getInProgressList().tasks.toString();
        String task3 = board.getDoneList().tasks.toString();

        //Then
        Assert.assertEquals("[ToDo 1]", task1);
        Assert.assertEquals("[In Progress 1]", task2);
        Assert.assertEquals("[Done 1]", task3);
    }
}
