package com.kodilla.testing.shape;

public class Square implements Shape {
    String name;
    int side;

    @Override
    public double getField() {
        return side * side;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    public Square(String name, int side) {
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
