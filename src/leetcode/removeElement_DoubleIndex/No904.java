package leetcode.removeElement_DoubleIndex;

import java.util.HashMap;

public class No904 {
    class Solution {
        public int totalFruit(int[] fruits) {
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            int slow = 0;
            int result = Integer.MIN_VALUE;
            for(int i =0;i<fruits.length;i++){
                if(map.containsKey(fruits[i])){
                    map.replace(fruits[i],map.get(fruits[i])+1);
                }else{
                    map.put(fruits[i],1);
                }
                while(map.size()>=3){
                    map.replace(fruits[slow],map.get(fruits[slow])-1);
                    if(map.get(fruits[slow])==0){
                        map.remove(fruits[slow]);
                    }
                    slow++;
                }
                result = Math.max(result,i-slow+1);
            }
            return result;
        }
    }
}
