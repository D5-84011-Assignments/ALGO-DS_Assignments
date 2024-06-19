package Question7;
import java.util.Stack;

public class ReverseArray {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int i : array) {
            stack.push(i);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
        System.out.println("Reversed array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
