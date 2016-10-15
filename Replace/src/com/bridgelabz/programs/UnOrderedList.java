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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class UnOrderedList {

	static Scanner s;

	public static LinkedList<String> read_file(String filepath) {
		try {
			s = new Scanner(new File(filepath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LinkedList<String> list = new LinkedList<String>();
		while (s.hasNext()) {
			list.add(s.next());
		}
		s.close();
		return list;
	}

	public static void main(String[] args) throws IOException {

		// INITIALIZATION
		Utility u = new Utility();
		LinkedList<String> my_list = new LinkedList<String>();
		String str, filepath;
		System.out.print("Enter file path: ");
		filepath = u.inputString();
		System.out.print("Enter word to search: ");
		str = u.inputString();

		// COMPUTATION
		my_list = read_file(filepath);
		System.out.println(my_list.size());
		if (my_list.contains(str)) {
			my_list.remove(str);
			System.out.println(my_list.size());
		} else {
			my_list.add(str);
			System.out.println(my_list.size());
		}
		
		//WRITING TO THE FILE
		FileWriter writer = new FileWriter(filepath);
		for(int i = 0; i<my_list.size(); i++)
		{
			writer.write(my_list.get(i) +" "); 
		      writer.flush();
		}
		writer.close();
	}
}
