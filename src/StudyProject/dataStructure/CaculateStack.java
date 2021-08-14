package StudyProject.dataStructure;

import java.util.Stack;

public class CaculateStack {
    public static void main(String[] args) {
        Stack<Float> digitalStack = new Stack<Float>();//数栈
        Stack<String> elmentStack = new Stack<String>();//符号栈
        String express = "2*1*3*4-20+2*2";//计算表达式
        int index = 0;//指针
        String elemnt = "";//表达式遍历元素
        float result = -1;//计算结果过渡值
        while(true){
            if(index==express.length()){
                break;
            }//无需最后一次计算，最后总计算总会从最后的两个数开始计算，仍能保持计算的符号优先级   //计算代码
            elemnt = express.substring(index,index+1);
            if(elemnt.equals("+")||elemnt.equals("-")||elemnt.equals("*")||elemnt.equals("/")){//元素为符号进入
                if(elmentStack.isEmpty()){//判空直接入栈
                    elmentStack.push(elemnt);
                }
                else{//只有出现高优先级的的符号才进行特殊计算，目的是转换优先计算模式，从加减法优先到乘除法优先，直到乘除法计算完毕，目的是将算式变成同级运算
                    if((elmentStack.peek().equals("+")||elmentStack.peek().equals("-"))&&(elemnt.equals("*")||elemnt.equals("/"))){
                        elmentStack.push(elemnt);
                    }else{//只有出现比符号栈顶或相等或低优先度的符号才进行进入，两两计算，直到符号栈无在添加符号前，栈中没有比新添加符号优先级更高的符号。
                        result=elementCalculate(digitalStack.pop(),digitalStack.pop(),elmentStack.pop());
                        digitalStack.push(result);
                        elmentStack.push(elemnt);
                    }
                }
            }else{
                while(true){
                    if (index<express.length()-1&&Character.isDigit(express.charAt(index+1))){
                        index++;
                        elemnt = elemnt+express.substring(index,index+1);
                    }
                    break;
                }//判断是否为多位数
                int num = Integer.parseInt(elemnt);
                digitalStack.push((float)num);
            }
            index++;
        }
        while(!elmentStack.isEmpty()){
            result=elementCalculate(digitalStack.pop(),digitalStack.pop(),elmentStack.pop());
            digitalStack.push(result);
        }
        System.out.println(digitalStack.pop());
    }
    public static float elementCalculate(float num1,float num2,String element){
        float result=0;
        switch (element){
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num2-num1;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num2/num1;
        }//计算代码
        return result;
    }
}
