package org.ichillous.tests.dsastudy.BST;

public class BST {
    public Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if(root == null ) {
            root = newNode;
            return true;
        }
        Node temp = root;

        while(true){
            if(newNode.value == temp.value) return false;
            if(newNode.value < temp.value) {
                if(temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if(temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }

        }

    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    private Node deleteNode(Node currentNode, int value) {
        if (currentNode == null) return null;
        if(value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if(value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            }
        }
        return currentNode;
    }
}



















