
package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;
import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchInt {

	// BINARY SEARCH STRING
	public static String BINSI(ArrayList<Integer> my_intlist, int num, int min, int max) {
		String str1, str2;
		str1 = "INTEGER FOUND";
		str2 = "INTEGER NOT FOUND";
		int mid = (max + min) / 2;
		if (min > max)
			return str2;
		if (my_intlist.get(mid) == num) {
			return str1;
		} else if (my_intlist.get(mid) < num) {
			return BINSI(my_intlist, num, min, mid - 1);
		} else {
			return BINSI(my_intlist, num, mid + 1, max);
		}
	}

	public static void main(String[] args) {

		// INITIALIZATION
		Utility u = new Utility();
		int n, min = 0, max, num;
		double start, stop, elapsed;
		String str1;
		ArrayList<Integer> my_intlist = new ArrayList<Integer>();
		start = u.StartTime();
		System.out.print("Enter size of list: ");
		n = u.inputInteger();

		// INPUT DATA IN LIST
		System.out.println("Enter " + n + " numbers");
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter number " + i + ": ");
			my_intlist.add(u.inputInteger());
		}
		System.out.print("Enter integer to search: ");
		num = u.inputInteger();

		// DISPLAY THE LIST
		System.out.println("The list is: " + my_intlist);

		// COMPUTATION
		max = my_intlist.size();
		Collections.sort(my_intlist);
		str1 = BINSI(my_intlist, num, min, max);
		stop = u.StopTime();
		System.out.println(str1);
		elapsed = (stop - start) / 1000.0;
		System.out.println("Total time elapsed: " + elapsed);
	}

}