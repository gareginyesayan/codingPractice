/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
*/

package leetcode;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 10, 0, 0, 0, 0};
        int[] nums2 = {3, 5, 6, 8};
        mergeArrays(nums1, nums2);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }

    }

    public static void mergeArrays(int[] nums1, int[] nums2) {

        int n = nums2.length;
        int m = nums1.length - n;
        while (n > 0 && m > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[n + m - 1] = nums1[m - 1];
                m--;
            } else {
                nums1[n + m - 1] = nums2[n - 1];
                n--;
            }
        }
        while (n > 0) {
            nums1[n + m - 1] = nums2[n - 1];
            n--;
        }

    }
}
