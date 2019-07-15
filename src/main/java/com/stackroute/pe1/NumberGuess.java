package com.stackroute.pe1;
import java.util.Scanner;

public class NumberGuess {
    public String  numberGuessing(int number)
    {
        String resultString="";
        int number1 = 30;
        boolean guess=false;
        do {

            if (number > number1)
                resultString="given number is larger";
            else if (number < number1)
                resultString="given number is lesser";
            else if(number==30)
                resultString="you put the correct number and number is";

        }
        while(guess==true);
        return resultString;
    }

}
