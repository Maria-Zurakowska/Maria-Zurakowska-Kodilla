package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void createLogger() {
        Logger.getInstance().log("First log");
        Logger.getInstance().log("Second log");
        Logger.getInstance().log("Third log");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("The last log is: " + lastLog);
        //Then
        Assert.assertEquals("Third log", lastLog);

    }
}
