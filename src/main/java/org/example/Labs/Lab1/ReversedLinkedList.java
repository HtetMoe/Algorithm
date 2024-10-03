package org.example.Labs.Lab1_ListStackQueueMap;
/*
    - 3 pointers
    prev, curr, next(temporary pointer to store the next node)

    https://leetcode.com/problems/reverse-linked-list/description/
 */

public class ReversedLinkedList {
    public static void main(String[] args) {
        //create list
        ListNode n = new ListNode(1);
        n.next      = new ListNode(2);
        n.next.next = new ListNode(3);
        n.next.next.next      = new ListNode(4);
        n.next.next.next.next = new ListNode(5);

        System.out.println("Original List: ");
        printList(n);

        System.out.println("Reversed List: ");
        printList(reverseList(n));

    }

    public static ListNode reverseList(ListNode n) {
        ListNode prev = null;
        ListNode curr = n;

        //iterate through the loop
        while (curr != null) {
            ListNode next = curr.next; // temporarily store the next
            curr.next = prev; // reverse

            prev = curr; // move prev to current
            curr = next; // move curr to next
        }
        return prev; // at the end, prev will be new head of reversedList
    }

    //helper method
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(STR."\{curr.val} ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
