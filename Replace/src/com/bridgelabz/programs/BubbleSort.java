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
		int Size;
		Utility u = new Utility();
		ArrayList<Integer> MyList = new ArrayList<Integer>();
		System.out.print("Enter size of list: ");
		Size = u.inputInteger();

		// INPUT DATA IN LIST
		System.out.println("Enter " + Size + " numbers");
		for (int i = 1; i <= Size; i++) {
			System.out.print("Enter number " + i + ": ");
			MyList.add(u.inputInteger());
		}

		// DISPLAY THE LIST
		System.out.println("The unsorted list is: " + MyList);

		// COMPUTATION
		int Temp;
		for (int i = 0; i < Size - 1; i++) {
			for (int j = i + 1; j < Size; j++) {
				if (MyList.get(i) > MyList.get(j)) {
					Temp = MyList.get(i);
					MyList.set(i, MyList.get(j));
					MyList.set(j, Temp);
				}
			}
		}

		// DISPLAY THE LIST
		System.out.println("The sorted list is: " + MyList);
	}
}