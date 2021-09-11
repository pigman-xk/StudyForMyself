package leetcode.removeElement_DoubleIndex;

public class No242 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            int[] arr = new int[26];
            for(int i : s.toCharArray()){
                arr[i-'a']+=1;
            }
            for(int i : t.toCharArray()){
                arr[i-'a']-=1;
            }
            for(int i : arr){
                if(i!=0){
                    return false;
                }
            }
            return true;

        }
    }
}
