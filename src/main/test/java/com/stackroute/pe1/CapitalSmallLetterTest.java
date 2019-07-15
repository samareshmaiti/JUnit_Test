package com.stackroute.pe1;


import org.junit.*;

import static org.junit.Assert.*;

public class CapitalSmallLetterTest {

        CapitalSmallLetter capitalSmallLetter;
        @Before
        public void setup() {
            System.out.println("Inside before");
            this.capitalSmallLetter= new CapitalSmallLetter();
        }
        @After
        public void tearDown()
        {
            System.out.println("inside after");
            capitalSmallLetter=null;
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
    public void givenInputShouldReturnTypeOfCapitalLetter() {
            //act
            String actualResult=capitalSmallLetter.findType('A');
            //assert
        assertEquals("Capital Letter", actualResult);
    }

    @Test
    public void givenInputShouldReturnTypeOfSmallLetter() {
            //act
        String actualResult=capitalSmallLetter.findType('b');
        //assert
        assertEquals("Small Letter", actualResult);
    }
    @Test
    public void givenInputShouldReturnTypeOfDigit() {
            //act
        String actualResult=capitalSmallLetter.findType('8');
        //assert
        assertEquals("Digit", actualResult);
    }
    @Test
    public void givenInputShouldReturnTypeOfSpecialCharacter() {
            //act
        String actualResult=capitalSmallLetter.findType('!');
        //assert
        assertEquals("Special Character", actualResult);
    }
    @Test
    public void givenInputShouldBeNotNull() {
            //act
        String actualResult = capitalSmallLetter.findType('.');
        //assert
        assertNotNull("string should be not nul",actualResult);
    }
}