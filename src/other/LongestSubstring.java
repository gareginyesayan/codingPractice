package other;/*
* Write a Java program to find the longest substring from a given string which doesn’t contain any duplicate characters?*/


public class LongestSubstring {

    public static void main(String[] args) {

        String str = "developers_write_unit_tests";
        System.out.println(longestSbstr(str));
        System.out.println(longestSbstr(str).length());

    }

    public static String longestSbstr(String str){
        int dupIndex;


        if (str.length()==0) return str;
        String substr = Character.toString(str.charAt(0));
        String temp = Character.toString(str.charAt(0));
        for (int i=1; i < str.length(); i++){
            if (!temp.contains(Character.toString(str.charAt(i)))){
                temp = temp + str.charAt(i);
                if (temp.length() > substr.length()){
                    substr = temp;
                }
            } else {
                dupIndex = temp.indexOf(str.charAt(i));
                temp =  temp.substring(dupIndex+1) + str.charAt(i);
            }
        }

        return substr;
    }
}
