package ctci.stacks_and_queues;

import java.util.Stack;

public class StacksAndQueues5 {
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> stack1 = new Stack<>();
        while (!stack.empty()) {
            int element = stack.pop();
            if (!stack1.empty() && stack1.peek() > element) {
                stack.push(stack1.pop());
            }
            stack1.push(element);
        }
        while (!stack1.empty()) {
            stack.push(stack1.pop());
        }
    }

    public static void printStack(Stack<Integer> stack) {
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(1);
        stack.push(2);

        sortStack(stack);
        printStack(stack);
    }
}
