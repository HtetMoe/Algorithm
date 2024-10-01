package org.example.Labs.general;

import java.util.LinkedList;
import java.util.Queue;

public class P02_Queue {
    /*
        Queues typically, but do not necessarily, order elements in a FIFO (first-in-first-out)
        manner.
        - add, offer, remove, poll, element, peek, contain
     */
    public static void main(String[] args) {
        // create a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(STR."Queue: \{queue}");

        //peek front element
        System.out.println(STR."front element : \{queue.peek()}");

        //remove element
        System.out.println(STR."remove element : \{queue.poll()}");
        System.out.println(STR."Queue after removing => \{queue}");

        System.out.println(STR."Is empty : \{queue.isEmpty()}");
        System.out.println(STR."is contain 4 => \{queue.contains(4)}");
    }
}

/*
    Insert  add(e)    offer(e)
    Remove  remove()  poll()
    Examine element() peek()

    The remove() and poll() methods differ only in their behavior
    when the queue is empty: the remove() method throws an exception,
    while the poll() method returns null.
 */
