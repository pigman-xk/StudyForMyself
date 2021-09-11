package leetcode.removeElement_DoubleIndex;

public class No92 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            if(head==null||head.next==null||left==right){
                return head;
            }
            ListNode newHead =new ListNode();
            newHead.next = head;
            int index = 0;
            ListNode indexNode = newHead;
            while(index!=left-1){
                indexNode=indexNode.next;
                index++;
            }
            ListNode lefthead = indexNode;
            indexNode=indexNode.next;
            index++;
            ListNode temp = indexNode.next;
            ListNode node = new ListNode();
            ListNode LastNode = indexNode;
            while(index<right+1){
                temp=indexNode.next;
                indexNode.next = node.next;
                node.next = indexNode;
                indexNode=temp;
                index++;
            }
            lefthead.next = node.next;
            LastNode.next = indexNode;
            return newHead.next;
        }
    }
}
