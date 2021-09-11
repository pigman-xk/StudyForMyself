package leetcode.removeElement_DoubleIndex;

public class No383 {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] arr = new int[26];
            for(char i : ransomNote.toCharArray()){
                arr[i-'a']+=1;
            }
            for(char i : magazine.toCharArray()){
                arr[i-'a']-=1;
            }
            for(int i : arr){
                if(i>0){
                    return false;
                }
            }
            return true;
        }
    }
}
