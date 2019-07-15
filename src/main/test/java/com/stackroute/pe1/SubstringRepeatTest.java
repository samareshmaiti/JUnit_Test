package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class SubstringRepeatTest {
   SubstringRepeat substringRepeat1;
    @Before
    public void setup() {
        System.out.println("Inside before");
        this.substringRepeat1= new SubstringRepeat();
    }
    @After
    public void tearDown()
    {
        System.out.println("inside after");
        //this.substringRepeat1=new SubstringRepeat();
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
    public void givenInputAndShouldProperOutput() {
        //act
        String actualResult=substringRepeat1.substringConcat("Stackroute",5);
        //assert
        assertEquals("Stackrouterouterouterouterouteroute", actualResult);
    }
    @Test
    public void givenInputAndShowProperOutput() {
        //act
        String actualResult=substringRepeat1.substringConcat("Stackroute",2);
        //assert
        assertEquals("Stackroutetete", actualResult);
    }
    @Test
    public void givenStringLengthShouldBeLarger() {
        //act
        String actualResult=substringRepeat1.substringConcat("Sta",5);
        //assert
        assertEquals("string must be larger than the number", actualResult);
    }
    @Test
    public void givenStringLengthShouldBeGreaterThanZero() {
        //act
        String actualResult=substringRepeat1.substringConcat(null,5);
        //assert
        assertEquals("string must be non null", actualResult);
    }



}