package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Collection Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Collection Test Case: end\n");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Collection Test Suite: begin\n");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Collection Test Suite: end");
    }

    @Test
    public  void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("ArrayList is empty");
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Test result: " + result);

        //Then
        Assert.assertEquals(evenNumbers, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Following numbers has been added to the list: 1, 2, 3, 4, 5");

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("Following numbers should be outcome of the \"exterminate\" method: 2, 4");

        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Test result: " + result);

        //Then
        Assert.assertEquals(evenNumbers, result);
    }
}
