package Himanshu.ctcci.LinkedList;
//https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLinkedListElements {
    /**
     * Definition for singly-linked list.
     */
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if(head == null) {
                return head;
            }
            ListNode curr = head;
            ListNode next = head.next;

            while(next != null) {
                if(head.val == val) {
                    curr = next;
                    head.next = null;
                    head = curr;
                    next = next.next;
                }
                else {
                    if(next.val == val) {
                        curr.next = next.next;
                        next.next = null;
                        next = curr.next;
                    }
                    else {
                        curr = curr.next;
                        next = next.next;
                    }
                }
            }
            if(curr.val == val) {
                curr = null;
                head = curr;
            }
            return head;
        }
    }
}
