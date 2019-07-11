package com.stackroute;

import java.util.Scanner;

public class TomJerry {

    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scan.nextInt();

        if ((number > 20) && (number <30)) {
            if (number % 2 == 0) {
                System.out.println("Tom");
            } else {
                System.out.println("Jerry");
            }
        } else {
            System.out.println("Please enter a number between 20 nd 30");
        }

    }
}
