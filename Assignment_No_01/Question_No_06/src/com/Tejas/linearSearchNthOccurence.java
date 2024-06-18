package com.Tejas;

public class linearSearchNthOccurence {


	    // Linear Search method to find the nth occurrence of the given element
	    public static int linearSearchNthOccurrence(int[] arr, int key, int n) {
	        int occurrenceCount = 0; // To count occurrences of the key
	        
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                occurrenceCount++;
	                if (occurrenceCount == n) {
	                    return i;
	                }
	            }
	        }
	        return -1; // nth occurrence not found
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 5, 3, 7, 9, 3, 3, 3};
	        int key = 3;
	        int n = 4;

	        // Perform linear search to find the nth occurrence of key
	        int result = linearSearchNthOccurrence(arr, key, n);
	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found for the " + n + "th occurrence.");
	        }
	    }


	
}
