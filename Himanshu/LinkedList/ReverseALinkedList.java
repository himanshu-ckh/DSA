package Himanshu.ctcci.LinkedList;
//https://www.algoexpert.io/questions/Reverse%20Linked%20List
class ReverseALinkedList {
    public static LinkedList reverseLinkedList(LinkedList head) {
        // Write your code here.

		/*
		Make two pointer, one current node and one next node
		Check while the current node is not null and create a new pointer next node which will
		 be current.next. Now set curr.next = prev node and set
		 curr = next;
		 and prev = curr;
		*/
        LinkedList curr = head;
        LinkedList prev = null;

        while(curr != null) {
            LinkedList next=  curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static LinkedList reverseLinkedListRecursive(LinkedList head) {
        // Write your code here.
        if(head.next == null || head == null) {
            return head;
        }

        LinkedList newNode = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;

    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
