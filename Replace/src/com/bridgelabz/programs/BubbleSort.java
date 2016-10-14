/*
 Bubble Sort
a. Desc -> Reads in integers prints them in sorted order using Bubble Sort
b. I/P -> read in the list ints
c. O/P -> Print the Sorted List
 */
package com.bridgelabz.programs;

import java.util.ArrayList;
import com.bridgelabz.util.Utility;

public class BubbleSort {

	public static void main(String[] args) {

		// INITIALIZATION
		int n;
		Utility u = new Utility();
		ArrayList<Integer> my_intlist = new ArrayList<Integer>();
		System.out.print("Enter size of list: ");
		n = u.inputInteger();

		// INPUT DATA IN LIST
		System.out.println("Enter " + n + " numbers");
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter number " + i + ": ");
			// u.inputInteger();
			my_intlist.add(u.inputInteger());
		}

		// DISPLAY THE LIST
		System.out.println("The unsorted list is: " + my_intlist);

		// COMPUTATION
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (my_intlist.get(i) > my_intlist.get(j)) {
					temp = my_intlist.get(i);
					my_intlist.set(i, my_intlist.get(j));
					my_intlist.set(j, temp);

				}
			}
		}

		// DISPLAY THE LIST
		System.out.println("The sorted list is: " + my_intlist);
	}
}
