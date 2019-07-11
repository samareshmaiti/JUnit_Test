package com.stackroute.pe1;
import java.util.Scanner;

public class Iteration {

    public int showIteration(int number) {
        int result = number;

        for (int j = 1; j <= number; j++) {
            for (int i = 1; i <= j; i++) {
                result = j;
            }


        }
        System.out.println(result);
        return result;

    }
}
