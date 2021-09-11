package leetcode.removeElement_DoubleIndex;

import java.util.ArrayList;
import java.util.HashMap;

public class No350 {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer,Integer> map1 = new HashMap<Integer, Integer>();
            HashMap<Integer,Integer> map2 = new HashMap<Integer, Integer>();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i :nums1){
                if(map1.containsKey(i)){
                    map1.replace(i,map1.get(i)+1);
                }else{
                    map1.put(i,1);
                }
            }
            for(int i :nums2){
                if(map2.containsKey(i)){
                    map2.replace(i,map2.get(i)+1);
                }else{
                    map2.put(i,1);
                }
            }
            for(int i : map1.keySet()){
                if(map2.containsKey(i)){
                    for(int j =0;j<Math.min(map1.get(i),map2.get(i));j++){
                        arr.add(i);
                    }
                }
            }
            int index = 0 ;
            int[] result = new int[arr.size()];
            for(int i : arr){
                result[index++]=i;
            }
            return result;
        }
    }
}
