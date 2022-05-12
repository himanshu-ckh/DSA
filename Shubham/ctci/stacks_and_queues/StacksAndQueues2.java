package ctci.stacks_and_queues;

import java.util.Stack;

public class StacksAndQueues2 {
    Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;

    public void push(int n) {
        if (stack.empty()) {
            stack.push(n);
            min = n;
            return;
        }
        if (n >= min) {
            stack.push(n);
        } else {
            stack.push((2*n) - min);
            min = n;
        }
    }

    public int pop() {
        int y = stack.pop();
        if (y >= min) {
            return y;
        } else {
            int r = min;
            min = (2*min) - y;
            return r;
        }
    }

    public int min() {
        return min;
    }

    public void printStack() {
        while (!stack.empty()) {
            System.out.println(pop());
        }
    }

    public static void main(String[] args) {
        StacksAndQueues2 stack = new StacksAndQueues2();
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(1);
        stack.push(-1);
        System.out.println(stack.min());

        stack.printStack();
    }
}
