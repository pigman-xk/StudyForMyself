package leetcode.removeElement_DoubleIndex;

public class No24 {
    public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode newHead = new ListNode();
            newHead.next =head;
            ListNode indexNode  = newHead;
            ListNode temp1;
            ListNode temp2;
            while(indexNode!=null&&indexNode.next!=null&&indexNode.next.next!=null){
                temp1 = indexNode.next.next.next;
                temp2 = indexNode.next.next;
                indexNode.next.next.next =indexNode.next;
                indexNode.next.next = temp1;
                indexNode.next = temp2;
                indexNode=indexNode.next.next;
            }
            return newHead.next;
        }
    }
}
