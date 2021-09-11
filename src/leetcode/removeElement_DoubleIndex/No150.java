package leetcode.removeElement_DoubleIndex;

import java.util.Stack;

public class No150 {
    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> numStack = new Stack<>();
            Stack<Character> charStack = new Stack<>();
            for(String i : tokens){
                if(Character.isDigit(i.charAt(0))||i.length()>1){
                    numStack.push(Integer.parseInt(i));
                }else{
                    int num1 = numStack.pop();
                    int num2 = numStack.pop();
                    switch (i){
                        case "+": numStack.push(num2+num1);break;
                        case  "-": numStack.push(num2-num1);break;
                        case  "*":numStack.push(num2*num1);break;
                        case "/": numStack.push(num2/num1);
                    }
                }
            }
            return numStack.pop();
        }
    }
}
