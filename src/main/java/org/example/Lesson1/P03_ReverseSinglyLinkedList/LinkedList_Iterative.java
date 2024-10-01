package org.example.Lesson1.P03_ReverseSinglyLinkedList;

public class LinkedList_Iterative {
    Node head;

    public static void main(String[] args) {
        LinkedList_Iterative list = new LinkedList_Iterative();
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
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node next = current.next; // store next
            current.next = previous;  // reverse link

            previous = current; // move previous to current
            current = next;     // move to next node
        }
        head = previous; // New head of the reversed list
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

