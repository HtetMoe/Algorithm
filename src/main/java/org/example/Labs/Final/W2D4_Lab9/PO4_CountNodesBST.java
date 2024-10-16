package org.example.Labs.Final.W2D4_Lab9;

public class PO4_CountNodesBST {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);

        root.right.left = new Node(15);
        root.right.right = new Node(25);

        System.out.println(STR."Count nodes : \{countNodes(root)}");
    }
    public static int countNodes(Node root) {
        if (root == null)  return 0; // base case
        return countNodes(root.left) + countNodes(root.right) + 1; // 1 is root
    }

}
