package com.kodilla.checkers;

public class Application {

// mogę zacząć pisać klasę, której jeszcze nie stworzyłam
// alt+enter ->create class


    public static void main(String[] args) {
        Board board = new Board();

        // setFigure to po prostu metoda
        board.setFigure(3,4, new Pawn(FigureColor.BLACK));
        board.setFigure(2,1, new Pawn(FigureColor.WHITE));
        board.setFigure(5,4, new Queen(FigureColor.WHITE));
        System.out.println(board);

    }
}
