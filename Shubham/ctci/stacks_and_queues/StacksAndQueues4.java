package ctci.stacks_and_queues;

import java.util.Stack;

public class StacksAndQueues4 {
    Stack<Integer> firstStack = new Stack<>();
    Stack<Integer> secondStack = new Stack<>();

    public void enqueue(int n) {
        firstStack.push(n);
    }

    public int dequeue() {
        if (firstStack.empty()) {
            throw new RuntimeException("Queue empty");
        }

        while (!firstStack.empty()) {
            secondStack.push(firstStack.pop());
        }
        int item = secondStack.pop();
        while (!secondStack.empty()) {
            firstStack.push(secondStack.pop());
        }
        return item;
    }

    public int size() {
        return firstStack.size();
    }

    public static void main(String[] args) {
        StacksAndQueues4 queueUsingTwoStack = new StacksAndQueues4();
        queueUsingTwoStack.enqueue(1);
        queueUsingTwoStack.enqueue(2);
        queueUsingTwoStack.enqueue(3);
        queueUsingTwoStack.enqueue(4);
        System.out.println("Size is " + queueUsingTwoStack.size());

        System.out.println(queueUsingTwoStack.dequeue());
        System.out.println("Size is " + queueUsingTwoStack.size());
        System.out.println(queueUsingTwoStack.dequeue());
        System.out.println("Size is " + queueUsingTwoStack.size());


        queueUsingTwoStack.enqueue(5);
        System.out.println("Size is " + queueUsingTwoStack.size());
        System.out.println(queueUsingTwoStack.dequeue());
        System.out.println("Size is " + queueUsingTwoStack.size());
        System.out.println(queueUsingTwoStack.dequeue());
        System.out.println("Size is " + queueUsingTwoStack.size());
        System.out.println(queueUsingTwoStack.dequeue());
        System.out.println("Size is " + queueUsingTwoStack.size());
        System.out.println(queueUsingTwoStack.dequeue());
        System.out.println("Size is " + queueUsingTwoStack.size());
    }
}
