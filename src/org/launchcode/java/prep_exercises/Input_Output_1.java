package org.launchcode.java.prep_exercises;

import java.util.Scanner;

/**
 * Created by msroc on 5/7/2017.
 */
public class Input_Output_1 {
    public static void main(String[] args) {
        String uName;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        uName = in.next();

        System.out.println("Hello, " + uName + "!");
    }
}
