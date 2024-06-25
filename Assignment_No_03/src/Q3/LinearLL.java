package Q3;

import java.util.ArrayList;
//3. Display Singly linear linked list in reverse orde
public class LinearLL{
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

	public boolean isEmpty() {
		return head == null;
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

	public void deleteAll() {
		head = null;
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

	public void addLast(int value) {
		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
		}
	}

	public void deleteFirst() {
		if (head == null)
			return;
		else if (head.next == null)
			head = null;
		else {
			head = head.next;
		}

	}

	public void deleteLast() {
		if (head == null)
			return;
		else if (head.next == null)
			head = null;
		else {
			Node trav = head;
			while (trav.next.next != null)
				trav = trav.next;
			trav.next = null;
		}
	}

	public void addPosition(int value, int pos) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else if (pos <= 1) {
			addFirst(value);
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1 && trav.next != null; i++) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}

	public void deletePosition(int pos) {
		if (head == null) {
			head = null;
		} else if (pos <= 1)
			head = head.next;
		else {
			Node trav = head;
			for (int i = 1; i < pos && trav.next.next != null; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}

	public int findEle(int ele) {
		if (head == null) {
			return -1;
		} else {
			Node trav = head;
			for (int i = 1; trav != null; i++) {
				if (trav.num == ele)
					return i;
				trav = trav.next;
			}
		}
		return -1;
	}

	public ArrayList<Integer> reverse() {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		if (head == null) {
			return arr;
		} else {
			Node trav = head;
			while (trav != null) {
				arr.add(0, trav.num);
				trav = trav.next;
			}
		}
		
		return arr;
	}
}
