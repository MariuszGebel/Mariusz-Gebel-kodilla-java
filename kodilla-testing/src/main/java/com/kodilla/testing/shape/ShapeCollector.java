package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapesList = new ArrayList<>();

    public int getListSize() {
        return shapesList.size();
    }

    public void addFigure(Shape shape) {
        shapesList.add(shape);
    }

    public void removeFigure(int shapeIndex) {
        if(shapesList.size() != 0) {
           shapesList.remove(shapeIndex);
        } else {
            System.out.println("List was empty!");
        }
    }

    public Shape getFigure(int n) {
        if(shapesList.size() != 0) {
            return shapesList.get(n);
        } else {
            System.out.println("List was empty!");
            return null;
        }
    }

    public ArrayList<String> showFigures() {
        ArrayList<String> figureName = new ArrayList<>();
        for (Shape shapes : shapesList) {
            figureName.add(shapes.getShapeName());
        }
        return figureName;
    }


}
