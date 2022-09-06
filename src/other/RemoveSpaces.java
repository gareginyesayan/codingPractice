package other;
/*
 * Write Java code to get rid of multiple spaces from a string?
 * */

import java.util.ArrayList;
import java.util.StringTokenizer;

public class RemoveSpaces {

    public static void main(String[] args) {
        String str = "  removing  extra                   spaces from     string   ";
        System.out.println(removeExtraSpeces(str));
        System.out.println(removeExtraSpeces2(str));
        System.out.println(removeExtraSpeces3(str));
        System.out.println(removeExtraSpeces4(str));


    }

    public static String removeExtraSpeces(String str) {

        StringTokenizer substr = new StringTokenizer(str, " ");
        StringBuffer sb = new StringBuffer();

        while (substr.hasMoreElements()) {
            sb.append(substr.nextElement()).append(" ");
        }
        return sb.toString().trim();
    }

    public static String removeExtraSpeces2(String str) {

        String[] words = str.split("\\s+");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static String removeExtraSpeces3(String str) {

        while (str.contains("\s\s")) {
            str = str.replace("\s\s", "\s");
        }

        return str.trim();
    }

    public static String removeExtraSpeces4(String str) {

        String sb = "";

        boolean previousSpace = true;
        for (int i = 0; i < str.length(); i++) {
            if (!previousSpace) {
                sb = sb + str.charAt(i);
                previousSpace = false;
            } else if (str.charAt(i) != ' ') {
                sb = sb + str.charAt(i);
                previousSpace = false;
            }
            if (str.charAt(i) == ' ') {
                previousSpace = true;
            }
        }

        return sb.trim();
    }
}
