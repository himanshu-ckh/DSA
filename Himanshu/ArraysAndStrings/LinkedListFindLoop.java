import java.util.*;

class LinkedListFindLoop {
    public static LinkedList findLoop(LinkedList head) {
        // Write your code here.
        /*
        Create two pointer fast and slow.
        Move fast pointer be two pace and slow pointer by one pace, if they meet that meens that there is a loop in the linked list
        Now to find the node where the loop exists, move the slow pointer to head and fast to next and start moving both by one
        Whearever the meet again that would be the start of the loop
         */
        LinkedList slow = head;
        LinkedList fast = slow.next;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = head;
        fast = fast.next;

        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
