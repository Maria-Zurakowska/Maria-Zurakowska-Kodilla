package com.kodilla.testing.shape;
import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public boolean addFigure(Shape shape) {
        return shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public void showFigures() {
        for (Shape shp : shapes) {
            System.out.println(shp.getShapeName() + shp.getField());
        }
    }

    public int getArraySize() {
        return shapes.size();
    }
}
