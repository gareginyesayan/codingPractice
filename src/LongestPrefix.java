/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */

public class LongestPrefix {
    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        String prefix = returnLongestPrefix(strs);
        System.out.println(prefix);
    }

    public static String returnLongestPrefix(String[] strs) {
        String prefix = "";
        int i = 0;
        do {
            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    return prefix;
                }
                if (strs[j].charAt(i) != strs[0].charAt(i)) {
                    return prefix;
                }
            }
            prefix = prefix + strs[0].charAt(i);
            i++;
        } while (true);

    }
}
