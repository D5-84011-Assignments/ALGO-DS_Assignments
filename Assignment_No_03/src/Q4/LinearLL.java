package Q4;

//4. Write a function which will insert values in sorted order into linked list
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

	public void add(int value) {
		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
		} else if (head.next == null) {
			if (head.num > value) {
				newNode.next = head;
				head = newNode;
			} else {
				head.next = newNode;
			}
		} else {
			Node slow = head;
			Node fast = head.next;
			while (fast.num < value) {
				slow = fast;
				fast = fast.next;
			}
			newNode.next = fast;
			slow.next = newNode;
		}
	}

}
