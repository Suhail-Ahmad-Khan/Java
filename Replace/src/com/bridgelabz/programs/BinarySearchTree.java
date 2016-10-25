/*
Number of Binary Search Tree 
 */

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;
import com.bridgelabz.util.BinarySearchUtility;

public class BinarySearchTree {

	public static void main(String[] args) {

		int choice, data;
		long result;
		int count = 0;
		boolean x;
		Utility u = new Utility();
		BinarySearchUtility b = new BinarySearchUtility();
		while (true) {
			System.out.println("*************** MENU ***************");
			System.out.println("1. Insert in a Binary Search Tree");
			System.out.println("2. Display the Binary Search Tree");
			System.out.println("3. Count the number of BST possible");
			System.out.println("4. Search in a Binary Search Tree");
			System.out.println("5. Delete from Binary Search Tree");
			System.out.println("6. Quit ");
			System.out.print("Enter your choice: ");
			choice = u.inputInteger();
			switch (choice) {

			case 1:
				System.out.print("Enter data you want to insert: ");
				data = u.inputInteger();
				b.Insert(data);
				count++;
				break;

			case 2:
				System.out.println("The Original Tree: ");
				b.Display(b.root);
				System.out.println("");
				break;

			case 3:
				System.out.println("No. of elements in BST tree: " + count);
				result = b.Count(count);
				System.out.println("The Count is: " + result);
				break;

			case 4:
				System.out.print("Enter data you want to search: ");
				data = u.inputInteger();
				x = b.Search(data);
				System.out.println("Data Found: " + x);
				break;

			case 5:
				System.out.print("Enter data you want to delete: ");
				data = u.inputInteger();
				b.Delete(data);
				count--;
				break;

			case 6:
				System.out.println("Program Terminated");
				return;

			default:
				System.out.println("Invalid number of arguments");
			}
		}
	}
}
