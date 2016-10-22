/*
 Ordered List
a. Desc -> Read .a List of Numbers from a file and arrange it ascending Order in a
   Linked List. Take user input for a Number, if found then pop the Number out of the
   list else insert the Number in appropriate position
b. I/P -> Read from file the list of Numbers and take user input for a new Number
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
		int Number, Position, Size, Choice;
		Utility u = new Utility();
		GenericLinkedList<Integer> MyList = new GenericLinkedList<Integer>();
		String Output, FilePath;
		System.out.print("Enter file path: ");
		FilePath = u.inputString();
		MyList.ReadFile(FilePath);
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
			Choice = u.inputInteger();
			System.out.println("");
			switch (Choice) {

			case 1:
				System.out.print("Enter value to add in list: ");
				Number = u.inputInteger();
				MyList.AddAtEnd(Number);
				MyList.WriteFile(FilePath, MyList);
				break;

			case 2:
				System.out.print("Enter value to remove from list: ");
				Number = u.inputInteger();
				MyList.RemoveElement(Number);
				MyList.WriteFile(FilePath, MyList);
				break;

			case 3:
				System.out.print("Enter value to search in list: ");
				Number = u.inputInteger();
				Output = MyList.ListSearch(Number);
				System.out.println(Output);
				break;

			case 4:
				MyList.SortList(MyList);
				MyList.WriteFile(FilePath, MyList);
				break;

			case 5:
				Size = MyList.size();
				System.out.println("Size of link list: " + Size);
				break;

			case 6:
				System.out.print("Enter value to add in list: ");
				Number = u.inputInteger();
				System.out.print("Enter position to insert: ");
				Position = u.inputInteger();
				MyList.AddAtPos(Number, Position);
				MyList.WriteFile(FilePath, MyList);
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