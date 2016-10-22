/*
 Find the Fewest Notes to be returned for Vending Machine
a. Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be
   returned by Vending Machine. Write a Program to calculate the minimum number
   of Notes as well as the Notes to be returned by the Vending Machine as a
   Change
b. I/P -> read the Change in Rs to be returned by the Vending Machine
c. Logic -> Use Recursion and check for largest value of the Note to return change
   to get to minimum number of Notes.
d. O/P -> Two Outputs - one the number of minimum Note needed to give the
   change and second list of Rs Notes that would given in the Change 
 */

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class VendingMachine {
	static int FinalCount = 0;
	static int[] ArrayNotes = new int[] { 1000, 500, 100, 50, 10, 5, 2, 1 };
	static int[] NotesCount = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };

	public static int[] CalculateNotes(int Number) {
		if (Number == 0)
			return NotesCount;
		for (int i = 0; i < ArrayNotes.length; i++) {
			NotesCount[i] = Number / ArrayNotes[i];
			Number = Number % ArrayNotes[i];
			FinalCount = FinalCount + NotesCount[i];
			if (Number > ArrayNotes[i])
				--i;
		}
		return CalculateNotes(Number);
	}

	public static void main(String[] args) {
		int Number;
		int[] MyCount;
		Utility u = new Utility();
		System.out.print("Enter Number: ");
		Number = u.inputInteger();
		MyCount = CalculateNotes(Number);
		System.out.println("Minimum notes required: " + FinalCount);

		for (int i = 0; i < ArrayNotes.length; i++) {
			System.out.println(ArrayNotes[i] + " : " + MyCount[i]);
		}
	}
}