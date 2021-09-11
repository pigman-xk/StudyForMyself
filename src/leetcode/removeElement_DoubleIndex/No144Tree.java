package leetcode.removeElement_DoubleIndex;

import StudyProject.dataStructure.Tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
 class TreeNode {
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
public class No144 {
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            ArrayList<Integer> list = new ArrayList<Integer>();
            if(root == null){
                return list;
            }
            while(!stack.isEmpty()){//将所有结点不管它的左右子结点是否为空，都统一排列处理，模拟递归
                TreeNode node = stack.peek();//检查是否遇到处理标志
                if(node!=null){//观察当前元素是否需要处理，为空需要处理，不为空则将它，以及它的左右结点根据遍历方式压栈
                    stack.pop();//取出栈顶重新排列
                    //此时是前序遍历，则压栈顺序是右左中
                    if(node.right!=null) stack.push(node.right);//只能处理非空结点
                    if(node.left!=null) stack.push(node.left);//只能处理非空结点，假如左右结点为空，则表明可直接对当前结点进行处理，当前节点加入处理标志，此时节点已达到末尾。
                    stack.push(node);//重新将当前父结点压栈到正确位置
                    stack.push(null);//表明此处已根据以node父结点的遍历顺序已经排好，可以直接出栈处理
                }else{//遇到空，下一位元素要立即处理
                    stack.pop();//出空
                    node = stack.pop();//要处理的元素
                    list.add(node.val);//处理当前结点
                }
            }
            return list;
        }
    }
}
