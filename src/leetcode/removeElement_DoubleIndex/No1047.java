package leetcode.removeElement_DoubleIndex;

import java.util.Stack;

public class No1047 {
    class Solution {
        public String removeDuplicates(String s) {
            Stack<Character> stack = new Stack<>();
            for(int i = s.length()-1;i>=0;i--){
                if(!stack.isEmpty()&&stack.peek()==s.charAt(i)){
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            }
            StringBuilder str = new StringBuilder();
            while(!stack.isEmpty()){
                str.append(stack.pop());
            }
            return str.toString();
        }
    }
}
