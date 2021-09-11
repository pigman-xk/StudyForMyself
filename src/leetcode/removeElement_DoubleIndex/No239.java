package leetcode.removeElement_DoubleIndex;

public class No239 {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int left = 0;
            int right = -1;
            int maxIndex = 0;
            for(int i = 0 ; i < k ; i++){
                if(nums[i]>nums[maxIndex]){
                    maxIndex = i ;
                }
                right++;
            }
            int[] arr = new int[nums.length-k+1];
            int arrIndex = 0;
            if(k>=nums.length){
                return new int[]{nums[maxIndex]};
            }
            while(right< nums.length){
                if(maxIndex<left){
                    maxIndex=left;
                    for(int i = left ; i <= right ; i++){
                        if(nums[i]>=nums[maxIndex]){
                            maxIndex = i ;
                        }
                    }
                }
                if(nums[right]>=nums[maxIndex])maxIndex=right;
                arr[arrIndex++] = nums[maxIndex];
                left++;
                right++;
            }
            return arr;
        }
    }
}
