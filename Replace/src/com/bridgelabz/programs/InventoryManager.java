/*
 Inventory Management Program
a. Desc -> Extend the above program to Create InventoryManager to manage the
   Inventory. The Inventory Manager will use InventoryFactory to create Inventory
   Object from JSON. The InventoryManager will call each Inventory Object in its list
   to calculate the Inventory Price and then call the Inventory Object to return the
   JSON String. The main program will be with InventoryManager
b. I/P -> read in JSON File
c. Logic -> Get JSON Object in Java or NSDictionary in iOS. Create Inventory
   Object from JSON. Calculate the value for every Inventory.
d. O/P -> Create the JSON from Inventory Object and output the JSON String. 
 */

package com.bridgelabz.programs;

import java.io.IOException;

import com.bridgelabz.util.JSONUtility;
import com.bridgelabz.util.Utility;

public class InventoryManager {

	public static void main(String[] args) throws IOException {

		// INITIALIZATION
		Utility u = new Utility();
		JSONUtility ju = new JSONUtility();
		int choice;
		while (true) {
			System.out.println("**********MENU**********");
			System.out.println("1. Create a JSON File");
			System.out.println("2. Read a JSON File");
			System.out.println("3. Quit");
			System.out.print("Enter your choice: ");
			choice = u.inputInteger();
			switch (choice) {
			case 1:
				ju.CreateJSONFile();
				break;

			case 2:
				ju.ReadJSONFile();
				break;

			case 3:
				return;

			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}
}