/*
 Binary Search the Word from Word List
a. Desc -> Read in a list of words from File. Then prompt the user to enter a word to
   search the list. The program reports if the search word is found in the list.
b. I/P -> read in the list words comma separated from a File and then enter the word
   to be searched
c. Logic -> Use Arrays to sort the word list and then do the binary search
d. O/P -> Print the result if the word is found or not
*/
package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.Collections;

import com.bridgelabz.util.Utility;

public class BinarySearch {

	public static String binsearch(ArrayList<String> my_list, String str, int min, int max) {
		String str1, str2;
		str1 = "STRING FOUND";
		str2 = "STRING NOT FOUND";
		int mid = (max + min) / 2;
		if (min > max)
			return str2;
		if (my_list.get(mid).equals(str)) {
			return str1;
		} else if (my_list.get(mid).compareTo(str) > 0) {
			return binsearch(my_list, str, min, mid - 1);
		} else {
			return binsearch(my_list, str, mid + 1, max);
		}
	}

	public static void main(String[] args) {

		// INITIALIZATION
		int min = 0, max;
		Utility u = new Utility();
		ArrayList<String> my_list;
		String str, str1, filepath;
		System.out.print("Enter file path: ");
		filepath = u.inputString();
		System.out.print("Enter word to search: ");
		str = u.inputString();

		// COMPUTATION
		my_list = u.read_file(filepath);
		max = my_list.size();
		Collections.sort(my_list);
		str1 = binsearch(my_list, str, min, max);
		System.out.println(str1);
	}
}
