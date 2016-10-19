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

public class InventoryManager {

	public static void main(String[] args) throws IOException {

		JSONUtility u = new JSONUtility();
		// u.CreateJSONFile();
		u.ReadFromJSONFile();
	}
}