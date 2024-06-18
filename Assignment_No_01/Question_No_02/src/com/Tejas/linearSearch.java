package com.Tejas;

public class linearSearch {

	    public static int linearSearchLastOccurrence(int[] arr, int key) {
	        int lastIndex = -1; 
	        
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                lastIndex = i; 
	            }
	        }
	        
	        return lastIndex;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 5, 3, 7, 9, 3};
	        int key = 3;
	        System.out.println(linearSearchLastOccurrence(arr, key)); 
	    }
	}

	

