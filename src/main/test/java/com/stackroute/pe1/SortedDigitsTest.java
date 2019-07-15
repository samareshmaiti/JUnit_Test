package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class SortedDigitsTest {
    SortedDigits sortedDigits;
    @Before
    public void setUp()
    {
        this.sortedDigits =new SortedDigits();
    }
    @After
    public void tearDown()
    {
        sortedDigits =null;
    }
    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("Before class");
    }

    @AfterClass

    public static void afterClass()
    {
        System.out.println("After class");
    }

    @Test
    public void givenNumberShouldReturnTheReverseOfActual() {
        //act
        int actualResult = sortedDigits.digitSorting(145123);
        //assert
        assertEquals(112345, actualResult);
    }
    @Test
    public void givenNumberShouldReturnTheActual() {
        //act
        int actualResult = sortedDigits.digitSorting(541287);
        //assert
        assertEquals(124578, actualResult);
    }
    @Test
    public void givenNumberShouldNotZero() {
        //act
        int actualResult = sortedDigits.digitSorting(0);
        //assert
        assertEquals(0, actualResult);
    }
}