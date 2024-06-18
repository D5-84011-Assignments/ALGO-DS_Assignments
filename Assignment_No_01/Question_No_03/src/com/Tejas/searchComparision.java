package com.Tejas;

public class searchComparision {

	    // Linear Search method
	    public static int linearSearch(int[] arr, int key) {
	        int comparisons = 0;
	        for (int i = 0; i < arr.length; i++) {
	            comparisons++;
	            if (arr[i] == key) {
	                System.out.println("Linear Search Comparisons: " + comparisons);
	                return i;
	            }
	        }
	        System.out.println("Linear Search Comparisons: " + comparisons);
	        return -1;
	    }

	    // Binary Search method
	    public static int binarySearch(int[] arr, int key) {
	        int comparisons = 0;
	        int left = 0, right = arr.length - 1;

	        while (left <= right) {
	            comparisons++;
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == key) {
	                System.out.println("Binary Search Comparisons: " + comparisons);
	                return mid;
	            }

	            if (arr[mid] < key) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        System.out.println("Binary Search Comparisons: " + comparisons);
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
	        int key = 7;


	        int linearResult = linearSearch(arr, key);
	        System.out.println("Linear Search Result: " + linearResult);

	        int binaryResult = binarySearch(arr, key);
	        System.out.println("Binary Search Result: " + binaryResult);
	    }
	}

	

