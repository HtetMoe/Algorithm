package org.example.Labs.Lab1_ListStackQueueMap;

import java.util.LinkedList;
import java.util.Queue;

/*
    - Implement Stack using Queues
    - https://leetcode.com/problems/implement-stack-using-queues/description/
 */
public class MyStack {

    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        //added in order

        System.out.println(STR."Stack: \{obj.queue1}");
        int param_2 = obj.pop();

        //pop
        System.out.println(STR."pop: \{param_2}");
        System.out.println(STR."Stack after pop : \{obj.queue1}");

        //top element
        int param_3 = obj.top();
        System.out.println(STR."top element : \{param_3}");

        //is empty
        boolean param_4 = obj.empty();
        System.out.println(STR."is Empty : \{param_4}");

    }

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.add(x); //always add new elements into queue2(empty queue)

        //move queue1 to queue2
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }

        //swap them to make q1 holding elements in LIFO order
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    //remove top element
    public int pop() {
        return queue1.poll();
    }

    //get top element
    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
