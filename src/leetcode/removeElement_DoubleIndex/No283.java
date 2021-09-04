package leetcode.removeElement_DoubleIndex;

public class No283 {
    class Solution {
        public void moveZeroes(int[] nums) {
            int slow = 0;//要替换的位置

            for(int i =0;i<nums.length;i++){//从第一位往后遍历，将所有非0元素添加到[0,slow)
                if(nums[i]!=0){
                    nums[slow]=nums[i];
                    slow++;
                }
            }
            for(int j = slow;j<nums.length;j++){//将[slow,nums.length]的元素全变为0
                nums[j]=0;
            }
        }
    }
}
