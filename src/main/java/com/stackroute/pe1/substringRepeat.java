package com.stackroute.pe1;
import java.util.Scanner;

public class substringRepeat {

    public String substringConcat(String str,int number)
    {
        //Scanner sc=new Scanner(System.in);
        if(str==null)
        {
            return "string must be non null";
        }
        if(str.length()<number)
        {
            return "string must be larger than the number";
        }
        //System.out.println("Enter the string");
        //String str=sc.nextLine();
        //System.out.println("Enter the integer");
        //int number=sc.nextInt();
        String result="";

        int lengthOfString=str.length();
        String sub=str.substring(lengthOfString-number,lengthOfString);
        //String result=str;
        for(int i=0;i<number;i++)
        {
            result=result+sub;
        }

        return str+result;

    }
}
