package leetcode.removeElement_DoubleIndex;

import java.util.HashSet;
public class No202 {
    class Solution {//快乐数，不是快乐数则表明有sum重复出现。
        public boolean isHappy(int n) {
            HashSet<Integer> set = new HashSet<Integer>();
            while(n!=1) {
                int sum = 0;
                while (n != 0) {
                    int temp = n % 10;
                    sum += temp * temp;
                    n = n / 10;
                }
                if(set.contains(sum)){
                    return false;
                }else{
                    set.add(sum);
                }
                n = sum;
            }
            return true;
        }
    }
}
