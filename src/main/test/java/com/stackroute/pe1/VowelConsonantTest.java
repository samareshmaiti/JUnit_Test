package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelConsonantTest {
    VowelConsonant vowelConsonant;

    @Before
    public void setUp()
    {
        this.vowelConsonant=new VowelConsonant();
    }
    @After
    public void tearDown()
    {
        vowelConsonant=null;
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
    public void givenStringShouldReturnTheResult() {
        //act
        String actualResult = vowelConsonant.vowelOrConsonant("Hello");
        //assert
        assertEquals("consonantvowelconsonantconsonantvowel", actualResult);
    }
    @Test
    public void givenStringShouldReturnEnterNonEmptyString() {
        //act
        String actualResult = vowelConsonant.vowelOrConsonant(null);
        //assert
        assertNotNull("enter non emptystring", actualResult);
    }
    @Test
    public void givenNothingShouldReturnNothing() {
        //act
        String actualResult = vowelConsonant.vowelOrConsonant("");
        //assert
        assertEquals("", actualResult);
    }
    }