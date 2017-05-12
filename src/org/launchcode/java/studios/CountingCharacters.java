package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by msroc on 5/11/2017.
 */
public class CountingCharacters {
    public static void NumCharsInStr(String uStr) {
        char[] charactersInString = uStr.toCharArray();
        HashMap<Character, Integer> chars = new HashMap<Character, Integer>();

        for (int i=0; i < charactersInString.length; i++) {
            char ltr = charactersInString[i];

            if (!chars.containsKey(ltr)) {
                chars.put(ltr, 1);
            } else {
                chars.put(ltr, chars.get(ltr) + 1);
            }
        }

        for (Character c : chars.keySet()) {
            System.out.println(c + ": " + chars.get(c));
        }
    }

    public static void main(String[] args){
        String userStr = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula " +
                "scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. " +
                "Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, " +
                "volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        CountingCharacters.NumCharsInStr(userStr);
    }
}
