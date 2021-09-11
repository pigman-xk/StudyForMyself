package leetcode.removeElement_DoubleIndex;

public class No203 {

     public class ListNode {
          int val;
          ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode node = new ListNode(-1);
            ListNode newhead = node;
            node.next = head;
            while(node!=null&&node.next!=null){
                if(node.next.val == val){
                    node.next = node.next.next;
                }else{
                    node = node.next;
                }
            }
            return newhead.next;
        }
    }
}
