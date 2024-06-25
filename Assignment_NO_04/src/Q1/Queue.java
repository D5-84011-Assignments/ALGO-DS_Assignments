package Q1;

public class Queue extends List{
	static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node head;

	public Queue() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void push(int data) {
		Node nn = new Node(data);
		if (head == null) {
			head = nn;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = nn;
		}
	}

	public int peek() {
		if (head == null) {
			return -1;
		} else if (head.next == null) {
			int num = head.data;
			return num;
		} else {
			return head.data;
		}
	}

	public int pop() {
		if (head == null) {
			return -1;
		} else if (head.next == null) {
			int num = head.data;
			head = null;
			return num;
		} else {
			int num = head.data;
			head = head.next;
			return num;

		}
	}
}
