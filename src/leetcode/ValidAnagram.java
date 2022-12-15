package leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @author Garegin
 *Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or
phrase, typically using all the original letters exactly once.
 */
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));


    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        StringBuilder temp = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++) {
            int ind = temp.indexOf(String.valueOf(t.charAt(i)));
            if(ind == -1) {
                return false;
            }
            temp.replace(ind, ind+1, "");
        }

        return true;

    }

}
