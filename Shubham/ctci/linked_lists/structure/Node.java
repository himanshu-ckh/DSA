package ctci.linked_lists.structure;

public class Node {
    public Node next;
    public int data;

    public Node(int data) {
        this.data = data;
    }

    public static void printLinkedList(Node head) {
        while (head != null) {
            if (head.next == null) {
                System.out.println(head.data);
            } else {
                System.out.print(head.data + " -> ");
            }
            head = head.next;
        }
    }

    public static int sizeOfLL(Node node) {
        int size = 0;
        Node current = node;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }
}
