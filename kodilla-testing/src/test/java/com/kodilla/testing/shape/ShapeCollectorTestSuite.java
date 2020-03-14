package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCaseAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 7);//tworzę przykładowy obiekt
        //When
        shapeCollector.addFigure(circle);// dodaję figurę
        //Then
        Assert.assertEquals(1, shapeCollector.getArraySize());// dodałam 1 figurę -> 1, porównuję z rozmiarem kolekcji.
    }

    @Test
    public void testCaseRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 8);// dodaję przykładowy obiekt
        shapeCollector.addFigure(circle);//dodaję figurę
        //When
        boolean result = shapeCollector.removeFigure(circle);//usuwam figurę
        //Then
        Assert.assertEquals(0, shapeCollector.getArraySize());
        Assert.assertTrue(result);
    }

    @Test
    public void testCaseGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 6);//dodaję przykładowy obiekt oraz figurę
        shapeCollector.addFigure(circle);
        //When
        Shape retrievedFigure = shapeCollector.getFigure(0);//pobieram figurę
        //Then
        Assert.assertEquals(circle, retrievedFigure);
    }
}
