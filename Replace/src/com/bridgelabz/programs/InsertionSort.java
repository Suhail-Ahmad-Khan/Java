/*
 Insertion Sort
a. Desc -> Reads in strings from standard input and prints them in sorted order.
   Uses insertion sort.
b. I/P -> read in the list words
c. Logic -> Use Insertion Sort to sort the words in the String array
d. O/P -> Print the Sorted List 
 */
package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class InsertionSort {

	public static void main(String[] args) {

		// INITIALIZATION
		Utility u = new Utility();
		int n;

		System.out.print("Enter the size of array: ");
		n = u.inputInteger();
		String[] arr = new String[n];

		// INPUT STRING DATA
		System.out.print("Enter String Array: ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = u.inputString();

		// DISPLAY STRING DATA
		System.out.print("Input String Array is : ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");

		// COMPUTATION
		String key;
		for (int j = 1; j < arr.length; j++) {
			key = arr[j];
			int i = j - 1;
			while (i >= 0) {
				if (key.compareTo(arr[i]) > 0) {
					break;
				}
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}
		// DISPLAY STRING DATA
		System.out.println("");
		System.out.print("Output String Array is: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
	}
}
