package Q3;

public class BstMain {

	public static void main(String[] args) {
		BST bst = new BST();

		bst.add(8);
		bst.add(3);
		bst.add(10);
		bst.add(6);
		bst.add(1);
		bst.add(14);
		bst.add(13);
		bst.add(7);
		bst.add(4);

		bst.preOrder();
	}

}
