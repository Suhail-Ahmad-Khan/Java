/*
Leap Year
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.
 */

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class Leapyear {

	public static void main(String[] args) {

		// INITIALIZATION
		int Year, Length;
		String Input;
		Utility u = new Utility();

		// INPUT DATA
		System.out.print("enter the year: ");
		Input = u.inputString();
		Year = Integer.parseInt(Input);

		// COMPUTE THE LENGTH
		Length = Input.length();

		// CHECK LENGTH CONDITION
		if (Length != 4) {
			System.out.println("enter year as 4 digit number");
			return;
		}

		// COMPUTATION
		else {
			if (Year % 400 == 0 && Year % 100 == 0)
				System.out.println("year " + Year + " is a leap year");
			else if (Year % 100 != 0 && Year % 4 == 0)
				System.out.println("year " + Year + " is a leap year");
			else
				System.out.println("year " + Year + " is not a leap year");
		}
	}
}
