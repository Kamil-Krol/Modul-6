package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import com.kodilla.testing.shape.ShapeCollector;

import java.util.ArrayList;
import java.util.List;

@Nested
@DisplayName("Test for shape collector")
public class ShapeCollectorTestSuite {

    @Test
    void testAddFigure()
    {
        //Given
        Circle circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assertions.assertEquals(circle, shapeCollector.getFigure(0));
    }

    @Test
    void testRemoveFigure()
    {
        //Given
        Circle circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.removeFigure(circle);
        //Then
        Assertions.assertEquals(0,shapeCollector.getSizeOfTheList());
    }

    @Test
    void testGetFigure()
    {
        //Given
        Circle circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.getFigure(0);
        //Then
        Assertions.assertEquals(circle, shapeCollector.getFigure(0));
    }

    @Test
    void testShowFigures()
    {
        //Given
        Circle circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.showFigures();
        //Then
        Assertions.assertEquals(circle, shapeCollector.showFigures());
    }

}
