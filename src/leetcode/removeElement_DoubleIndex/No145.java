package leetcode.removeElement_DoubleIndex;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No145 {
      public class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
         this.right = right;
     }
  }

    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            ArrayList<Integer> arr = new ArrayList<>();
            if(root==null){
                return arr;
            }
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.push(root);
            while(!stack.isEmpty()){
                TreeNode node = stack.peek();
                if(node!=null){//每次循环取出一个非空结点都默认它有左右结点，都根据遍历顺序压栈，不压空结点，例如前：中左右，压栈就是右左中，此时还要在中结点处执行处理，即加入null
                    stack.pop();//先出栈
                    stack.push(node);
                    stack.push(null);
                    if(node.right!=null) stack.push(node.right);
                    if(node.left!=null) stack.push(node.left);
                }else{//遇到空元素，说明下一个元素要立即处理
                    stack.pop();//取出空元素
                    node = stack.pop();//取出下一位元素
                    arr.add(node.val);//执行操作
                }
            }
            return arr;
        }
    }
}
