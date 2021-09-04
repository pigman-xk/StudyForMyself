package leetcode.removeElement_DoubleIndex;

public class No26 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if(nums==null||nums.length==0){
                return 0;
            }else if (nums.length==1){
                return 1;
            }
            int slow = 0;//要替换的位置
            //定义当fast指针的对应的元素值发生变化时，将该值添加到[0,slow),[0,slow)定义为真正的数组
            for(int i =0;i+1<nums.length;i++){
                if(nums[i]!=nums[i+1]){//注意：此时不对末尾的数字执行任何操作，无论末尾数字是否重复
                    nums[slow]=nums[i];
                    slow++;
                }
            }
            //到达末尾后有两种情况，1.末尾数字不重复，添加到[0,slow),slow++;2.末尾数字重复，因未触发上面的if，仍需添加到[0，slow)
            nums[slow]=nums[nums.length-1];
            slow++;
            return slow;
        }
    }
}
