package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by msroc on 5/8/2017.
 */
public class Area {
    public static void main(String[] args) {
        double radius;
        double cArea;
        double pi = 3.14;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = in.nextDouble();

        while (radius < 0) {
            System.out.println("Error:  Radius cannot be negative.  Please enter a new value: ");
            radius = in.nextDouble();
        }

        cArea = (pi * (radius * radius));
        System.out.println("The area of a circle of radius " + radius + " is: " + cArea);
    }

}
