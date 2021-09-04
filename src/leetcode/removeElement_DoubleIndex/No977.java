package leetcode.removeElement_DoubleIndex;

public class No977 {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            if(nums==null||nums.length==0){
                return nums;
            }
            int[] num = new int[nums.length];
            int left = 0;
            int right = nums.length-1;
            int leftNum = nums[left]*nums[left];
            int rightNum = nums[right]*nums[right];
            int index = nums.length-1;
            while(left<=right){
                leftNum = nums[left]*nums[left];
                rightNum = nums[right]*nums[right];
                if(leftNum>=rightNum){
                    num[index]=leftNum;
                    left++;
                }else{
                    num[index]=rightNum;
                    right--;
                }
                index--;
            }
            return num;
//        System.out.println(Arrays.toString(nums));
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] > nums[j]) {
//                    int temp = nums[i];
//                    nums[i]=nums[j];
//                    nums[j]=temp;
//                }
//            }
//
//        }
//        return nums;

        }

    }
}
