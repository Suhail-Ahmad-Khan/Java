
package com.bridgelabz.programs;

import java.util.ArrayList;
import com.bridgelabz.util.Utility;

public class Trial {

	public static void main(String[] args) {

		// INITIALIZATION
		int n;
		Utility u = new Utility();
		ArrayList<String> my_strlist = new ArrayList<String>();
		System.out.print("Enter size of list: ");
		n = u.inputInteger();

		// INPUT DATA IN LIST
		System.out.println("Enter " + n + " strings");
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter string " + i + ": ");
			// u.inputInteger();
			my_strlist.add(u.inputString());
		}

		// DISPLAY THE LIST
		System.out.println("The unsorted list is: " + my_strlist);

		// COMPUTATION
		String temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (my_strlist.get(i).compareTo(my_strlist.get(j)) > 0) {
					temp = my_strlist.get(i);
					my_strlist.set(i, my_strlist.get(j));
					my_strlist.set(j, temp);

				}
			}
		}

		// DISPLAY THE LIST
		System.out.println("The sorted list is: " + my_strlist);
	}
}
