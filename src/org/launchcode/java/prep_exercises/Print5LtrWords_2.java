package org.launchcode.java.prep_exercises;

/**
 * Created by msroc on 5/10/2017.
 * ArrayList and Strings: Write a static method to print out each word in a list that has exactly 5 letters.
 */

public class Print5LtrWords_2 {

    public static void array5LtrWords(String[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == 5) {
                System.out.println(array[i]);
            }
        }
    }

        public static void main(String[] args) {
            String[] test = {"Fort", "Mason", "James", "Jane", "Brian", " ", "peony"};
            Print5LtrWords_2.array5LtrWords(test);
        }

}
