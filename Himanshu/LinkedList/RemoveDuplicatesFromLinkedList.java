package Himanshu.ctcci.LinkedList;
//https://www.algoexpert.io/questions/Remove%20Duplicates%20From%20Linked%20List
class RemoveDuplicatesFromLinkedList {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        // Write your code here.
        /*Create two pointer -> curr and next
        If the value are equal move the next pointer and if they are not equal, move the current pointer and move the next as well
         */
        LinkedList curr = linkedList;
        LinkedList next = linkedList.next;

        while(next != null) {
            if(curr.value != next.value) {
                curr.next = next;
                curr = next;
            }

            next = next.next;
        }

        /*Edge case ->
         1-1-2-2-3-4-5-6-7-7
        If the last values are same, then next will be null and curr.next will be euqal to a value but should be null
        So we check if curr.next is not qual to next which is null, then curr.next should be euqal to null
        */
        if(curr.next != next) {
            curr.next = null;
        }

        return linkedList;
    }
}
