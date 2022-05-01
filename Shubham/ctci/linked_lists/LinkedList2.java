package ctci.linked_lists;

import ctci.linked_lists.structure.Node;

public class LinkedList2 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(6);

        System.out.println(getKthToLastElement(head, 5));
        System.out.println(getKthToLastElement(head, 5) == getKthToLastElementOptimized(head, 5));
        System.out.println(getKthToLastElement(head, 1) == getKthToLastElementOptimized(head, 1));
        System.out.println(getKthToLastElement(head, 2) == getKthToLastElementOptimized(head, 3));
    }

    public static int getKthToLastElementOptimized(Node head, int k) {
        if (k <= 0) {
            return -1;
        }
        Node first = head;
        for (int i = 0; i < k-1; i++) {
            first = first.next;
        }

        Node second = head;
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        return second.data;
    }

    public static int getKthToLastElement(Node head, int k) {
        if (k <= 0) {
            return -1;
        }

        int size = 0;
        if (head == null) {
            return -1;
        }

        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        if (size - k < 0) {
            return -1;
        }

        Node temp = head;
        for (int i = 0; i < size - k; i++) {
            temp = temp.next;
        }

        return temp.data;
    }
}
