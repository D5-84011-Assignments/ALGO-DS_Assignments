package Q3;
//3. Delete node which is having 2 childs in BST. (Replace node data by inorder successor)
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
		
		if (bst.search(85)) {
			System.out.println("Data Found");
		}
		else
			System.out.println("Data Not found");
		
		bst.deleteNode(7);
		bst.preOrder();
	}

}
