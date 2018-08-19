package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TaskQueue johnSmith = new JohnSmithTaskQueue();
        TaskQueue ivoneEscobar = new IvoneEscobarTaskQueue();
        TaskQueue jessiePinkman = new JessiePinkmanTaskQueue();
        Mentor janKowalski = new Mentor("Jan Kowalski");
        Mentor jerzyNowak = new Mentor("Jerzy Nowak");
        johnSmith.registerObserver(janKowalski);
        ivoneEscobar.registerObserver(jerzyNowak);
        jessiePinkman.registerObserver(jerzyNowak);

        //When
        johnSmith.addTask("Task1");
        ivoneEscobar.addTask("TaskA");
        jessiePinkman.addTask("TaskI");
        johnSmith.addTask("Task2");
        ivoneEscobar.addTask("TaskB");
        ivoneEscobar.addTask("TaskC");
        ivoneEscobar.addTask("TaskD");
        jessiePinkman.addTask("TaskII");
        //Then
        assertEquals(2, janKowalski.getUpdateCount());
        assertEquals(6, jerzyNowak.getUpdateCount());
    }
}
