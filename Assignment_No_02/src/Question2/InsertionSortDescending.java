package Question2;
public class InsertionSortDescending {
    public static void insertionSortDescending(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        insertionSortDescending(array);
        System.out.println("Sorted array in descending order: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
