package leetcode.removeElement_DoubleIndex;

public class MST0207 {
     public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        HashSet<ListNode> set  = new HashSet<ListNode>();
//        while(headA!=null){
//            set.add(headA);
//            headA=headA.next;
//        }
//        while(headB!=null){
//            if(set.contains(headB)){
//                return headB;
//            }else{
//                headB=headB.next;
//            }
//        }
//        return null;
            ListNode curA = headA;
            int l_a = 0;
            ListNode curB = headB;
            int l_b = 0;
            while(curA!=null){
                curA=curA.next;
                l_a++;
            }
            while (curB!=null){
                curB=curB.next;
                l_b++;
            }
            if(l_b>l_a){
                ListNode temp = headA;
                int tempnum = l_a;
                headA = headB;
                headB=temp;
                l_a = l_b;
                l_b=tempnum;
            }
            int d = l_a-l_b;
            curA=headA;
            curB=headB;
            for(int i = 0;i<d;i++){
                curA=curA.next;
            }
            while(curA!=null){
                if(curA==curB){
                    return curA;
                }
                curA=curA.next;
                curB=curB.next;
            }
            return curA;


        }
    }
}
