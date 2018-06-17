package com.kodilla.patterns.singleton;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LoggerTestSuite {

//    @Test
//    //TEST PRZED ZMIANĄ NA WZORZEC SINGLETON
//    public void testGetLastLog() {
//        //Given
//        Logger logger = new Logger();
//        logger.log("Log1");
//        logger.log("Log2");
//        //When
//        String test = logger.getLastLog();
//        //Then
//        Assert.assertEquals("Log2", test);
//    }

    @Test
    public void testGetLastLogSingleton(){
        //Given
        Logger.getInstance().log("Log1");
        Logger.getInstance().log("Log2");
        //When
        String test = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Log2", test);
    }

}
