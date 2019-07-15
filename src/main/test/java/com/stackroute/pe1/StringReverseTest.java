package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse stringReverse;

    @Before
    public void setUp()
    {
        this.stringReverse=new StringReverse();
    }
    @After
    public void tearDown()
    {
        stringReverse=null;
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
    public void givenNullShouldThrowNullPointerException() {
        //act
        String actualResult = stringReverse.reverseOfString("samar");
        //assert
        assertNotEquals("should be same","rama","ramas");

    }
    @Test
    public void givenStringShouldReturnTheReverse() {
        //act
        String actualResult = stringReverse.reverseOfString("Hello");
        //assert
        assertEquals("olleH", actualResult);
    }
    @Test
    public void givenStringShouldBeNotNull() {
        //act
        String actualResult = stringReverse.reverseOfString(null);
        //assert
        assertNotNull("string should be not nul",actualResult);
    }

}