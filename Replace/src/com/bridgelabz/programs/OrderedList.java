/*
 Ordered List
a. Desc -> Read .a List of Numbers from a file and arrange it ascending Order in a
   Linked List. Take user input for a number, if found then pop the number out of the
   list else insert the number in appropriate position
b. I/P -> Read from file the list of Numbers and take user input for a new number
c. Logic -> Create a Ordered Linked List having Numbers in ascending order.
d. O/P -> The List of Numbers to a File.
 */

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;
import java.io.IOException;

import com.bridgelabz.util.GenericLinkedList;

public class OrderedList {

	public static void main(String[] args) throws IOException {

		// INITIALIZATION
		int num, pos, size, choice;
		Utility u = new Utility();
		GenericLinkedList<Integer> my_list = new GenericLinkedList<Integer>();
		String str, filepath;
		System.out.print("Enter file path: ");
		filepath = u.inputString();
		my_list.ReadFile(filepath);
		while (true) {
			System.out.println("");
			System.out.println("*************** MENU ***************");
			System.out.println("1. Add to a link list");
			System.out.println("2. Remove from a link list");
			System.out.println("3. Search in a link list");
			System.out.println("4. Sort the link list");
			System.out.println("5. Count the elements in link list");
			System.out.println("6. Add at a position in a linked list");
			System.out.println("7. Quit the program");
			System.out.print("Enter your choice: ");
			choice = u.inputInteger();
			System.out.println("");
			switch (choice) {

			case 1:
				System.out.print("Enter value to add in list: ");
				num = u.inputInteger();
				my_list.AddAtEnd(num);
				my_list.WriteFile(filepath, my_list);
				break;

			case 2:
				System.out.print("Enter value to remove from list: ");
				num = u.inputInteger();
				my_list.RemoveElement(num);
				my_list.WriteFile(filepath, my_list);
				break;

			case 3:
				System.out.print("Enter value to search in list: ");
				num = u.inputInteger();
				str = my_list.ListSearch(num);
				System.out.println(str);
				break;

			case 4:
				my_list.SortList(my_list);
				my_list.WriteFile(filepath, my_list);
				break;

			case 5:
				size = my_list.size();
				System.out.println("Size of link list: " + size);
				break;

			case 6:
				System.out.print("Enter value to add in list: ");
				num = u.inputInteger();
				System.out.print("Enter position to insert: ");
				pos = u.inputInteger();
				my_list.AddAtPos(num, pos);
				my_list.WriteFile(filepath, my_list);
				break;

			case 7:
				System.out.println("Program Terminated");
				return;

			default:
				System.out.println("Invalid Argument. Please try again");
				break;
			}
		}
	}
}
