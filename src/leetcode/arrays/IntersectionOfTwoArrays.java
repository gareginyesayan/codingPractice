package leetcode.arrays;
/*
* Given two integer arrays nums1 and nums2, return an array of their intersection.
* Each element in the result must be unique and you may return the result in any order.
* */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(intersection(nums1, nums2));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1= new HashSet<>();
        Set<Integer> intersect= new HashSet<>();

        for (int i = 0; i < nums1.length; i++){
                set1.add(nums1[i]);
            }
        for (int i = 0; i < nums2.length; i++){
            if(set1.contains(nums2[i]))
                intersect.add(nums2[i]);
        }
        int[] answer = new int[intersect.size()];

        int i = 0;
        for (int s: intersect)
            answer[i++] = s;

        return answer;
    }




}
