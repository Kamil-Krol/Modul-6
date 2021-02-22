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
        List<Shape> list = new ArrayList<>();
        list.add(circle);
        ShapeCollector shapeCollector = new ShapeCollector(list);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assertions.assertEquals(circle, shapeCollector.addFigure(circle));
    }

    @Test
    void testRemoveFigure()
    {
        //Given
        Circle circle = new Circle();
        List<Shape> list = new ArrayList<>();
        list.add(circle);
        ShapeCollector shapeCollector = new ShapeCollector(list);
        //When
        shapeCollector.removeFigure(circle);
        //Then
        Assertions.assertNotEquals(circle, shapeCollector.removeFigure(circle));
    }

    @Test
    void testGetFigure()
    {
        //Given
        Circle circle = new Circle();
        List<Shape> list = new ArrayList<>();
        list.add(circle);
        ShapeCollector shapeCollector = new ShapeCollector(list);
        //When
        shapeCollector.getFigure(5);
        //Then
        Assertions.assertEquals(circle, shapeCollector.getFigure(5));
    }

    @Test
    void testShowFigures()
    {
        //Given
        Circle circle = new Circle();
        List<Shape> list = new ArrayList<>();
        list.add(circle);
        ShapeCollector shapeCollector = new ShapeCollector(list);
        //When
        shapeCollector.showFigures();
        //Then
        Assertions.assertEquals(list, shapeCollector.showFigures());
    }

}
