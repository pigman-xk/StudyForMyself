package leetcode.removeElement_DoubleIndex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No15 {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {//排序+三指针，三个指针的移动要考虑重复问题才能克服题目要求的三元组不重复问题
            Arrays.sort(nums);//排序
            List<List<Integer>> result  = new ArrayList<List<Integer>>();
            for(int i = 0;i<nums.length;i++){
                if(nums[i]>0){//第i位大于0，其后元素必大于0，提前退出循环
                    return result;
                }
                if(i>0&&nums[i]==nums[i-1]){//除第一位以外，当进行完一次寻找后，倘若，i移动到下一位仍相同，left和right与上一次将是相同的组合，造成重复，需继续移动
                    continue;
                }
                //设置left、right的初始指针
                int left = i+1;
                int right = nums.length-1;
                while(left<right){//对left、right指针进行遍历
                    int sum = nums[i]+nums[left]+nums[right];//计算三个指针的数之和
                    //倘若其和都不为0，根据情况移动左右指针
                    if(sum>0){
                        right--;
                    }else if (sum<0){
                        left++;
                    }else{//当找到一个三元组
                        result.add(Arrays.asList(nums[i],nums[left],nums[right]));//加入到result中
                        while(left<right&&nums[left]==nums[left+1])left++;//左指针去重
                        while(left<right&&nums[right]==nums[right-1])right--;//右指针去重
                        left++;//下一位必然不重复
                        right--;//下一位必然不重复
                    }
                }
            }
            return result;
        }
    }
}
