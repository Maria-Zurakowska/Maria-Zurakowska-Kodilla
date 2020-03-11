package com.kodilla.testing.collection;
import org.junit.*;
import java.util.ArrayList;

public class OddNumbersExterminatorTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator underTest = new OddNumbersExterminator();
        ArrayList<Integer> input = new ArrayList<>();

        //When
        ArrayList<Integer> result = underTest.exterminate(input);

        //Then
        Assert.assertEquals(0,result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator underTest = new OddNumbersExterminator();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(5);
        input.add(2);
        input.add(5);
        input.add(7);
        input.add(4);
        input.add(5);
        input.add(8);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(8);
        //When
        ArrayList<Integer> result = underTest.exterminate(expected);

        //Then
        Assert.assertEquals(expected,result);
    }
}