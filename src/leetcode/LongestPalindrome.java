package leetcode;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

/**
 * @author Garegin
 *Given a string s which consists of lowercase or uppercase letters, return the length
 *of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "abcccddc";
        System.out.println(longestPalindromeLength(s));

    }

    public static int  longestPalindromeLength(String s) {

        HashMap<Character, Integer> counts = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            Character c = Character.valueOf(s.charAt(i));
            counts.put(c, counts.getOrDefault(c, 0)+1);
        }

        int middleChar = 0;
        int sum = 0;
        for (Character key: counts.keySet()) {
            if(counts.get(key)%2 == 0)
                sum += counts.get(key);
            else {
                middleChar = 1;
                sum += counts.get(key)-1;
            }
        }



        return sum + middleChar;

    }

}
