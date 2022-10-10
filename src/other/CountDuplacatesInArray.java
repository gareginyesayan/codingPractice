package other;

import java.util.*;

public class CountDuplacatesInArray {

    public static void main(String[] args) {
        Integer[] nums = {1,2,2,3,3,3,3,4,4,5,5,5,5};
        List<Integer> numbers = new ArrayList<>();
        numbers = Arrays.asList(nums);

        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0; i<nums.length; i++){

            if (m.containsKey(nums[i])){
                m.replace(nums[i], 6);
            } else {
                m.put(nums[i], 1);
            }

        }
        System.out.println(m);
        int count=0;
        for(int key: m.keySet()){
            if(m.get(key) >1) count++;

        }
        System.out.println(count);

    }
}
