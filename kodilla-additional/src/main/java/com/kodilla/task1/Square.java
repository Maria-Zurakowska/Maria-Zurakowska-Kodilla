package com.kodilla.task1;

public class Square implements Figure2D{

    String name;
    int side;

    public Square(String name, int side) {
        this.name = name;
        this.side = side;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculareCirumference() {
        return 4*side;
    }

    @Override
    public double calculateSurfaceArea() {
        return side*side;
    }
}
