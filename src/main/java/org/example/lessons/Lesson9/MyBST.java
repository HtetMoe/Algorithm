package org.example.lessons.Lesson9;

public class MyBST {
    private static BinaryNode root;

    public MyBST() {
        root = null;
    }

    public static void main(String[] args) {
        MyBST tree = new MyBST();  // BST : 1,8,2,3,9,5,4

        // Insert the elements 1, 8, 2, 3, 9, 5, 4
        tree.insert(1);
        tree.insert(8);
        tree.insert(2);
        tree.insert(3);
        tree.insert(9);
        tree.insert(5);
        tree.insert(4);

        // Print the tree in sorted order (in-order traversal)
        System.out.println("Tree in sorted order:");
        tree.printTree();
    }

    // print in sorted order
    public static void printTree() {
        if (root == null)
            System.out.println("Empty tree");
        else
            printTree(root);
    }

    private static void printTree(BinaryNode t) {
        if (t != null) {
            printTree(t.left);
            System.out.println(t.element);
            printTree(t.right);
        }
    }

    public void insert(Integer x) {
        if (root == null) {
            root = new BinaryNode(x, null, null);
            return;
        }
        BinaryNode n = root;
        boolean inserted = false;
        while (!inserted) {
            if (x.compareTo(n.element) < 0) {
                //space found on the left
                if (n.left == null) {
                    n.left = new BinaryNode(x, null, null);
                    inserted = true;
                }
                //keep looking
                else {
                    n = n.left;
                }
            } else if (x.compareTo(n.element) > 0) {
                //space found on the right
                if (n.right == null) {
                    n.right = new BinaryNode(x, null, null);
                    inserted = true;
                }
                //keep looking
                else {
                    n = n.right;
                }
            }
        }
    }

    class BinaryNode {
        private Integer element; // The data in the node
        private BinaryNode left; // Left child
        private BinaryNode right; // Right child

        // Constructors
        BinaryNode(Integer theElement) {
            this(theElement, null, null);
        }

        BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
            this.element = element;
            this.left = left;
            this.right = right;
        }
    }
}