package org.example.Lesson1.P03_ReverseSinglyLinkedList;

public class LinkedList_Iterative {

    public static void main(String[] args) {
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = new Node(4);

        System.out.println("Original list:");
        printList(n);

        System.out.println("---");

        Node reversedN = reverse(n);
        System.out.println("Reversed list:");
        printList(reversedN);
    }

    public static Node reverse(Node n) {
        Node previous = null;
        Node current  = n;

        while (current != null) {
            Node next = current.next; // store next
            current.next = previous;  // reverse link

            previous = current; // move previous to current
            current = next;     // move current to next
        }

        n = previous; // new head of the reversed list
        return n;
    }

    public static void printList(Node n) {
        Node current = n;
        while (current != null) {
            System.out.print(STR."\{current.v} ");
            current = current.next;
        }
        System.out.println();
    }
}

