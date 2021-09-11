package leetcode.removeElement_DoubleIndex;

import java.util.HashSet;

public class No349 {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set1= new HashSet<Integer>();
            HashSet<Integer> set2= new HashSet<Integer>();
            for(int i : nums1){
                set1.add(i);
            }
            for(int i : nums2){
                if(set1.contains(i)){
                    set2.add(i);
                }
            }
            int[] arr = new int[set2.size()];
            int index=0;
            for(int i : set2){
                arr[index]=i;
                index++;
            }
            return arr;
        }
    }
}
