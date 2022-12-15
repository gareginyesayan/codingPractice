package leetcode.arrays;

import java.util.HashMap;

/*You are given a 0-indexed string s consisting of only lowercase English letters, where each letter in s appears exactly twice.
You are also given a 0-indexed integer array distance of length 26.

Each letter in the alphabet is numbered from 0 to 25 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, ... , 'z' -> 25).

In a well-spaced string, the number of letters between the two occurrences of the ith letter is distance[i].
If the ith letter does not appear in s, then distance[i] can be ignored.

Return true if s is a well-spaced string, otherwise return false.

Example 1:
Input: s = "abaccb", distance = [1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
Output: true
*/
public class WellSpacedString {

    public static void main(String[] args) {
        String s = "abaccb";
        int [] distance = {1,3,0,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(checkDistances(s, distance));


    }

    public static boolean checkDistancesBF(String s, int[] distance) {

        for(int i = 0; i < s.length()-1; i++){
            if(s.indexOf(s.charAt(i))< i) {
                continue;
            }
            int ind = s.charAt(i) - 'a';
            int dist = -1;
            for(int j= i+1; j < s.length(); j++){
                if(s.charAt(j) == s.charAt(i)){
                    dist= j - i -1;
                    break;
                }
            }
            if(distance[ind] != dist)
                return false;
        }

        return true;
    }

    public static boolean checkDistances(String s, int[] distance) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), i);
            else
                if(distance[s.charAt(i)-'a'] != i - map.get(s.charAt(i)) -1)
                    return false;

        }
        return true;
    }
}
