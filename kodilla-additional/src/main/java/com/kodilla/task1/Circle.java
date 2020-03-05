package com.kodilla.task1;

import java.util.Scanner;

public class Circle implements Figure2D {

    String name = "Circle";

    public String getName() {
        return name;
    }

    Scanner scr = new Scanner(System.in);
    //wartość promienia
    int r = scr.nextInt();

    @Override
    public void calculareCirumference() {
        System.out.println(2*Math.PI *r);
    }

    @Override
    public void calculateSurfaceArea() {
        System.out.println(Math.PI * (r*r));
    }
}
