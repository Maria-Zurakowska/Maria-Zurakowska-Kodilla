package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Autowired
    private Board board;

    @Test
    public void testTaskAdd() {
        //When
        board.getToDoList().getTasks().add("cleaning");
        board.getInProgressList().getTasks().add("doing the laundry");
        board.getDoneList().getTasks().add("doing the dishes");

        //Then
        System.out.println(board.getToDoList().getTasks().add("cleaning"));
        System.out.println(board.getInProgressList().getTasks().add("doing the laundry"));
        System.out.println(board.getDoneList().getTasks().add("doing the dishes"));
    }
}
