package Q1;

public class Stack  extends List{
	static class Node {
		private int data;
		private Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	Node head;

	public Stack() {
		head = null;
	}

	public void push(int value) {
		Node nn = new Node(value);
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
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			return trav.data;
		}
	}

	public int pop() {
		if (head == null) {
			return -1;
		} 
		else if(head.next==null) {
			int num =head.data;
			head=null;
			return num;
		}
		else {
			Node trav = head;
			while (trav.next.next != null) {
				trav = trav.next;
			}
			int num = trav.next.data;
			trav.next = null;
			return num;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}
}
