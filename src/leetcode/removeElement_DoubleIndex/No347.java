package leetcode.removeElement_DoubleIndex;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class No347 {
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {//优先级队列
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            for(int i : nums){//统计词频
                hashMap.put(i,hashMap.getOrDefault(i,0)+1);
            }
            PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((o1, o2)->o1.getValue()-o2.getValue());//构造一个优先级队列，队列按hashMap的value值正向排序
            for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){//遍历hashMap的EntrySet同时维护长度为k的优先级队列
                queue.offer(entry);//加入新的Entry在队列中根据value正向排序
                if(queue.size()>k){//倘若队列长度大于k了，则将队列头的元素推出，因为是按value正序排的，所以推出的必定是最小元素
                    queue.poll();
                }
            }
            int[] arr = new int[k];
            int index = 0 ;
            while(!queue.isEmpty()){//将维护好的k个高频元素推出
                arr[index++] = queue.poll().getKey();
            }
            return arr;
        }
    }
}
