package com.kodilla.testing.Shape;

import com.kodilla.testing.shape.*;
import org.junit.*;

import java.util.ArrayList;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Square;

public class ShapeCollectorTestSuite {
    public static int testCounter = 0;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: start.\n");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Suite Test: end.");
    }

    @Before
    public void before() {
        testCounter++;
        System.out.println("Case Test #" + testCounter + ": start");
    }

    @After
    public void after() {
        System.out.println("Case Test #" + testCounter + ": end\n");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Square(8));
        shapeCollector.addFigure(new Triangle(14,6));
        int actualListSize = shapeCollector.getListSize();
        System.out.println("Expected: 2");
        System.out.println("Actual:   " + actualListSize);

        //Then
        Assert.assertEquals(2, actualListSize);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(8));
        shapeCollector.addFigure(new Triangle(14, 6));

        //When
        shapeCollector.removeFigure(0);
        int actualListSize = shapeCollector.getListSize();
        System.out.println("Expected: 1");
        System.out.println("Actual:   " + actualListSize);

        //Then
        Assert.assertEquals(1, actualListSize);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(8));
        System.out.println("Expected: " + shapeCollector.getFigure(0));

        //When
        Shape retrivedShape = shapeCollector.getFigure(0);
        System.out.println("Actual:   " + retrivedShape);

        //Then
        Assert.assertEquals(shapeCollector.getFigure(0), retrivedShape);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<String> names = new ArrayList<>();
        shapeCollector.addFigure(new Circle(8));
        shapeCollector.addFigure(new Triangle(12, 6));
        names.add(shapeCollector.getFigure(0).getShapeName());
        names.add(shapeCollector.getFigure(1).getShapeName());
        System.out.println("Expected: " + names);

        //When
        ArrayList<String> actualNames = new ArrayList<>();
        actualNames = shapeCollector.showFigures();
        System.out.println("Actual:   " + actualNames);

        //Then
        Assert.assertEquals(names, shapeCollector.showFigures());
    }
}
