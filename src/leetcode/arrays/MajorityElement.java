package leetcode.arrays;

import java.util.HashMap;

/*Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
        You may assume that the majority element always exists in the array.
        */
public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums));

    }
    public static int majorityElement(int[] nums){
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for (int i = 0; i < nums.length; i++){

            frequency.put(nums[i], frequency.getOrDefault(nums[i],0)+1);
            if(frequency.get(nums[i]) > nums.length/2){
                return nums[i];
            }
;        }
        return Integer.MAX_VALUE;
    }
}
