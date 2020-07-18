package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class StudentTestSuite {

    @Test
    public void testStudentsHomeworks() {

        //Given
        Student firstQueue = new FirstQueue();
        Student secondQueue = new SecondQueue();

        Mentor paulSmith = new Mentor("Paul Smith");
        Mentor robertAsh = new Mentor("Robert Ash");

        paulSmith.update(firstQueue);
        robertAsh.update(secondQueue);

        //When
        firstQueue.addHomework("Homework 1");
        firstQueue.addHomework("Homework 2");
        firstQueue.addHomework("Homework 3");

        secondQueue.addHomework("Homework 1");
        secondQueue.addHomework("Homework 2");
        secondQueue.addHomework("Homework 3");

        //Then
        Assert.assertEquals(1,paulSmith.getNumberOfHomeworks());
        Assert.assertEquals(1, robertAsh.getNumberOfHomeworks());





    }
}
