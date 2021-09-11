package leetcode.removeElement_DoubleIndex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class No49 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String,List<String>> map = new HashMap<String, List<String>>();
            for(String s : strs){
                char [] c = s.toCharArray();
                Arrays.sort(c);
                String temp= String.valueOf(c);
                if(map.containsKey(temp)){
                    map.get(temp).add(s);
                }else{
                    List<String> l = new ArrayList<String>();
                    l.add(s);
                    map.put(temp,l);
                }
            }
            List<List<String>> list= new ArrayList<List<String>>();
            for(List<String> i : map.values()){
                list.add(i);
            }
            return list;
        }
    }
}
