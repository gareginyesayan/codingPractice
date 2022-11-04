/*
* Given a sorted array of distinct integers and a target value,
* return the index if the target is found.
* If not, return the index where it would be if it were inserted in order.
*Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
* */



package leetcode;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1,2, 3,5,6};
        int target = 4;
        System.out.println(searchPosition(nums, target));
    }

    public static int searchPosition(int[] nums, int target){
        int firstIndex = 0;
        int lastIndex = nums.length-1;
        int position;
        if (nums[lastIndex] == target) return lastIndex;
        if (nums[lastIndex] < target) return lastIndex + 1;
        if (nums[firstIndex] >= target) return firstIndex;
        while(lastIndex -firstIndex > 1){
            position = firstIndex + (lastIndex-firstIndex)/2;
            if (nums[position] == target) return position;
            if (nums[position] > target)
                lastIndex = position;
            else firstIndex = position;
        }


        return lastIndex;
    }
}
