package leetcode.removeElement_DoubleIndex;

import java.util.HashMap;

public class No454 {
    class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            HashMap<Integer,Integer> AB = new HashMap<Integer,Integer>();
            for(int i : nums1){
                for(int j :nums2){
                    if(AB.containsKey(i+j)){
                        AB.replace(i+j,AB.get(i+j)+1);
                    }else{
                        AB.put(i+j,1);
                    }
                }
            }
            int sum = 0;
            for(int i : nums3){
                for(int j :nums4){
                    int temp = i+j;
                    if(AB.containsKey(-temp)){
                        sum+=AB.get(-temp);
                    }
                }
            }
            return sum;
        }
    }
}
