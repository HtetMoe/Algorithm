package org.example.Labs.Lab1_ListStackQueueMap;
/*
    - 3 pointers
    prev, curr, next(temporary pointer to store the next node)

    https://leetcode.com/problems/reverse-linked-list/description/
 */

public class ReversedLinkedList {
    public static void main(String[] args) {
        //create list
        ListNode head = new ListNode(1);
        head.next      = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next      = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List: ");
        printList(head);

        System.out.println("Reversed List: ");
        printList(reverseList(head));

    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        //iterate through the loop
        while (curr != null) {
            ListNode next = curr.next; // temporarily store the next
            curr.next = prev; // reverse the current node's pointer

            prev = curr; // move prev to the current
            curr = next; // move curr to the next
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
