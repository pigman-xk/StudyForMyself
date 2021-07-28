package StudyProject.test;

import java.util.ArrayList;
import java.util.Stack;

public class DigitalReverse {
    public static void main(String[] args) {
        String s = String.valueOf(-123);
        String result = "";
        boolean flag = false;
        Stack stack= new Stack();
        for (int i =0;i<s.length();i++){
            if(s.charAt(i)=='-'){
                flag=true;
                continue;
            }
            stack.add(s.charAt(i));
        }
        while(true){
            char num = (char)stack.peek();
            if (num=='0'){
                stack.pop();
            }
            else{
                break;
            }
        }
        while(!stack.isEmpty()){
            char num = (char)stack.pop();
            if(num!='-'){
                result=result+new String(new char[]{num});
            }
        }
        if(flag){
            result=new String(new char[]{'-'})+result;
        }
        System.out.println(result);
    }
}
