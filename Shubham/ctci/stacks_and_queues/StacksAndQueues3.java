package ctci.stacks_and_queues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StacksAndQueues3 {
    List<Stack<Integer>> stackSet = new ArrayList<>();
    int maxSize = 5;

    public void push(int n) {
        if (stackSet.isEmpty()) {
            Stack<Integer> stack = new Stack<>();
            stack.push(n);
            stackSet.add(stack);
            return;
        }

        Stack<Integer> stack = stackSet.get(stackSet.size() - 1);
        if (stack != null && stack.size() < maxSize) {
            stack.push(n);
            return;
        }
        stack = new Stack<>();
        stack.push(n);
        stackSet.add(stack);
    }

    public int pop() {
        if (stackSet.isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        return stackSet.get(stackSet.size()-1).pop();
    }

    // index starts with 1
    public int pop(int index) {
        if (stackSet.isEmpty() || stackSet.size() < index ) {
            throw new RuntimeException("Stack underflow");
        }
        return stackSet.get(index-1).pop();
    }

    public static void main(String[] args) {
        StacksAndQueues3 setOfStacksCTCI = new StacksAndQueues3();
        for (int i = 0; i < 13; i++) {
            setOfStacksCTCI.push(i);
        }

        System.out.println(setOfStacksCTCI);

        System.out.println(setOfStacksCTCI.pop());
        System.out.println(setOfStacksCTCI.pop(2));

        System.out.println(setOfStacksCTCI);

        setOfStacksCTCI.push(13);
        System.out.println(setOfStacksCTCI);

        for (int i = 0; i < 4; i++) {
            setOfStacksCTCI.push(i);
        }
        System.out.println(setOfStacksCTCI);
    }
}
