package org.launchcode.java.prep_exercises;

import java.util.Scanner;

/**
 * Created by msroc on 5/7/2017.
 */
public class Find_in_String_1 {
    public static void main(String[] args) {
        String fullText;
        String srchText;
        Boolean found;
        Scanner in;

        fullText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or " +
                "conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        in = new Scanner(System.in);
        System.out.println("Enter the text for which to search: ");
        srchText = in.next();

        found = fullText.toLowerCase().contains(srchText.toLowerCase());

        System.out.println("Your entry was found in the text: " + found);

    }
}
