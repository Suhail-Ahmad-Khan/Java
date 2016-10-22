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
		int Size;

		System.out.print("Enter the size of array: ");
		Size = u.inputInteger();
		String[] Array = new String[Size];

		// INPUT STRING DATA
		System.out.print("Enter String Array: ");
		for (int i = 0; i < Array.length; i++)
			Array[i] = u.inputString();

		// DISPLAY STRING DATA
		System.out.print("Input String Array is : ");
		for (int i = 0; i < Array.length; i++)
			System.out.print(Array[i] + "\t");

		// COMPUTATION
		String key;
		for (int j = 1; j < Array.length; j++) {
			key = Array[j];
			int i = j - 1;
			while (i >= 0) {
				if (key.compareTo(Array[i]) > 0) {
					break;
				}
				Array[i + 1] = Array[i];
				i--;
			}
			Array[i + 1] = key;
		}
		
		// DISPLAY STRING DATA
		System.out.println("");
		System.out.print("Output String Array is: ");
		for (int i = 0; i < Array.length; i++)
			System.out.print(Array[i] + "\t");
	}
}