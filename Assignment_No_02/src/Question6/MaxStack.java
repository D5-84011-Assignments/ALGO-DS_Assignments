package Question6;

public class MaxStack {
    private int[] stack;
    private int top;
    private int size;
    private int max;

    public MaxStack(int size) {
        this.size = size;
        stack = new int[size];
        top = size;
        max = Integer.MIN_VALUE;
    }

    public void push(int element) {
        if (top == 0) {
            System.out.println("Stack is full");
            return;
        }
        if (element > max) {
            max = element;
        }
        stack[--top] = element;
    }

    public int pop() {
        if (top == size) {
            System.out.println("Stack is empty");
            return -1;
        }
        int element = stack[top++];
        if (element == max && top != size) {
            max = findNewMax();
        }
        return element;
    }

    private int findNewMax() {
        int newMax = Integer.MIN_VALUE;
        for (int i = top; i < size; i++) {
            if (stack[i] > newMax) {
                newMax = stack[i];
            }
        }
        return newMax;
    }

    public int getMax() {
        return max;
    }

    public void display() {
        if (top == size) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i < size; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaxStack stack = new MaxStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(5);
        stack.push(30);
        stack.push(15);
        stack.display();
        System.out.println("Maximum value in stack: " + stack.getMax());
    }
}
