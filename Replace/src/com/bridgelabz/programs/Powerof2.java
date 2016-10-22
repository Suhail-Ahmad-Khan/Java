/*
Power of 2
a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not. 
 */

package com.bridgelabz.programs;

public class Powerof2 {

	public static void main(String[] args) {

		// INITIALIZATION
		int Number, MultTable = 1;

		// DATA INPUT THROUGH COMMAND LINE
		Number = Integer.parseInt(args[0]);

		// CONDITION CHECK
		if (Number > 31) {
			System.out.println("value of number should be less than 31");
			return;
		}

		// COMPUTATION
		else {
			System.out.println(MultTable);
			for (int j = 1; j <= Number; j++) {
				MultTable = MultTable * 2;
				System.out.println(MultTable);
			}
		}
	}
}
