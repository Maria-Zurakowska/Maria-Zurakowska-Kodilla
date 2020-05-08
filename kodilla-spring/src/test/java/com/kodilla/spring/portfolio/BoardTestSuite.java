package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

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
