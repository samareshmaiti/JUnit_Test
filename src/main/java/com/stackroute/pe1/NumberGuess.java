package com.stackroute.pe1;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int number1 = 30;
        boolean guess = false;
        while (guess == false) {

            System.out.println("Enter a number");
            int number = sc.nextInt();

            if (number > number1)
                System.out.println("given number is larger");
            else if (number < number1)
                System.out.println("given number is lesser");
            else
                System.out.println("you put the correct number and number is" + number1);

        }
    }

}
