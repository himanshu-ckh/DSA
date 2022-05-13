package Himanshu.ctcci.LinkedList;
import java.util.*;
//https://www.algoexpert.io/questions/Shift%20Linked%20List
public class ShiftLinkedList {
    static class Program {
        public static LinkedList shiftLinkedList(LinkedList head, int k) {
            // Write your code here.
            if(k<0) {
                LinkedList curr = head;
                while(k<0) {
                    if(curr.next != null) {
                        curr = curr.next;
                    } else {
                        curr = head;
                    }
                    k = k+1;
                }
                if(curr == head) {
                    return head;
                }
                else if(curr.next == null) {
                    LinkedList next = head;
                    curr.next = head;
                    while(next.next != curr) {
                        next = next.next;
                    }
                    next.next = null;
                    return curr;
                }
                else {
                    LinkedList next = curr.next;
                    LinkedList temp;
                    while(next.next != null) {
                        next = next.next;
                    }

                    next.next = head;
                    while(next.next != curr) {
                        next = next.next;
                    }
                    next.next = null;
                    return curr;
                }

            }

            if(k>0) {
                LinkedList curr = head;
                while(k>0) {
                    if(curr.next != null) {
                        curr = curr.next;
                    }
                    else {
                        curr = head;
                    }
                    k = k-1;
                }

                if(curr == head) {
                    return head;
                }
                else {
                    LinkedList prev = head;
                    LinkedList temp;
                    while(curr.next != null) {
                        curr = curr.next;
                        prev = prev.next;
                    }
                    temp = prev.next;
                    prev.next = null;
                    curr.next = head;
                    head = temp;
                    return head;
                }

            }
            else {
                return head;
            }
        }

        static class LinkedList {
            public int value;
            public LinkedList next;

            public LinkedList(int value) {
                this.value = value;
                next = null;
            }
        }
    }

}
