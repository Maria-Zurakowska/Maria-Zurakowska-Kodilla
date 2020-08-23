package com.kodilla.checkers;

public class Application {


    public static void main(String[] args) {
        Board board = new Board();

        board.setFigure(3,4, new Pawn(FigureColor.BLACK));
        board.setFigure(2,1, new Pawn(FigureColor.WHITE));
        board.setFigure(5,4, new Queen(FigureColor.WHITE));
        System.out.println(board);

    }
}
