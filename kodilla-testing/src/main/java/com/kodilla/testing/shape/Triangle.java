package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String name;
    int side;

    @Override
    public double getField() {
        return ((side * side) * Math.sqrt(3)) / 4;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    public Triangle(String name, int side) {
        this.name = name;
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public int getSide() {
        return side;
    }
}
