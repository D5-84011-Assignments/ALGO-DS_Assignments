package com.Tejas;

class Node {
    int data;
    int leftSize; // Number of nodes in the left subtree
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.leftSize = 0;
        this.left = this.right = null;
    }
}



