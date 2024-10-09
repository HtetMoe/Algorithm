package org.example.lessons.Lesson1.P03_ReverseSinglyLinkedList;

public class LinkedList_Recursive {

    public static void main(String[] args) {
        Node n      = new Node(1);
        n.next      = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = new Node(4);

        System.out.println("Original list:");
        printList(n);
        System.out.println("---");

        Node reversedNode = reverse(n);
        System.out.println("Reversed list:");
        printList(reversedNode);
    }

    public static Node reverse(Node n) {
        Node current = n;

        // base case: if the list is empty/only contains one node
        if(n == null || current.next == null) return n;

        Node newHead = reverse(current.next); // recursive call : reverse the rest of the list
        current.next.next = n; // reverse
        current.next = null;

        return newHead; // return the new head of the reversed list
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(STR."\{current.v} ");
            current = current.next;
        }
        System.out.println();
    }
}
