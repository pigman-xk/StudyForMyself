package leetcode.removeElement_DoubleIndex;

import java.util.Stack;

public class No20 {
    class Solution {
        public boolean m(char c1 , char c2){
            if(c1=='('&&c2!=')'){
                return false;
            }
            if(c1=='{'&&c2!='}'){
                return false;
            }
            if(c1=='['&&c2!=']'){
                return false;
            }
            return true;
        }
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<Character>();
            for(int i = 0 ; i < s.length() ; i++){
                char c  = s.charAt(i);
                if(c=='('||c=='{'||c=='['){
                    stack.push(c);
                }else {
                    if(!stack.isEmpty()&&m(stack.peek(),c)){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
            if(stack.isEmpty()){
                return true;
            }else {
                return false;
            }
        }
    }
}
