package org.example.Labs.general;

import java.util.Stack;

public class P01_Stack {
    public static void main(String[] args) {
        /*
            - The Stack class represents a last-in-first-out (LIFO) stack of objects.
            - push, pop, peek, search
         */
        Stack<Integer> stack = new Stack<>();  // Stack<int> compiler err => not allowed primitive
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(STR."Stack: \{stack}");

        //top element
        System.out.println(STR."top element => \{stack.peek()}");

        //pop from stack
        System.out.println(STR."pop element, \{stack.pop()}");
        System.out.println(STR."after popping : \{stack}");

        //check isEmpty?
        System.out.println(STR."Is empty : \{stack.isEmpty()}");

        //search
        System.out.println(STR."is contain 4 => \{stack.search(4) == 1 ? true : false}");

    }
}
