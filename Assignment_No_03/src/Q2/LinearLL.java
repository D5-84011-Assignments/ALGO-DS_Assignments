package Q2;

//In singly linear list implement following operations. i. insert a new node after a given node ii. insert anew node before a given node
public class LinearLL {
	static class Node {
		private int num;
		Node next;

		public Node(int value) {
			this.next = null;
			num = value;
		}
	}

	Node head;

	public LinearLL() {
		head = null;
	}

	public void display() {
		if (head == null) {
			return;
		} else {
			Node trav = head;
			System.out.print("List :: ");
			while (trav != null) {
				System.out.print(trav.num + " ");
				trav = trav.next;
			}
			System.out.println("");
		}
	}
	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}
	public void insertAfter(int value, int insertVal) {
		Node newNode = new Node(insertVal);

		Node trav = head;
		while (trav.num != value) {
			trav = trav.next;
		}
		newNode.next = trav.next;
		trav.next = newNode;

	}



	public void insertBefore(int value, int insertVal) {
		Node newNode = new Node(insertVal);

		Node trav = head;
		while (trav.next.num != value) {
			trav = trav.next;
		}
		newNode.next = trav.next;
		trav.next = newNode;
	}
}
