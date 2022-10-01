package com.simple;

import java.util.Scanner;

public class SumCount {
    public static void main(String [] args) {
        int n, sum = 0 ,cnt=0;
        System.out.println("Calculates Sum for below Integers");
        for (int i = 0; i < args.length; i++) {
            try {
                n=Integer.parseInt(args[i]);
                sum= sum+n;
            } catch (NumberFormatException e)
            {
                //System.out.println("Invalid integers:");
                cnt++;
            }
        }
        System.out.println("Sum of valid integers:" +sum);
        System.out.println("Count of invalid integers:" +cnt);
    }
}
