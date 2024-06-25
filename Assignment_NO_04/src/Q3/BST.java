package Q3;

public class BST {
	static class Node {
		private int data;
		private Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	Node root;

	public BST() {
		root = null;
	}

	public void add(Node root, int data) {
		if (data < root.data) {
			if (root.left == null) {
				root.left = new Node(data);
				return;
			} else {
				add(root.left, data);
			}
		} else if (data >= root.data) {
			if (root.right == null) {
				root.right = new Node(data);
				return;
			} else {
				add(root.right, data);
			}
		}
	}

	public void add(int data) {
		
		if (root == null) {
			root = new Node(data);
		} else
			add(root, data);
	}

	public void preOrder(Node trav) {
		if (trav == null)
			return;
		System.out.print(" " + trav.data);
		preOrder(trav.left);
		preOrder(trav.right);
	}

	public void preOrder() {
		System.out.print("Preorder :: ");
		preOrder(root);
		System.out.println("");
	}
}
