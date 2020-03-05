package com.kodilla.task1;

import java.util.Scanner;

public class Square implements Figure2D{

    String name = "Square";

    public String getName() {
        return name;
    }

    Scanner scr = new Scanner(System.in);
    int a = scr.nextInt();

    @Override
    public void calculareCirumference() {
        System.out.println(a*4);
    }

    @Override
    public void calculateSurfaceArea() {
        System.out.println(a*a);
    }
}
