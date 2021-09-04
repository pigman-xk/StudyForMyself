package leetcode.removeElement_DoubleIndex;

public class No844 {
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            if(s==null&&t==null){
                return true;
            }else if (s==null&&t!=null){
                return false;
            }else if (t==null&&s!=null){
                return false;
            }
            int s_index = s.length()-1;
            int s_T = 0;
            int t_index = t.length()-1;
            int t_T=0;
            while(s_index>=0||t_index>=0){//只要还有一个字符串未遍历完就必须继续遍历它，直到出现结果
                while(s_index>=0){
                    if(s.charAt(s_index)=='#'){
                        s_T++;
                    }else if(s_T<=0&&s.charAt(s_index)!='#'){
                        break;
                    }else {
                        s_T--;
                    }
                    s_index--;
                }
                while(t_index>=0){
                    if(t.charAt(t_index)=='#'){
                        t_T++;
                    }else if(t_T<=0&&t.charAt(t_index)!='#'){
                        break;
                    }else {
                        t_T--;
                    }
                    t_index--;
                }
                if(s_index>=0&&t_index>=0){//都找到元素
                    if(s.charAt(s_index)!=t.charAt(t_index)){//元素不等
                        return false;
                    }
                } else if(s_index<0&&t_index<0){//都到末尾
                    return true;
                }
                else {//只有一方找到元素，另一方找不到元素
                    return false;
                }
                s_index--;//移动下标后也有三种情况1.都小于0，说明全部遍历完，未发现不相等的，退出循环返回True
                //2.都大于0继续执行
                //3.只有一方大于0，说明此次有一个字符串遍历完，但另一个字符串是否还有其他字符存在未知，对仍大于0的字符串再进行遍历，要么找到一个字符（false），要么也到达末尾（true）
                t_index--;
            }
            return true;
        }
    }
}
