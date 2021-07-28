package StudyProject.dataStructure;

import java.util.Stack;

public class CaculateStack {
    public static void main(String[] args) {
        Stack<Float> digitalStack = new Stack<Float>();//数栈
        Stack<String> elmentStack = new Stack<String>();//符号栈
        String express = "2*1*3*4-20";//计算表达式
        int index = 0;//指针
        String elemnt = "";//表达式遍历元素
        float result = -1;//计算结果过渡值
        while(true){
            if(index==express.length()){
                Float finalnum1 = digitalStack.pop();
                Float finalnum2 = digitalStack.pop();
                String finalelment = elmentStack.pop();
                switch (finalelment){
                    case "+":
                        result = finalnum1+finalnum2;
                        break;
                    case "-":
                        result = finalnum2-finalnum1;
                        break;
                    case "*":
                        result = finalnum1*finalnum2;
                        break;
                    case "/":
                        result = finalnum2/finalnum1;
                }
                digitalStack.push(result);
                break;
            }//读取完表达式后进行最后一次计算，以防出现高优先级的符号影响最后的总计算   //计算代码
            elemnt = express.substring(index,index+1);
            if(elemnt.equals("+")||elemnt.equals("-")||elemnt.equals("*")||elemnt.equals("/")){//元素为符号进入
                if(elmentStack.isEmpty()){//判空直接入栈
                    elmentStack.push(elemnt);
                }
                else{//只有出现高优先级的的符号才进行特殊计算，目的是转换优先计算模式，从加减法优先到乘除法优先，直到乘除法计算完毕，目的是将算式变成同级运算
                    if((elmentStack.peek().equals("+")||elmentStack.peek().equals("-"))&&(elemnt.equals("*")||elemnt.equals("/"))){
                        elmentStack.push(elemnt);
                    }else{//只有出现比符号栈顶或相等或低优先度的符号才进行进入，两两计算，直到符号栈无在添加符号前，栈中没有比新添加符号优先级更高的符号。
                        Float num1 = digitalStack.pop();
                        Float num2 = digitalStack.pop();
                        String elment2 = elmentStack.pop();
                        switch (elment2){
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
            Float num1 = digitalStack.pop();
            Float num2 = digitalStack.pop();
            String finalelement = elmentStack.pop();
            switch (finalelement){
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
            }
            digitalStack.push(result);
        }
        System.out.println(digitalStack.pop());
    }
}
