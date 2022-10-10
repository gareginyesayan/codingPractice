/*
* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
* Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
*
* * Example:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
* */

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {

        int[] digits = {9, 9, 8, 9};
        for(int digit: plusOneOptimized(digits)){
            System.out.print(digit + " ");
        }

    }

    public static int[] plusOne(int[] digits){
        int n = digits.length;
        List<Integer> newDigits = new ArrayList<>();

        for (int i=0; i < n; i++){
            if(digits[n-1-i] != 9){
                newDigits.add(digits[n-1-i] + 1);
                break;
            } else if(i < n-1){
                newDigits.add(0);
            }else{
                newDigits.add(0);
                newDigits.add(1);
            }

        }
        int d = newDigits.size();
        int newArrayLength;
        if (d > n) {
            newArrayLength=d;
        } else newArrayLength = n;

        int[] newArray = new int[newArrayLength];

        for(int i =0; i<newArrayLength; i++){
            if(i < newArrayLength -d){
                newArray[i] = digits[i];
            }else newArray[i] = newDigits.get(newArrayLength-i -1);
        }
        return newArray;
    }

    public static int[] plusOneOptimized(int[] arr) {
        int i = arr.length-1;
        while(i>=0){
            if(arr[i] !=9){
                arr[i] = arr[i]+1;
                return arr;
            }
            arr[i] = 0;
            i--;
        }
        int[] res = new int[arr.length+1];
        res[0] = 1;
        return res;
    }


 }
