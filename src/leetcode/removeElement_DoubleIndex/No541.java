package leetcode.removeElement_DoubleIndex;

public class No541 {
    class Solution {
        public String reverseStr(String s, int k) {
            char [] arr = s.toCharArray();
            for(int i = 0 ; i < s.length() ; i += 2 * k){
                int left = i;
                int right = i+k-1;
                if(right>s.length()-1){
                    right=s.length()-1;
                }
                while(left<right){
                    char temp = arr[right];
                    arr[right] = arr[left];
                    arr[left] = temp;
                    left++;
                    right--;
                }
            }
            return String.valueOf(arr);
        }
    }
}
