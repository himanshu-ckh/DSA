package Himanshu.ctcci.LinkedList;

public class AddTwoLinkedList2 {

     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode node1 = l1, node2 = l2, curr = dummyHead;
            int carry = 0;
            while(node1 != null || node2 != null) {
                int x = (node1 != null) ? node1.val : 0;
                int y = (node2 != null) ? node2.val : 0;

                int sum = carry + x + y;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                if(node1 != null) node1 = node1.next;
                if(node2 != null) node2 = node2.next;
            }

            if(carry > 0) {
                curr.next = new ListNode(carry);
            }

            return dummyHead.next;
        }
    }
}
