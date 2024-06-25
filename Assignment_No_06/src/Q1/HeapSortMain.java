package Q1;

import java.util.Arrays;

//1. Implement heap sort using min heap
public class HeapSortMain {

	public static void main(String[] args) {
		int arr[] = { 0, 6, 14, 3, 26, 8, 18, 21, 9, 5 };

		Heapsort h = new Heapsort();

		System.out.println("Array before : " + Arrays.toString(arr));
		h.heapSort(arr);
		System.out.println("Array after : " + Arrays.toString(arr));
	}

}
