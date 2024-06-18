package com.Tejas;

public class selectionSort {

	    // Selection Sort function that returns the number of comparisons
	    public static int selectionSort(int[] arr) {
	        int n = arr.length;
	        int comparisons = 0;

	        for (int i = 0; i < n - 1; i++) {
	            // Find the minimum element in the unsorted part of the array
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                comparisons++;
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            // Swap the found minimum element with the first element
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }

	        return comparisons;
	    }

	    public static void main(String[] args) {
	        int[] arr = {64, 25, 12, 22, 11};

	        // Perform selection sort and get the number of comparisons
	        int comparisonCount = selectionSort(arr);

	        // Print the sorted array
	        System.out.print("Sorted array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        // Print the number of comparisons
	        System.out.println("\nNumber of comparisons: " + comparisonCount);
	    }
	}

	

