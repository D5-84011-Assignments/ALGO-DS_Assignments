package Q1;

//1. Implement singly circular linked list using tail pointer (no head pointer). Compare time complexities of all operations
public class SinglyCircularLL {
	static class Node {
		private int num;
		Node next;

		public Node(int value) {
			this.next = null;
			num = value;
		}
	}

	Node tail;

	public SinglyCircularLL() {
		tail = null;
	}

	public void display() {
		if (tail == null) {
			return;
		} else {
			Node trav = tail;
			System.out.print("Link :: ");
			do {
				System.out.print(trav.num + " ");
				trav = trav.next;
			} while (trav != tail);
			System.out.println("");
		}
		//T(n)=O(n)
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);

		if (tail == null) {
			tail = newNode;
			newNode.next = newNode;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
		//T(n)=O(1)
	}

	public void deleteFirst() {

		if (tail == tail.next) {
			tail = null;
		} else {
			tail.next = tail.next.next;
		}
		//T(n)=(1)
	}

	public void addLast(int value) {
		Node newNode = new Node(value);

		if (tail == null) {
			tail = newNode;
			newNode.next = newNode;
		} else {
			Node trav = tail;
			do {
				trav = trav.next;
			} while (trav.next != tail);
			newNode.next = trav.next;
			trav.next = newNode;
		}
		//T(n)=O(n)
	}

	public void deleteLast() {
		if (tail == tail.next) {
			tail = null;
		} else {
			Node trav = tail;
			do {
				trav = trav.next;
			} while (trav.next.next != tail);
			trav.next = tail;
		}
		//T(n)=O(n)
	}

	public void addPosition(int value, int pos) {
		Node newNode = new Node(value);
		if (tail == null) {
			tail = newNode;
			newNode.next = newNode;
		} else {
			Node trav = tail;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
		//T(n)=O(n)
	}

	public void deletePosition(int pos) {
		if (tail == tail.next) {
			tail = null;
		} else {
			Node trav = tail;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}
	//T(n)=O(n)
}
