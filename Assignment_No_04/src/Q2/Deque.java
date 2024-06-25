package Q2;

import java.util.Iterator;

//2. Implement Deque using doubly linear linked.
public class Deque {
	static class Node {
		private int data;
		private Node prev;
		private Node next;

		public Node(int data) {
			this.data = data;
			prev = next = null;
		}
	}

	Node head, tail;

	public Deque() {
		head = tail = null;
	}

	public void display() {
		if (head == null) {
			return;
		} else {
			Node trav = head;
			System.out.print("List:: ");
			while (trav != null) {
				System.out.print(trav.data + " ");
				trav = trav.next;
			}
			System.out.println("");
		}
	}

	public void pushF(int data) {
		Node nn = new Node(data);

		if (head == null) {
			head = nn;
			tail = nn;
		} else {
			nn.next = head;
			head = nn;
		}
	}

	public int popF() {
		if (head == null) {
			return -1;
		} else if (head.next == null) {
			int num = head.data;
			head = tail = null;
			return num;
		} else {
			int num = head.data;
			head = head.next;
			return num;
		}
	}

	public int peekF() {
		if (head == null) {
			return -1;
		} else if (head.next == null) {
			int num = head.data;
			return num;
		} else {
			int num = head.data;
			return num;
		}
	}

	public void pushEnd(int data) {
		Node nn = new Node(data);

		if (head == null) {
			tail = head = nn;
		} else {
			tail.next = nn;
			nn.prev = tail;
			tail = nn;

		}
	}

	public int popEnd() {

		if (head == null) {
			return -1;
		} else if (head.next == null) {
			int num = head.data;
			head = null;
			return num;
		} else {
			int num = tail.data;
			tail = tail.prev;
			tail.next = null;
			return num;
		}
	}

	public int peekEnd() {

		if (head == null) {
			return -1;
		} else if (head.next == null) {
			int num = head.data;
			return num;
		} else {
			int num = tail.data;
			return num;
		}
	}

	public void addPos(int value, int pos) {
		Node nn = new Node(value);
		if (head == null) {
			head = nn;
		} else if (pos <= 1 && head.next != null) {
			nn.next = head;
			head = nn;
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1 && trav.next != null; i++) {
				trav = trav.next;
			}
			nn.prev = trav;
			nn.next = trav.next;
			trav.next.prev = nn;
			trav.next = nn;
//			trav.next.next.prev=nn;
		}

	}
}
