package Himanshu.ctcci.LinkedList;
import java.util.*;

//https://www.algoexpert.io/questions/Sum%20of%20Linked%20Lists

//This will fail in case of the number is too huge, LinkedlIst is too big
public class AddTwoLinkedListConvertToNumberFirst {
    static class Program {
        // This is an input class. Do not edit.
        public static class LinkedList {
            public int value;
            public LinkedList next;

            public LinkedList(int value) {
                this.value = value;
                this.next = null;
            }
        }

        public ArrayList<String> getNumber(LinkedList head, ArrayList<String> list) {
            if(head.next == null) {
                list.add(String.valueOf(head.value));
            }
            else {
                LinkedList prev = head;
                head = head.next;
                list = getNumber(head, list);
                list.add(String.valueOf(prev.value));
            }
            return list;
        }


        public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
            // Write your code here.
            LinkedList resHead = new LinkedList(0);
            LinkedList currentNode = resHead;
            int rem = 0;
            LinkedList l1 = linkedListOne;
            LinkedList l2 = linkedListTwo;
            ArrayList<String> numl1=new ArrayList<>();
            ArrayList<String> numl2=new ArrayList<>();

            ArrayList<String> s1 = getNumber(l1, numl1);
            ArrayList<String> s2 = getNumber(l2, numl2);
            String listString1 = String.join("", s1);
            String listString2 = String.join("", s2);
            String res = String.valueOf(Integer.parseInt(listString1) + Integer.parseInt(listString2));
            for(int j=res.length()-1; j>=0; j--) {
                System.out.println(res.charAt(j));
                LinkedList c = new LinkedList(Integer.parseInt(Character.toString(res.charAt(j))));
                currentNode.next = c;
                currentNode = c;
            }
            return resHead.next;
        }
    }

}
