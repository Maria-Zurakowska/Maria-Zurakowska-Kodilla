package com.kodilla.task1;

public class Application {

    public static void main(String[] args) {

        FigureCollector figcol = new FigureCollector();

        Figure2D circle = new Circle("Circle ", 5);
        Figure2D rectangle = new Rectangle("Rectangle ", 4,8);
        Figure2D square = new Square("Square ", 4);

        figcol.addFigure(circle);
        figcol.addFigure(rectangle);
        figcol.addFigure(square);

        figcol.showFigures();



    }


}
