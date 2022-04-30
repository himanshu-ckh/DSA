package ctci.linked_lists;

import ctci.linked_lists.structure.Node;

public class LinkedList2 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(6);

        System.out.println(getKthToLastElement(head, 6));
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
