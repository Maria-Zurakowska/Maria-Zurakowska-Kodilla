package com.kodilla.task1;

import java.util.ArrayList;
import java.util.List;

public class FigureCollector {

    // będę przechowywać obiekty interfejsu czyli każdy obiekt klasy, które implementuje tern interfejs

    private List<Figure2D> figures = new ArrayList<>();

    //metoda dodaje figurę do kolekcji

    public void addFigure(Figure2D figure){
        figures.add(figure);
    }

    //metoda, która wyświetli każdą figurę -
    // nazwę | pole powierzchni | obwód

    public void showFigures(){

        for (Figure2D fig : figures){
            System.out.println(fig);


        }

    }








}
