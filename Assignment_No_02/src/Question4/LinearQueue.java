package Question4;
public class LinearQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public LinearQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = 0;
    }

    public void enqueue(int element) {
        if (rear == size) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = element;
    }

    public int dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front++];
    }

    public void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Output should be: 10 20 30
        queue.dequeue();
        queue.display(); // Output should be: 20 30
    }
}
