package ctci.linked_lists;

import ctci.linked_lists.structure.Node;

public class LinkedList4 {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(8);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(1);

        Node partition = partitionLinkedListAroundElement(head, 5);
        Node.printLinkedList(partition);
    }

    public static Node partitionLinkedListAroundElement(Node head, int element) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        Node left = null;
        Node right = null;
        Node leftHead = null;
        Node rightHead = null;

        Node current = head;
        while (current != null) {
            // add in left linked list
            if (current.data < element) {
                if (leftHead == null) {
                    left = new Node(current.data);
                    left.next = null;
                    leftHead = left;
                } else {
                    left.next = new Node(current.data);
                    left = left.next;
                }
            } else {
                if (rightHead == null) {
                    right = new Node(current.data);
                    right.next = null;
                    rightHead = right;
                } else {
                    right.next = new Node(current.data);
                    right = right.next;
                }
            }
            current = current.next;
        }

        if (leftHead == null) {
            return rightHead;
        }
        if (rightHead == null) {
            return leftHead;
        }

        left.next = rightHead;
        return leftHead;

    }
}
