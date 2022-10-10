package other;

public class ZerosFirst {

    public static void main(String[] args) {
        int[] nums = {0, 3, 4, 1, 0, 5, 0, 8};
        moveZerosOrdered(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void moveZeros(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (high > low) {

            if (nums[low] == 0) {
                low++;
            } else if (nums[high] == 0) {

                swap(nums, low, high);
                low++;
                high--;
            } else high--;
        }
    }

    public static void swap(int[] nums, int low, int high) {
        nums[low] = nums[low] + nums[high];
        nums[high] = nums[low] - nums[high];
        nums[low] = nums[low] - nums[high];
    }

    public static void moveZerosOrdered(int[] nums) {

        int slow = nums.length - 1;
        int fast = slow - 1;

        while (fast >= 0) {
            if (nums[slow] !=0) {
                fast--;
                slow--;
            } else {
                swap(nums, fast, slow);
                fast--;
                slow--;
            }
            if(nums[fast] == 0 && nums[slow] ==0){
                fast --;
            }
        }


    }
}
