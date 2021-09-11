package leetcode.removeElement_DoubleIndex;

import java.util.HashMap;

public class No1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
            for(int i = 0 ; i < nums.length ; i++){
                if(map.containsKey(target-nums[i])){
                    return new int[]{i,map.get(target-nums[i])};
                }else{
                    if(map.containsKey(nums[i])){
                        map.replace(nums[i],i);
                    }else{
                        map.put(nums[i],i);
                    }
                }
            }
            return null;
        }
    }
}
