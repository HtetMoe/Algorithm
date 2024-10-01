package org.example.Lesson1.P03_ReverseSinglyLinkedList;

public class LinkedList_Recursive {
    Node head;
    public static void main(String[] args) {
        LinkedList_Recursive list = new LinkedList_Recursive();
        list.head      = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next      = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Original list:");
        list.printList();

        System.out.println("---");

        list.reverse();
        System.out.println("Reversed list:");
        list.printList();
    }

    public void reverse() {
        head = reverseRecursively(head);
    }
    private Node reverseRecursively(Node current) {
        // base case: if the list is empty/only contains one node
        if (current == null || current.next == null) {
            return current;
        }

        // Reverse the rest of the list
        Node newHead = reverseRecursively(current.next);

        // make the next node point to the current node
        current.next.next = current;
        current.next = null; // set the current node's next to null

        return newHead; // return the new head of the reversed list
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(STR."\{current.v} ");
            current = current.next;
        }
        System.out.println();
    }
}
