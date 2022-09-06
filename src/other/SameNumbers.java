package other;/*
Check when multiplying a six-digit number with 2 gives a number that has all the same numbers. For example, 142857 x 2 = 285714
*/


import java.util.Arrays;

public class SameNumbers {

    public static void main(String[] args) {

        long n = 142857;
        System.out.println("n = " + n);
        System.out.println("n = " + 2*n);
        System.out.println(isSameNumbers(n));

    }

    public static boolean isSameNumbers(long n){

        long n2 = 2 * n;
        String nString = String.valueOf(n);
        String n2String = String.valueOf(n2);
        char[] nArray = (nString.toCharArray());
        char[] n2Array = n2String.toCharArray();
        Arrays.sort(nArray);
        Arrays.sort(n2Array);
        if (Arrays.equals(nArray,n2Array))
            return true;
        else return false;
    }

}
