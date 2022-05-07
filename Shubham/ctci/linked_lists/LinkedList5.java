package ctci.linked_lists;

import ctci.linked_lists.structure.Node;

public class LinkedList5 {
    public static void main(String[] args) {
        Node head = new Node(6);
        head.next = new Node(7);
        head.next.next = new Node(1);

        int num1 = getNumFromLL(head);

        Node head2 = new Node(3);
        head2.next = new Node(9);

        int num2 = getNumFromLL(head2);

        Node.printLinkedList(reverse(createLLFromNum(num1 + num2)));

        System.out.println("Trying second approach");

        Node first = new Node(7);
        first.next = new Node(1);
        first.next.next = new Node(6);

        Node second = new Node(5);
        second.next = new Node(9);
        second.next.next = new Node(2);
        second.next.next.next = new Node(3);
        second.next.next.next.next = new Node(3);

        Node answer = addLinkedListAsNumbers(first, second);
        Node.printLinkedList(answer);
    }

    private static int getNumFromLL(Node head) {
        int num = 0;
        if (head == null) {
            return num;
        }
        int size = Node.sizeOfLL(head);
        Node current = head;
        for (int i = size-1; i >= 0; i--) {
            num = num + current.data * (int) (Math.pow(10, i));
            current = current.next;
        }
        return num;
    }

    private static Node createLLFromNum(int num) {
        if (num == 0) {
            return new Node(0);
        }

        Node head = new Node(num%10);
        num = num/10;

        Node temp = head;

        while (num != 0) {
            temp.next = new Node(num%10);
            temp = temp.next;
            num = num/10;
        }
        return head;
    }

    private static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node p1 = null;
        Node p2 = head;
        Node p3 = null;

        while (p2 != null) {
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        return p1;
    }

    public static Node addLinkedListAsNumbers(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        int carry = 0;
        Node first = head1;
        Node second = head2;
        Node answerHead = null;
        Node answer = null;

        while (first != null && second != null) {
            int sum = first.data + second.data + carry;
            int currentData = 0;
            if (sum > 10) {
                currentData = sum - 10;
                carry = 1;
            } else {
                currentData = sum;
                carry = 0;
            }

            if (answer == null) {
                answer = new Node(currentData);
                answer.next = null;
                answerHead = answer;
            } else {
                answer.next = new Node(currentData);
                answer = answer.next;
            }

            first = first.next;
            second = second.next;
        }

        while (first != null) {
            answer.next = new Node(first.data);
            answer = answer.next;
            first = first.next;
        }

        while (second != null) {
            answer.next = new Node(second.data);
            answer = answer.next;
            second = second.next;
        }

        return answerHead;
    }
}

