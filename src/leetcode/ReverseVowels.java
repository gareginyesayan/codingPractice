package leetcode;


/**
 * @author Garegin
 * Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 *
 */
public class ReverseVowels {

    public static void main(String[] args) {
        String s = "ReverseVowels";
        System.out.println(reverseOnlyVowels(s));


    }

    public static String reverseOnlyVowels(String s) {
        StringBuilder reverseBuilder = new StringBuilder(s);
        int start = 0;
        int end = s.length()-1;
        String vowelString = "aeiouAEIOU";


        while(end > start) {
            if(vowelString.indexOf(reverseBuilder.charAt(start))== -1) {
                start++;
                continue;
            }
            if(vowelString.indexOf(reverseBuilder.charAt(end))== -1) {
                end--;
                continue;
            }

            reverseBuilder.setCharAt(start, s.charAt(end));
            reverseBuilder.setCharAt(end, s.charAt(start));
            start++;
            end--;

        }


        return reverseBuilder.toString();

    }

}
