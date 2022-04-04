package com.company;
public class Bst {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int d) {
            data = d;
            left = right = null;
        }
    }
    class BinaryTree {
         Node head;

        Node insert(Node node, int data) {
            if (node == null) {
                return (new Node(data));
            } else {
                if (data <= node.data) {
                    node.left = insert(node.left, data);
                } else {
                    node.right = insert(node.right, data);
                }
                return node;
            }
        }
        int minvalue(Node node) {
            Node current = node;

            /* loop down to find the leftmost leaf */
            while (current.left != null) {
                current = current.left;
            }
            return (current.data);
        }
        public static void main(String[] args) {
            Bst = new Bst();
            Node root = null;
            root = tree.insert(root, 4);
            Bst.insert(root, 2);
            BinaryTree.insert(root, 1);
            BinaryTree.insert(root, 3);
            BinaryTree.insert(root, 6);
            BinaryTree.insert(root, 5);
            System.out.println("Minimum value of BST is " + tree.minvalue(root));
        }
    }
}