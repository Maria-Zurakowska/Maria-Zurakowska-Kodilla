package com.kodilla.testing.shape;

public class Circle implements Shape {
    String name;
    int radius;

    public Circle(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double getField() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }
}
