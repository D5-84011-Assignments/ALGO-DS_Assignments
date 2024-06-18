package com.Tejas;

public class descendingBinarySearch {

	    // Binary Search method for descending order array
	    public static int binarySearchDescending(int[] arr, int key) {
	        int left = 0;
	        int right = arr.length - 1;
	        int comparisons = 0;

	        while (left <= right) {
	            comparisons++;
	            int mid = left + (right - left) / 2;

	           
	            if (arr[mid] == key) {
	                System.out.println("Binary Search Comparisons: " + comparisons);
	                return mid;
	            }

	         
	            if (arr[mid] < key) {
	                right = mid - 1;
	            } else {
	                left = mid + 1;
	            }
	        }
	        System.out.println("Binary Search Comparisons: " + comparisons);
	        return -1; 
	    }

	    public static void main(String[] args) {
	        int[] arr = {20, 17, 15, 13, 11, 9, 7, 5, 3, 1};
	        int key = 15;

	        // Perform binary search
	        int result = binarySearchDescending(arr, key);
	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found in the array.");
	        }
	    }
	}


