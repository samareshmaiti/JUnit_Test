package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public void setUp()
    {
        this.palindrome=new Palindrome();
        System.out.println("Before");
    }
    @After
    public void tearDown()
    {

    }
    @Test
    public void givenInputAndShouldShowProperOutput() {
        //act
       String actualResult=palindrome.palindromeCheck(121);
       //assert
        assertEquals("Palindrome and sum less than 25", actualResult);
    }
    @Test
    public void givenInputAndShouldShowGiveNotNullValue()
    {
        //act
        String actualResult=palindrome.palindromeCheck(0);
        //assert
        assertNotNull("enter not null value");
    }
    @Test
    public void givenInputAndShouldShowProperOutputAsPalindrome() {
        //act
        String actualResult=palindrome.palindromeCheck(89898);
        //assert
        assertSame("Palindrome and sum less than 25", actualResult);
    }


}