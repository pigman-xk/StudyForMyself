package leetcode.removeElement_DoubleIndex;

public class No151 {
    class Solution {
        public String reverseWords(String s) {
            char[] c = s.toCharArray();
            int left = 0;
            int right = c.length-1;
            StringBuilder str = new StringBuilder();
            while(c[left]==' ') {
                left++;
            }
            while(c[right] == ' ') {
                right--;
            }
            while(left<=right){
                int index = right;
                while(index>=left&&c[index]!=' ')index--;
                for(int i=index+1;i<=right;i++){
                    str.append(c[i]);
                }
                if(index>left){
                    str.append(' ');
                }
                while(index>=left&&c[index]==' ')index--;
                right=index;
            }
            return str.toString();
        }
    }
}
