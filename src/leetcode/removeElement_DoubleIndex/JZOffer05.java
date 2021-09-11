package leetcode.removeElement_DoubleIndex;

public class JZOffer05 {
    class Solution {
        public String replaceSpace(String s) {//扩容+从后往前填充：先统计空格，再计算新字符串长度
            int k = 0;
            for(char i : s.toCharArray()){
                if(i==' '){
                    k++;
                }
            }
            char [] arr = new char[s.length()+2*k];
            int index = arr.length-1;
            for(int i = s.length()-1 ; i>=0 ; i--){
                if(s.charAt(i)!=' '){
                    arr[index--] = s.charAt(i);
                }else{
                    arr[index--]='0';
                    arr[index--]='2';
                    arr[index--]='%';
                }
            }
            return String.valueOf(arr);
        }
    }
}
