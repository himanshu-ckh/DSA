package ctci.stacks_and_queues;

public class StacksAndQueues1 {
    static int MAX_SIZE = 51;
    static int[] array = new int[MAX_SIZE];

    static class Stack1 {
        int top = -1;
        public void push(int n) {
            if (top == (MAX_SIZE/3)-1) {
                throw new RuntimeException("Stack 1 overflow");
            }
            array[++top] = n;
        }

        public int pop() {
            if (top == -1) {
                throw new RuntimeException("Stack 1 underflow");
            }
            return array[top--];
        }

        public int peek() {
            if (top == -1) {
                throw new RuntimeException("Stack 1 underflow");
            }
            return array[top];
        }
    }

    static class Stack2 {
        int top = MAX_SIZE/3;
        public void push(int n) {
            if (top == 2*(MAX_SIZE/3)-1) {
                throw new RuntimeException("Stack 2 overflow");
            }
            array[++top] = n;
        }

        public int pop() {
            if (top == MAX_SIZE/3) {
                throw new RuntimeException("Stack 2 underflow");
            }
            return array[top--];
        }

        public int peek() {
            if (top == MAX_SIZE/3) {
                throw new RuntimeException("Stack 2 underflow");
            }
            return array[top];
        }
    }

    static class Stack3 {
        int top = 2*(MAX_SIZE/3);
        public void push(int n) {
            if (top == MAX_SIZE-1) {
                throw new RuntimeException("Stack 3 overflow");
            }
            array[++top] = n;
        }

        public int pop() {
            if (top == 2*(MAX_SIZE/3)) {
                throw new RuntimeException("Stack 3 underflow");
            }
            return array[top--];
        }

        public int peek() {
            if (top == 2*(MAX_SIZE/3)) {
                throw new RuntimeException("Stack 3 underflow");
            }
            return array[top];
        }
    }

    public static void main(String[] args) {
        StacksAndQueues1.Stack1 stack1 = new Stack1();
        stack1.push(1);
        System.out.println(stack1.peek());

        StacksAndQueues1.Stack2 stack2 = new Stack2();
        stack2.push(2);
        System.out.println(stack2.peek());

        StacksAndQueues1.Stack3 stack3 = new Stack3();
        stack3.push(4);
        System.out.println(stack3.peek());

        for (int i = 0; i < 15; i++) {
            stack1.push(i);
            stack2.push(i);
            stack3.push(i);
        }
        System.out.println(stack1);
    }
}
