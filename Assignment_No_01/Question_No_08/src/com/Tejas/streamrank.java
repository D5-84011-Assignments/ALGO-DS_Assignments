package com.Tejas;

public class streamrank {
    private Node root;

    // Insert a new number into the BST
    public void track(int number) {
        if (root == null) {
            root = new Node(number);
        } else {
            insert(root, number);
        }
    }

    // Insert helper function
    private void insert(Node node, int number) {
        if (number <= node.data) {
            node.leftSize++;
            if (node.left == null) {
                node.left = new Node(number);
            } else {
                insert(node.left, number);
            }
        } else {
            if (node.right == null) {
                node.right = new Node(number);
            } else {
                insert(node.right, number);
            }
        }
    }

    // Get rank of a number in the stream
    public int getRankOfNumber(int number) {
        return getRank(root, number);
    }

    // Get rank helper function
    private int getRank(Node node, int number) {
        if (node == null) {
            return 0;
        }

        if (number == node.data) {
            return node.leftSize + 1;
        } else if (number < node.data) {
            return getRank(node.left, number);
        } else {
            int rightRank = getRank(node.right, number);
            if (rightRank == 0) {
                return 0; // The number is not present in the BST
            }
            return node.leftSize + 1 + rightRank;
        }
    }

    public static void main(String[] args) {
        streamrank streamRank = new streamrank();
        int[] stream = {10, 20, 15, 3, 4, 4, 1};
        for (int num : stream) {
            streamRank.track(num);
        }

        int numberToFindRank = 4;
        int rank = streamRank.getRankOfNumber(numberToFindRank);
        if (rank > 0) {
            System.out.println("Rank of " + numberToFindRank + " is: " + rank);
        } else {
            System.out.println(numberToFindRank + " is not present in the stream.");
        }
    }
}
