package com.kodilla.task1;

import java.util.Scanner;

public class Rectangle implements Figure2D {

    String name;
    int sideA;
    int sideB;

    public Rectangle(String name, int sideA, int sideB) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculareCirumference() {
        return 2*sideA + 2*sideB;
    }

    @Override
    public double calculateSurfaceArea() {
        return sideA*sideB;
    }
}
