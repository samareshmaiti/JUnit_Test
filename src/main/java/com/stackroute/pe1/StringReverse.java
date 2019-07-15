package com.stackroute.pe1;
import java.util.Scanner;

public class StringReverse {
    public String reverseOfString(String inputString)
    {
        if(inputString==null)
        {
           return "String should be not null";
        }
        String reverseString = "";

        for(int i = inputString.length() - 1; i >= 0; i--)
        {
            reverseString = reverseString + inputString.charAt(i);
        }
        return reverseString;
    }
}
