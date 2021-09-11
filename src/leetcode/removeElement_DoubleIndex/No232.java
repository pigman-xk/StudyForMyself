package leetcode.removeElement_DoubleIndex;

import java.util.Stack;

public class No232 {
    class MyQueue {
        Stack in = new Stack();
        Stack out = new Stack();
        /** Initialize your data structure here. */
        public MyQueue() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            while(!out.isEmpty()){
                in.push(out.pop());
            }
            in.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            while(!in.isEmpty()){
                out.push(in.pop());
            }
            return (int)out.pop();
        }

        /** Get the front element. */
        public int peek() {
            while(!in.isEmpty()){
                out.push(in.pop());
            }
            return (int)out.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            if(in.isEmpty()&&out.isEmpty()){
                return true;
            }else{
                return false;
            }
        }
    }
}
