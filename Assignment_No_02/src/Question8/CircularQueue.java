package Question8;

public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int count;

    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int element) {
        if (count == size) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % size;
        queue[rear] = element;
        count++;
    }

    public int dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int element = queue[front];
        front = (front + 1) % size;
        count--;
        return element;
    }

    public void display() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }
        int tempCount = count;
        int tempFront = front;
        while (tempCount > 0) {
            System.out.print(queue[tempFront] + " ");
            tempFront = (tempFront + 1) % size;
            tempCount--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}
