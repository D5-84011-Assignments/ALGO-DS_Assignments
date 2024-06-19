package Question5;
public class DescendingStack {
    private int[] stack;
    private int top;
    private int size;

    public DescendingStack(int size) {
        this.size = size;
        stack = new int[size];
        top = size; // Stack is initially empty, so 'top' starts at 'size'
    }

    public void push(int element) {
        if (top == 0) {
            System.out.println("Stack is full");
            return;
        }
        stack[--top] = element;
    }

    public int pop() {
        if (top == size) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top++];
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
        DescendingStack stack = new DescendingStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Output should be: 30 20 10
        stack.pop();
        stack.display(); // Output should be: 20 10
    }
}
