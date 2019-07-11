package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class IterationTest {

    Iteration iteration;
    @Before
    public void setup() {
        System.out.println("Inside before");
        this.iteration = new Iteration();
    }
    @After
    public void tearDown()
    {
        System.out.println("inside after");
        this.iteration =new Iteration();
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
    public void givenInputZeroShouldShowAssertionError() {
        int actualResult= iteration.showIteration(0);
        assertEquals("AssertionError", actualResult);
    }
    @Test
    public void givenInputGreaterThanZeroShouldShowOutput() {
        int actualResult= iteration.showIteration(6);
        assertEquals("122333444455555", actualResult);
    }


}