package com.Tejas;

	import java.util.HashMap;
	import java.util.Map;

	public class firstNonReapeatingElement {
	

	    // Method to find the first non-repeating element
	    public static int findFirstNonRepeating(int[] arr) {
	        // Step 1: Create a HashMap to store the count of each element
	        Map<Integer, Integer> elementCountMap = new HashMap<>();

	        // Step 2: Populate the map with element counts
	        for (int num : arr) {
	            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
	        }

	        // Step 3: Traverse the array again to find the first element with a count of 1
	        for (int num : arr) {
	            if (elementCountMap.get(num) == 1) {
	                return num;
	            }
	        }

	        // Step 4: If no non-repeating element is found, return a special value (e.g., -1)
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};

	        // Find and print the first non-repeating element
	        int result = findFirstNonRepeating(arr);
	        if (result != -1) {
	            System.out.println("The first non-repeating element is: " + result);
	        } else {
	            System.out.println("No non-repeating element found.");
	        }
	    }


	
}
