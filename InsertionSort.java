package com.te.java.assignment;

public class InsertionSort {
	
	public static void insertionSort(int array[]) {
		int n = array.length;

		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}

	}

	public static void main(String[] args) {
		int[] arr1 = {10,24,1,2,22,34};
		System.out.println("Befor insertion Sort");

		for (int i : arr1) {
			System.out.println(i + "");
		}
		System.out.println();

		insertionSort(arr1); 

		System.out.println("After Insertion Sort");

		for (int i : arr1) {
			System.out.println(i + "");

		}
	}

}



