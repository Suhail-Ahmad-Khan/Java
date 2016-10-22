/*
 UnOrdered List
a. Desc -> Read the Text from a file, split it into words and arrange it as Linked List.
   Take a user input to search a Word in the List. If the Word is not found then add it
   to the list, and if it found then remove the word from the List. In the end save the
   list into a file
b. I/P -> Read from file the list of Words and take user input to search a Text
c. Logic -> Create a Unordered Linked List. The Basic Building Block is the Node
   Object. Each node object must hold at least two pieces of information. One ref to
   the data field and second the ref to the next node object.
d. O/P -> The List of Words to a File.
 */

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

import java.io.IOException;
import java.util.LinkedList;

public class UnOrderedList {

	public static void main(String[] args) throws IOException {

		// INITIALIZATION
		Utility u = new Utility();
		LinkedList<String> MyList = new LinkedList<String>();
		String Word, FilePath;
		System.out.print("Enter file path: ");
		FilePath = u.inputString();
		System.out.print("Enter word to search: ");
		Word = u.inputString();

		// COMPUTATION
		MyList = u.ReadFile1(FilePath);
		System.out.println(MyList.size());
		if (MyList.contains(Word)) {
			MyList.remove(Word);
			System.out.println(MyList.size());
		} else {
			MyList.add(Word);
			System.out.println(MyList.size());
		}

		// WRITING TO THE FILE
		u.WriteFile(FilePath, MyList);
	}
}