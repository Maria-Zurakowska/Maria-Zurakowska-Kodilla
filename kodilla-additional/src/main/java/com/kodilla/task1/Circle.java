package com.kodilla.task1;

import java.util.Scanner;

public class Circle implements Figure2D {

    String name;
    int radius;

    public Circle(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculareCirumference() {
        return 2*Math.PI *radius;
    }

    @Override
    public double calculateSurfaceArea() {
        return Math.PI * (radius*radius);
    }
}
