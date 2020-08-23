package com.kodilla.task1;

import java.util.ArrayList;
import java.util.List;

public class FigureCollector {


    private List<Figure2D> figures = new ArrayList<>();


    public void addFigure(Figure2D figure){
        figures.add(figure);
    }


    public void showFigures(){

        for (Figure2D fig : figures){
            System.out.println(fig.getName() + "Circumference: " + fig.calculareCirumference());
            System.out.println(fig.getName() + "Surface Area: " + fig.calculateSurfaceArea());
        }
    }








}
