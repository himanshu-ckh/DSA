package ctci.linked_lists;

import ctci.linked_lists.structure.Node;

public class LinkedList3 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(6);

        deleteCenterNode(head.next.next);
        Node.printLinkedList(head);

    }

    public static void deleteCenterNode(Node n) {
        if (n == null || n.next == null) {
            return;
        }
        Node nex = n.next;
        n.data = nex.data;
        n.next = nex.next;
    }
}
