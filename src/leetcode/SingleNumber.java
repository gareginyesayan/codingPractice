package leetcode;

import org.jetbrains.annotations.Contract;

import java.util.Calendar;
import java.util.Locale;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4};
        System.out.println(singleNumber(nums));
        //[A-Za-z !,?._'@]+
        //[       !,?._'@]+

    }

    
    private static int singleNumber(int[] nums) {

        int xor = nums[0];
        for (int i =1; i < nums.length; i++){
            xor ^=nums[i];
        }

        return xor;
    }

}
