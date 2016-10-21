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
		String str1, str2;
		int len1, len2;
		boolean flag;
		Utility u = new Utility();

		// INPUT THE STRINGS
		System.out.print("enter first string: ");
		str1 = u.inputString();
		System.out.print("enter second string: ");
		str2 = u.inputString();

		// REMOVING THE BLANK SPACES
		str1 = u.remove_spaces(str1);
		str2 = u.remove_spaces(str2);
		System.out.println(str1);
		System.out.println(str2);

		// CONVERTING TO UPPERCASE
		str1 = u.con_upper(str1);
		str2 = u.con_upper(str2);
		System.out.println(str1);
		System.out.println(str2);

		// STRING CONVERTED TO ARRAY
		char[] arr_str1 = str1.toCharArray();
		char[] arr_str2 = str2.toCharArray();

		// SORTING OF ARRAY
		arr_str1 = u.sort_array(arr_str1);
		arr_str2 = u.sort_array(arr_str2);
		System.out.println(arr_str1);
		System.out.println(arr_str2);

		// SET/RESET THE FLAG
		flag = u.set_flag(arr_str1, arr_str2);

		// COMPARING THE LENGTHS OF STRINGS
		len1 = str1.length();
		len2 = str2.length();
		if (len1 != len2) {
			System.out.println("length of strings are not the same");
			System.out.println("it is NOT an ANAGRAM");
			return;
		}

		// CHECKING ANAGRAM CONDITION
		if (flag)
			System.out.println("it is an ANAGRAM");
		else
			System.out.println("is is NOT an ANAGRAM");

	}

}
