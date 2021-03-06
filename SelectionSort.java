package com.te.java.assignment;

public class SelectionSort {
	
	void sort(int arr[]) {
		int n = arr.length;
		
		//One by one move boundary of unsorted sub array
		
		for (int i = 0; i < n-1; i++) {
			
			// Find the minimum element in unsorted array
			
			int min_idx = i;
			for (int j = 0; j < i+1; j++) {
				if (arr[j] < arr[min_idx]) 
					min_idx = j;
					
					//swap the found minimum element with the first
					// element
					
					int temp = arr[min_idx];
					arr[min_idx] = arr[i];
					arr[i] = temp;
				}
				
			}
	}

	
	void printArray(int arr[]) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + "");
			System.out.println();
		}

		// Driver code to test above

	}

	public static void main(String[] args) {
		
		SelectionSort ob = new SelectionSort();
		int arr[] = {64,25,12,22,11};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
		
	

	}

}



