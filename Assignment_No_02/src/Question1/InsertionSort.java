package Question1;
public class InsertionSort {
    public static int insertionSort(int[] array) {
        int n = array.length;
        int comparisons = 0;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                comparisons++;
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
            if (j >= 0) comparisons++;
        }
        return comparisons;
    }
    
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        int comparisons = insertionSort(array);
        System.out.println("Sorted array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\nNumber of comparisons: " + comparisons);
    }
}
