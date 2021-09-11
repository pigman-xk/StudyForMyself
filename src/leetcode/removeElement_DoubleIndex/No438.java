package leetcode.removeElement_DoubleIndex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No438 {
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            if(p.length()>s.length()){
                return new ArrayList<>();
            }
            int left = 0;
            int[] arr = new int[26];
            int[] arr2 = new int[26];
            for (int i =0;i<p.length();i++) {
                arr[s.charAt(i) - 'a'] += 1;
                arr2[p.charAt(i) - 'a'] += 1;
            }
            List<Integer> list = new ArrayList<Integer>();
            if (Arrays.equals(arr, arr2)) {
                list.add(0);
            }
            for (int i = p.length(); i < s.length(); i++) {
                arr[s.charAt(i) - 'a'] += 1;
                arr[s.charAt(left) - 'a'] -= 1;
                left++;
                if (Arrays.equals(arr, arr2)) {
                    list.add(left);
                }
            }
            return list;
        }
    }
}
