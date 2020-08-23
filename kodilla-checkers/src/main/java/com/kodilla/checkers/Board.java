package com.kodilla.checkers;

import java.util.ArrayList;
import java.util.List;

public class Board {
    // tworzę listę, która będzie przechowywać obiekty klasy BoardRow
    private List<BoardRow> rows = new ArrayList<>();

    //tworzę konstruktor, w którym w pętli do 8 pól dodaję do
    // kolekcji - listy rows -> nowy obiekt BoardRow
    public Board() {
        for (int i = 0; i < 8; i++) {
            rows.add(new BoardRow());
        }
    }
    // metoda zwraca typ Figure o parametrach col i row
    public Figure getFigure(int col, int row){
        return rows.get(row).getCols().get(col);// zwracam element listy rows pobiera row (paramentr metody)
                                                // metoda .getCols() jest z klasy BoardRow
    }

    public void setFigure(int col, int row, Figure figure){
        rows.get(row).getCols().set(col, figure);
    }

    @Override
    public String toString() {

        String s = "|-----------------------|\n"; // \n ->przejdz do nowego wiersza
        for (int row = 0; row < 8; row++) {
            s+= rows.get(row).toString();
        }
        s+= "|-----------------------|\n";
        return s;
    }
}
