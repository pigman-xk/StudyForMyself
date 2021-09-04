package leetcode.removeElement_DoubleIndex;

public class No27 {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int slow = 0;//定义为不包含val的数组长度，[0,slow)为实际数组,slow为替换位
//        int fast = 0;
//        while(fast<nums.length){
//            while(fast<nums.length&&nums[fast]==val){
//                fast++;
//            }
//            if(!(fast<nums.length)){
//                break;
//            }
//            nums[slow]=nums[fast];
//            slow++;
//            fast++;
//        }
            for(int i =0;i<nums.length;i++){//遍历整个数组将符合条件的val填入到[0，slow]的数组中
                if(nums[i]!=val){//不符合跳过该数
                    nums[slow]=nums[i];
                    slow++;
                }
            }
            return slow;
        }
    }
}
