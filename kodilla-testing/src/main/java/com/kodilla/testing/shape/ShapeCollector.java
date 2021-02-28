package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> list = new ArrayList<>();



    public void addFigure(Shape shape)
    {

        list.add(shape);

    }

    public void removeFigure(Shape shape)
    {

        list.remove(list.indexOf(shape));
    }

    public Shape getFigure(int n)
    {
        return list.get(n);
    }

    public int getSizeOfTheList()
    {
        return list.size();
    }

    public Shape  showFigures()
    {
        Shape figures = null;
        for (Shape figure: list) {
            figures = figure;
        }
        return figures;
    }
}
