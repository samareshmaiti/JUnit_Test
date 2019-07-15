package com.stackroute.pe1;
import java.util.Scanner;

public class SubstringRepeat {

    public String substringConcat(String inputString,int number)
    {
        if(inputString==null)
        {
            return "string must be non null";
        }
        if(inputString.length()<number)
        {
            return "string must be larger than the number";
        }
        String resultString="";
        int lengthOfString=inputString.length();
        String subString=inputString.substring(lengthOfString-number,lengthOfString);

        for(int i=0;i<number;i++)
        {
            resultString+=subString;
        }
        return inputString.concat(resultString);

    }
}
