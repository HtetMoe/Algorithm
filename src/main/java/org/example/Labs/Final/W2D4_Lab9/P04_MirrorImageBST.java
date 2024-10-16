package org.example.Labs.Final.W2D4_Lab9;

public class P04_MirrorImageBST {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(25);

        System.out.println(STR."Inorder traversal BTS :");
        printInOrder(root);
    }

    public static Node mirror(Node root) {
        if (root == null) return null;// base case

        // Swap the left and right children recursively
        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    // Helper function to print the tree in inorder traversal
    public static void printInOrder(Node root) {
        if (root != null) {

            //left, root, right
            printInOrder(root.left);
            System.out.print(STR."\{root.value} ");
            printInOrder(root.right);
        }
    }
}
