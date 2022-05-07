package ctci.linked_lists;

import ctci.linked_lists.structure.Node;

public class LinkedList7 {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node second = new Node(6);
        second.next = head.next.next;

        Node intersection = findIfLinkedListsAreIntersecting(head, second);
        if (intersection != null) {
            System.out.println("Intersecting at " + intersection.data);
        } else {
            System.out.println("Not intersecting");
        }
    }

    public static Node findIfLinkedListsAreIntersecting(Node first, Node second) {
        if (first == null && second != null) {
            return null;
        }
        if (first != null && second == null) {
            return null;
        }
        Node tail1 = first;
        Node tail2 = second;

        int size1 = 1;
        int size2 = 1;

        while (tail1.next != null) {
            tail1 = tail1.next;
            size1++;
        }
        while (tail2.next != null) {
            tail2 = tail2.next;
            size2++;
        }

        // this means that two linked lists have different tails, so not intersecting. return null in this case
        if (tail1 != tail2) {
            return null;
        }

        if (size1 > size2) {
            return getIntersectingNode(first, second, size1, size2);
        } else {
            return getIntersectingNode(second, first, size2, size1);
        }
    }

    public static Node getIntersectingNode(Node big, Node small, int bigSize, int smallSize) {
        int diff = bigSize - smallSize;
        for (int i = 0; i < diff; i++) {
            big = big.next;
        }

        while (big != small) {
            big = big.next;
            small = small.next;
        }
        return big;
    }

}
