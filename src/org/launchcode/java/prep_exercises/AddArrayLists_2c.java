package org.launchcode.java.prep_exercises;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by msroc on 5/11/2017.
 * Write a method that takes in two ArrayLists of ints and adds them together.
 * Be sure to take the size of the lists into account.
 * Ex: (3, 4, 5, 1) + (1, 6) = (4, 10, 5, 1)
 */
public class AddArrayLists_2c {
    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {
        //find out which one is bigger
        ArrayList<Integer> bigger = a;
        ArrayList<Integer> smaller = b;
        if(a.size() < b.size()) {
            bigger = b;
            smaller = a;
        }
        //create a new array list that holds the results
        ArrayList<Integer> result = new ArrayList<Integer>();

        //for each index in larger list
        for (int x=0; x < bigger.size(); x++) {
            //if index exists in smaller list
            if (x < smaller.size()) {
                //add values, store in result
                result.add(bigger.get(x) + smaller.get(x));
            //else
            //put value from larger list in result
            }else {
                result.add(bigger.get(x));
            }
        }
        //return result
        return (result);
    }

    public static void main(String[] args){
        Integer[] aInt = {3, 4, 5, 1};
        Integer[] bInt = {1, 6};
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(aInt));
        ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(bInt));
        System.out.println(AddArrayLists_2c.add(a, b));
    }
}
