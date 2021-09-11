package leetcode.removeElement_DoubleIndex;

public class JZOffer58_2 {
    class Solution {
        public String reverseLeftWords(String s, int n) {
            StringBuilder str = new StringBuilder(s);
            reverseString(str, 0,n-1 );
            reverseString(str,n,str.length()-1);
            reverseString(str,0,str.length()-1);
            return str.toString();
        }

    }
    static void reverseString (StringBuilder str , int left,int right){
        while(left<right){
            char temp = str.charAt(right);
            str.setCharAt(right,str.charAt(left));
            str.setCharAt(left,temp);
            left++;
            right--;
        }
    }
}
