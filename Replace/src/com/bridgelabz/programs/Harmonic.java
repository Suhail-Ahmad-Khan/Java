/*
 Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. E
nsure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.
 */

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class Harmonic {

	public static void main(String[] args) {

		// INITIALIZATION
		double Result = 0, Harmonic = 0;
		int Number;
		Utility u = new Utility();

		// INPUT DATA
		System.out.print("enter the harmonic you want to find: ");
		Number = u.inputInteger();

		// COMPUTATION
		for (double j = 1; j <= Number; j++) {
			Harmonic = Harmonic + (1 / j);
			Result = Harmonic;
		}
		System.out.println("the value of harmonic no. " + Number + " is: " + Result);
	}
}
