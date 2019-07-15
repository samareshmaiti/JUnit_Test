package com.stackroute.pe1;
public class CapitalSmallLetter {

    public String findType(char ch)
    {

        if(ch>=65 && ch<=90)
        {
            return "Capital Letter";
        }
        if(ch>=97 && ch<=122)
        {
            return "Small Letter";
        }
        if(ch>=48 && ch<=57)
        {
            return "Digit";
        }
        if(ch>=32 && ch<=47) {

            return "Special Character";
        }

       else
          return "give proper input";
    }
}
