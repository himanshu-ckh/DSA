package ctci.linked_lists;

import ctci.linked_lists.structure.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a code to remove duplicates from an unsorted linked list
 * How about you cannot use an additional buffer
 */
public class LinkedLists1 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);

        removeDuplicatesWithoutAdditionalSpace(head);
        Node.printLinkedList(head);
    }

    public static void removeDuplicatesUsingHashTable(Node head) {
        if (head == null) {
            return;
        }
        Node current = head;
        Node previous = null;
        Set<Integer> visited = new HashSet<Integer>();
        while (current != null) {
            if (visited.contains(current.data)) {
                previous.next = current.next;
            } else {
                visited.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }

    public static void removeDuplicatesWithoutAdditionalSpace(Node head) {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            return;
        }

        Node current = head;
        while (current != null) {
            int currentVal = current.data;
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == currentVal) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}
