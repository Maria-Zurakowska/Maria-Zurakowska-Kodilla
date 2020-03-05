package com.kodilla.task1;

import java.util.Scanner;

public class Rectangle implements Figure2D {

    String name = "Rectangle";

    public String getName() {
        return name;
    }

    Scanner scr = new Scanner(System.in);
    int a = scr.nextInt();
    int b = scr.nextInt();

    @Override
    public void calculareCirumference() {
        System.out.println(2*a + 2*b);

    }

    @Override
    public void calculateSurfaceArea() {
        System.out.println(a*b);
    }
}
