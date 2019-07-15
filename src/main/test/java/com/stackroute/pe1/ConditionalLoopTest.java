package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class ConditionalLoopTest {
    ConditionalLoop conditionalLoop;
    @Before
    public void setup() {
        System.out.println("Inside before");
        this.conditionalLoop= new ConditionalLoop();
    }
    @After
    public void tearDown()
    {
        System.out.println("inside after");
        this.conditionalLoop=new ConditionalLoop();
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
    public void givenInputShouldOutOfRange() {
        //act
        String actualResult=conditionalLoop.findResult(100);
        //assert
        assertEquals("Out of range", actualResult);
    }
    @Test
    public void givenInputShouldReturnTom() {
        //act
        String actualResult=conditionalLoop.findResult(24);
        //assert
        assertEquals("Tom", actualResult);
    }
    @Test
    public void givenInputShouldReturnJerry() {
        //act
        String actualResult=conditionalLoop.findResult(25);
        //assert
        assertEquals("Jerry", actualResult);
    }



}