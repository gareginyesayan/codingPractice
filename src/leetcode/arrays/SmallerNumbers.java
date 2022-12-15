package leetcode.arrays;

/*
*Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
* That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.
*
* Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
* */

public class SmallerNumbers {

    public static void main(String[] args) {
//        int[] nums = new int[]{7,7,7,7};
        int[] nums = new int[]{8,1,2,2,3};
        int[] result = smallerNumbersThanCurrent(nums);
        for (int num: result){
            System.out.print(num);
        }
    }

    public static int[] smallerNumbersThanCurrentBF(int[] nums) {
        int[] result = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int smallNumbersCount = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[j] < nums[i])
                    smallNumbersCount++;
            }
            result[i]= smallNumbersCount;
        }

        return result;
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int[] counts = new int[101];

        for(int i=0; i<nums.length; i++){
            counts[nums[i]]++;
        }
        for (int i = 1; i < 101; i++) {
            counts[i] += counts[i - 1];
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                result[i]=0;
            else
                result[i] = counts[nums[i]-1];


        }

        return result;
    }

}
