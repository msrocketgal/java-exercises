package org.launchcode.java.prep_exercises;

import java.util.Scanner;

/**
 * Created by msroc on 5/7/2017.
 */
public class Calc_MPG_1 {
    public static void main(String[] args) {
        Float miles;
        Float gallons;
        Float mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the number of miles driven: ");
        miles = in.nextFloat();
        System.out.println("Enter the number of gallons used: ");
        gallons = in.nextFloat();

        mpg = miles / gallons;

        System.out.println("The calculated MPG for your trip is: " + mpg);
    }
}
