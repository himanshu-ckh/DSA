package Himanshu.ctcci.StacksAndQueue;

import java.util.Stack;

public class ImplementQueueusingStacks {
    static class MyQueue {

        public Stack<Integer> s1 = new Stack<Integer>();
        public Stack<Integer> s2 = new Stack<Integer>();
        public MyQueue() {
            // Stack<Integer> s1 = new Stack<Integer>();
            // Stack<Integer> s2 = new Stack<Integer>();
        }

        public void push(int x) {
            s1.push(x);
        }

        public int pop() {
            while(!s1.isEmpty()) {
                int p1 = s1.pop();
                s2.push(p1);
            }
            int toReturn = s2.pop();
            while(!s2.isEmpty()) {
                int p2 = s2.pop();
                s1.push(p2);
            }
            return toReturn;
        }

        public int peek() {
            while(!s1.isEmpty()) {
                int p1 = s1.pop();
                s2.push(p1);
            }
            int toReturn = s2.peek();
            while(!s2.isEmpty()) {
                int p2 = s2.pop();
                s1.push(p2);
            }
            return toReturn;
        }

        public boolean empty() {
            if(s1.isEmpty()) {
                return true;
            }
            return false;
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:

 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
