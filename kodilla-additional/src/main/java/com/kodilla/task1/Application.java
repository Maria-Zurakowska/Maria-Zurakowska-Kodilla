package com.kodilla.task1;

public class Application {

    public static void main(String[] args) {

        // klasa utworzy nowy obiekt klasy FigureCollector
        FigureCollector figcol = new FigureCollector();

        // a następnie utwórz przykładowe figury i dodaj je do
        // `FigureCollectora`. Sprawdź jak wygąda wynik wywołania
        // metody `showFigures()

        Figure2D circle = new Circle("Circle ", 5);
        Figure2D rectangle = new Rectangle("Rectangle ", 4,8);
        Figure2D square = new Square("Square ", 4);

        figcol.addFigure(circle);
        figcol.addFigure(rectangle);
        figcol.addFigure(square);

        figcol.showFigures();



    }


}
