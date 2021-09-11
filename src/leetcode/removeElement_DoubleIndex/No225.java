package leetcode.removeElement_DoubleIndex;

import java.util.ArrayList;

public class No225 {
    class MyStack {
        ArrayList in = new ArrayList();
        ArrayList out = new ArrayList();
        /** Initialize your data structure here. */
        public MyStack() {

        }

        /** Push element x onto stack. */
        public void push(int x) {
            dumpList();
            in.add(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            dumpList();
            while(in.size()!=1){
                out.add(in.remove(0));
            }
            return (int)in.remove(0);
        }

        /** Get the top element. */
        public int top() {
            dumpList();
            return (int)in.get(in.size()-1);
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            if(in.isEmpty()&&out.isEmpty()){
                return true;
            }
            return false;
        }

        private void dumpList(){
            if(in.isEmpty()){
                while(!out.isEmpty()){
                    in.add(out.remove(0));
                }
            }
        }
    }
}
