package com.kodilla.checkers;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {

    // tworzę listę, która będzie przechowywać obiekty klasy Figure (to jest interfejs)
    // co w skrócie oznacza, że pod Figure mogę wstawić każdy obiekt klasy,
    // które implementuje ten interfejs, tutaj -Queen, None, Pawn
    private List<Figure> cols = new ArrayList<>();

// konstruktor bezparametrowy a w nim jest dodawanych 8 obiektow typu None
    public BoardRow() {
        for (int i = 0; i < 8; i++) {
            cols.add(new None());
        }
    }

    // metoda typu List<Figure>, a więc kolekcji
    public List<Figure> getCols() {

        return cols;
    }

    @Override
    public String toString() {
        String s = "|";
        for (int col = 0; col<8; col++){
            s += cols.get(col).toString()+ "|";
        }
        s+="\n";
        return s;
    }
}
