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

	public static String binarySearch(ArrayList<String> MyList, String Word, int MinValue, int MaxValue) {
		String Output1, Output2;
		Output1 = "STRING FOUND";
		Output2 = "STRING NOT FOUND";
		int MidValue = (MaxValue + MinValue) / 2;
		if (MinValue > MaxValue)
			return Output2;
		if (MyList.get(MidValue).equals(Word)) {
			return Output1;
		} else if (MyList.get(MidValue).compareTo(Word) > 0) {
			return binarySearch(MyList, Word, MinValue, MidValue - 1);
		} else {
			return binarySearch(MyList, Word, MidValue + 1, MaxValue);
		}
	}

	public static void main(String[] args) {

		// INITIALIZATION
		int MinValue = 0, MaxValue;
		Utility u = new Utility();
		ArrayList<String> MyList;
		String Word, Output, FilePath;
		System.out.print("Enter file path: ");
		FilePath = u.inputString();
		System.out.print("Enter word to search: ");
		Word = u.inputString();

		// COMPUTATION
		MyList = u.ReadFile(FilePath);
		MaxValue = MyList.size();
		Collections.sort(MyList);
		Output = binarySearch(MyList, Word, MinValue, MaxValue);
		System.out.println(Output);
	}
}
