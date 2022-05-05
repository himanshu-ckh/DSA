package ctci.linked_lists;

import ctci.linked_lists.structure.Node;

import java.util.Stack;

public class LinkedList6 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(1);

        System.out.println(isLinkedListPalindrome(head));


        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(2);
        head2.next.next.next = new Node(2);
        head2.next.next.next.next = new Node(2);
        head2.next.next.next.next.next = new Node(1);

        System.out.println(isLinkedListPalindrome(head2));

    }

    public static boolean isLinkedListPalindrome(Node head) {
        if (head == null) {
            return true;
        }
        if (head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;
        Stack<Node> firstHalf = new Stack<>();

        while (fast != null && fast.next != null) {
            firstHalf.push(slow);
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }


        while (!firstHalf.empty()) {
            Node item = firstHalf.pop();
            if (slow.data != item.data) {
                return false;
            }
            slow = slow.next;
        }

        return true;

    }
}
