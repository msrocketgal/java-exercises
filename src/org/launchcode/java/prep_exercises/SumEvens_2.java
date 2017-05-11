package org.launchcode.java.prep_exercises;

/**
 * Created by msroc on 5/10/2017.
 * ArrayList: Write a static method to find the sum of all the even numbers in a list.
 * Within main, create a list with at least 10 integers and call your method on the list.
 */

public class SumEvens_2 {

    public static int arraySumEvens(int[] array) {
        int sumE = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                sumE = sumE + array[i];
            }
        }
        return sumE;
    }

    public static void main(String[] args){
        int[] test = {5, 3, 7, 10, 2, 199, 7, 5, 8, -9, 4, 4};
        int answer = SumEvens_2.arraySumEvens(test);
        System.out.println(answer);
    }
}
