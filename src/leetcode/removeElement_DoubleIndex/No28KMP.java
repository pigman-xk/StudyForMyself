package leetcode.removeElement_DoubleIndex;

import java.util.Arrays;

public class No28KMP {
    class Solution {
        public int strStr(String haystack, String needle) {
            char [] hay = haystack.toCharArray();
            char [] need = needle.toCharArray();
            if(needle==null||needle.equals("")){
                return 0;
            }
            int[] next = new int[needle.length()];
            getNext(next,needle);
            System.out.println(Arrays.toString(next));
            int index = 0;
            for(int i = 0 ; i<haystack.length();i++){
                if(hay[i]==need[index]){
                    if(index==needle.length()-1){
                        return i-needle.length()+1;
                    }else {
                        index++;
                    }
                }else{
                    while(index>0&&hay[i]!=need[index]){//这里可能存在两种情况，一找到相等的值或到0，二相等且都到0
                        index=next[index-1];
                    }
                    if(hay[i]==need[index]){//只要两者相等都都要index++，若不等说明index为0且两者不等
                        index++;
                    }
                }
            }
            return -1;
        }
    }
    static void getNext(int[] c, String s){//KMP前缀表构建思想：情景：第i个元素与第j个元素比较，i、j前有一对相同的字符串（可能为空可能非空，为空的情况下只有i为首位元素发生）
        //此时倘若i，j位元素不等，则需要j回退，目的是利用对称性减少遍历，否则（将必须设置一个指针index在后面那个字符串的首部，不断index++，j--0
        //判断[0,j]与[index,i]的字符串是否相等，不相等则继续回退），而利用对称性后，只需要将j回退到[0,j]对称的前缀部分的下一位此时[0,j-1]这个位置的字符串首先因为
        //[0,j(回退前)]与[index(回退前)，i]是相等的，那么其内也有对称部分,对称部分的后缀和[0,j-1]是相等的，此时比较j位和i位，若相等，此时j就是第i位的对称程度
        //若不相等，则继续循环，直至找到相等的i与j或者是j到达s字符串的首位（若此时s的首位和i相同则j++表示第j位的对称程度为1，否则为初始位0），循环往复直到i遍历完。
        //初始化
        int j = 0;
        c[0]=0;
        for(int i = 1; i<s.length();i++){
            //处理前后缀不一样
            while(j>0&&s.charAt(i)!=s.charAt(j)){
                j = c[j-1];
            }
            //处理前后缀一样
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            c[i] = j;
        }
    }
}
