package com.stackroute.pe1;
public class CapitalSmallLetter {

    public String findType(char inputCharacter)
    {

        if(inputCharacter>=65 && inputCharacter<=90)
        {
            return "Capital Letter";
        }
        if(inputCharacter>=97 && inputCharacter<=122)
        {
            return "Small Letter";
        }
        if(inputCharacter>=48 && inputCharacter<=57)
        {
            return "Digit";
        }
        if(inputCharacter>=32 && inputCharacter<=47) {

            return "Special Character";
        }

       else
          return "give proper input";
    }
}
