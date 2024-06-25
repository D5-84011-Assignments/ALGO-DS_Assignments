package Q3;

//3. Delete node which is having 2 childs in BST. (Replace node data by inorder successor)
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

	public Node[] searchParent(int key) {
		Node parent=null;
		Node child = root;

		while (child!=null) {
			if (key==child.data) {
				break;
			}
			parent=child;
			if (child.data>key) {
				child=child.left;
			}
			else
				child=child.right;
		}
		return new Node[] {child,parent};
	}
	public void deleteNode(int key) {
		Node arr[] = searchParent(key);
		Node temp = arr[0], parent = arr[1];
		if(temp == null)
			return;
		if(temp.left != null && temp.right != null){
			Node pred = temp.left;
			parent = temp;
			while(pred.right != null){
				parent = pred;
				pred = pred.right;
			}
			temp.data = pred.data;
			temp = pred;
		}
		if(temp.left == null){
			if(temp == root)
				root = temp.right;
			else if(temp == parent.left)
				parent.left = temp.right;
			else if(temp == parent.right)
				parent.right = temp.right;
		}
		else if(temp.right == null){
			if(temp == root)
				root = temp.left;
			else if(temp == parent.left)
				parent.left = temp.left;
			else if(temp == parent.right)
				parent.right = temp.left;
		}
	}
	public boolean search(int value) {
		if (root.data == value) {
			return true;
		} else {
			return search(root, value);
		}
	}

	public boolean search(Node root, int data) {
		if (data < root.data) {
			if (root.data == data) {
				return true;
			} else {
				if (root.left != null)
					return search(root.left, data);
				else
					return false;
			}
		} else {
			if (root.data == data) {
				return true;
			} else {
				if (root.right != null)
					return search(root.right, data);
				else
					return false;
			}
		}

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
