package ctci.linked_lists;

import ctci.linked_lists.structure.Node;

public class LinkedList8 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = head.next.next;

        System.out.println(findStartOfCircularLinkedList(head).data);
    }


    public static Node findStartOfCircularLinkedList(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node slow = head.next;
        Node fast = head.next.next;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
