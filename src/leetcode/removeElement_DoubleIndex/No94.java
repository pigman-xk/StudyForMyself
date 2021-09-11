package leetcode.removeElement_DoubleIndex;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No94 {
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            Stack<TreeNode> stack = new Stack<TreeNode>();
            ArrayList<Integer> arr = new ArrayList<>();
            TreeNode cur = root;
            while(cur!=null||!stack.isEmpty()){
                if(cur!=null){
                    stack.push(cur);
                    cur = cur.left;
                }else{
                    cur = stack.pop();
                    arr.add(cur.val);
                    cur=cur.right;
                }
            }
            return arr;
        }
    }
}
