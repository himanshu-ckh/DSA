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
}

