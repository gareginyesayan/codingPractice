package leetcode;/*
Given an unsorted integer array nums, return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) time and uses constant extra space.

Examples:
Input: nums = [3,4,-1,1]
Output: 2

Input: nums = [7,8,9,11,12]
Output: 1
 */

public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] nums = {1,2,0};
//        int[] nums = {3,4,-1,1};
//        int[] nums = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));



    }

    public static int firstMissingPositive(int[] nums) {
        int n= nums.length;
        boolean all_negative = true;
        int[] val = new int[n];
        for (int i = 1; i<=n; i++){
            val[i-1] = i;
        }
        for(int i = 0; i<n; i++) {
            if ((nums[i] <= n) && (nums[i] >0)) {
                val[nums[i]-1] = -1;
                all_negative = false;
            }
        }
        if (all_negative) {
            return 1;
        }
        int answer = n + 1;

        for(int i = 0; i<n; i++) {
            if (val[i]>0) {
                answer = val[i];
                break;
            }
        }
        return answer;
    }
}
