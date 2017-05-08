package org.launchcode.java.prep_exercises;

import java.util.Scanner;

/**
 * Created by msroc on 5/7/2017.
 */
public class Area_of_Rectangle_1 {
    public static void main(String[] args) {
        Float rWidth;
        Float rLength;
        Float rArea;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the width of the Rectangle: ");
        rWidth = in.nextFloat();
        System.out.println("Enter the length of the Rectangle: ");
        rLength = in.nextFloat();

        rArea = rWidth * rLength;

        System.out.println("The area of the rectangle is: " + rArea);
    }
}
