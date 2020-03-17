package com.kodilla.checkers;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTestSuite {

    @Test
    public void testGetFigure(){
        //Given
        Board underTest = new Board();
        Figure pawn = new Pawn(FigureColor.WHITE);
        underTest.setFigure(4,5,pawn);
        //When
        Figure figure = underTest.getFigure(4, 5);

        //Then
        assertEquals(pawn,figure);
    }
    @Test
    public void testBoard() {
        //Given

        //When
        Board underTest = new Board();
        //Then
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col <8 ; col++) {
                assertTrue(underTest.getFigure(col, row) instanceof None);
            }
        }

    }
}