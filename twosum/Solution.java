package twosum;

import java.util.HashMap;
import java.util.Map;
/*
 * Answer taken from ChatGPT, This is a hashing problem
 */
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            //search for complement in hashmap 
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                //if found return value of map which is index and current index
                return new int[] {map.get(complement), i};
            }
            //otherwise keep putting numbers in key and value put the index number
            map.put(nums[i], i);
        }
        return nums;
        

    }

    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        int[] nu = twoSum(nums1, target1);
        for(int i : nu)
        System.out.println(i);
    }
    } 
