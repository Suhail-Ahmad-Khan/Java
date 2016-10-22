/*
 An Anagram Detection Example
a. Desc -> One string is an anagram of another if the second is simply a
rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
b. I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
c. O/P -> The Two Strings are Anagram or not....
*/

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class Anagram {

	public static void main(String[] args) {

		// INITIALIZATION
		String Input1, Input2;
		int Length1, Length2;
		boolean Flag;
		Utility u = new Utility();

		// INPUT THE STRINGS
		System.out.print("enter first string: ");
		Input1 = u.inputString();
		System.out.print("enter second string: ");
		Input2 = u.inputString();

		// REMOVING THE BLANK SPACES
		Input1 = u.RemoveSpaces(Input1);
		Input2 = u.RemoveSpaces(Input2);
		System.out.println(Input1);
		System.out.println(Input2);

		// CONVERTING TO UPPERCASE
		Input1 = u.ConvertUppercase(Input1);
		Input2 = u.ConvertUppercase(Input2);
		System.out.println(Input1);
		System.out.println(Input2);

		// STRING CONVERTED TO ARRAY
		char[] ArrayInput1 = Input1.toCharArray();
		char[] ArrayInput2 = Input2.toCharArray();

		// SORTING OF ARRAY
		ArrayInput1 = u.SortArray(ArrayInput1);
		ArrayInput2 = u.SortArray(ArrayInput2);
		System.out.println(ArrayInput1);
		System.out.println(ArrayInput2);

		// SET/RESET THE Flag
		Flag = u.SetFlag(ArrayInput1, ArrayInput2);

		// COMPARING THE LENGTHS OF STRINGS
		Length1 = Input1.length();
		Length2 = Input2.length();
		if (Length1 != Length2) {
			System.out.println("length of strings are not the same");
			System.out.println("it is NOT an ANAGRAM");
			return;
		}

		// CHECKING ANAGRAM CONDITION
		if (Flag)
			System.out.println("it is an ANAGRAM");
		else
			System.out.println("is is NOT an ANAGRAM");
	}
}