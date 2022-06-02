package Himanshu.ctcci.LinkedList;

public class IntersectionOfTwoLinkedList160 {

     //* Definition for singly-linked list.
     public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
     }

    public static class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         Set<ListNode> set = new HashSet<>();

//         ListNode h1 = headA;
//         while(h1 != null) {
//             set.add(h1);
//             h1 = h1.next;
//         }

//         ListNode h2 = headB;

//         while(h2 != null) {
//             if(set.contains(h2)) {
//                 return h2;
//             }

//             h2 = h2.next;
//         }

//         return null;

            if(headA == null || headB == null) {
                return null;
            }
            ListNode h1 = headA;
            ListNode h2 = headB;
            int countA = 0;
            int countB = 0;


            while(h1 != null) {
                countA += 1;
                h1 = h1.next;
            }

            while(h2 != null) {
                countB += 1;
                h2 = h2.next;
            }

            if(countA > countB) {
                for(int i=0; i<countA-countB; i++) {
                    headA = headA.next;
                }
            }
            else if(countB > countA) {
                for(int i=0; i<countB-countA; i++) {
                    headB = headB.next;
                }
            }

            while(headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }

            return headA;

        }
    }
}
