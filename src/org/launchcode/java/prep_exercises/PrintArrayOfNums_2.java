package org.launchcode.java.prep_exercises;

/**
 * Created by msroc on 5/10/2017.
 * Arrays: Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
 * Then loop through the array and print out each value.
 */

public class PrintArrayOfNums_2 {

    public static void main(String[] args){
        // Declare and initialize an array of integers
        int[] numbers = {1, 1, 2, 3, 5, 8};

        // Loop over the array and print each number
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
