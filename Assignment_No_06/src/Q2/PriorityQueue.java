package Q2;

public class PriorityQueue {
	private Heapsort h;
	private final int pSIZE;
	public PriorityQueue(int size) {
		pSIZE = size;
		h = new Heapsort(pSIZE);
	}
	
	public void push(int value) {
		h.addHeap(value);
	}
	
	public int pop() {
		return h.deleteHeap();
	}
	
	public int peek() {
		return h.getMax();
	}
	
	public boolean isEmpty() {
		return h.isEmpty();
	}

	public boolean isFull() {
		return h.isFull();
	}
}
