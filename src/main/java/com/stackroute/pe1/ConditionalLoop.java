package com.stackroute.pe1;
import java.util.Scanner;

public class ConditionalLoop {
    public String findResult(int number)
    {

        if((number>=20 && number<=30) &&(number%2==0))
        {
            return "Tom";
        }
        if((number>=20 && number<=30) &&(number%2!=0))
        {
            return "Jerry";
        }
        else
            return "Out of range";

    }
}
