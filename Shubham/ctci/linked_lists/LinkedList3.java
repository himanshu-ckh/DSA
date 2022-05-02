package ctci.linked_lists;

import ctci.linked_lists.structure.Node;

public class LinkedList3 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(6);

        int size = Node.sizeOfLL(head);
        Node current = head;
        for (int i = 0; i < size/2; i++) {
            current = current.next;
        }
        if (size%2 == 0) {
            current = reverse(current);
            System.out.println(isEqual(head, current, size/2));
        } else {
            // size is odd
            current.next = reverse(current.next);

            System.out.println(isEqual(head, current.next, size/2));
        }
    }

    private static boolean isEqual(Node one, Node two, int n) {
        for (int i = 0; i < n; i++) {
            if (one.data != two.data) {
                return false;
            }
            one = one.next;
            two = two.next;
        }
        return true;
    }

    private static Node reverse(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node p1 = null;
        Node p2 = node;
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
