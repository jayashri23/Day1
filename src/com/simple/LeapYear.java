package com.simple;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter year");
        int year;
        try (Scanner sc = new Scanner(System.in)) {
            year = sc.nextInt();
        }
        if (year >= 1582) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println("Specific year :" + year+ "is a leap year");
        } else {
            System.out.println("Specific year :" + year +"is not a leap year");
        }

    }
}