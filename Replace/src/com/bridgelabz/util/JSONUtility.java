package com.bridgelabz.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONUtility {

	// INITIALIZE PARAMETERS
	Utility u = new Utility();
	String InvName, filepath, ProductName, FoodName;
	double Weight, Price;
	int n, m;
	JSONObject Inventory = new JSONObject();
	JSONObject ProductData = new JSONObject();
	JSONArray ProductDetails = new JSONArray();

	// CREATE A JSON FILE
	@SuppressWarnings("unchecked")
	public void CreateJSONFile() throws IOException {

		System.out.print("Enter file path: ");
		filepath = u.inputString();

		System.out.print("Enter name of Inventory: ");
		InvName = u.inputString();

		System.out.print("Enter types of Foodgrain: ");
		m = u.inputInteger();

		for (int j = 0; j < m; j++) {
			JSONObject FoodData = new JSONObject();
			JSONArray FoodDetails = new JSONArray();
			System.out.print("Enter name of Foodgrain: ");
			FoodName = u.inputString();

			System.out.print("Enter types of " + FoodName + ": ");
			n = u.inputInteger();

			for (int i = 0; i < n; i++) {
				JSONObject Food = new JSONObject();
				System.out.print("Enter Product Name: ");
				ProductName = u.inputString();
				Food.put("Name:", ProductName);
				System.out.print("Enter Product Weight: ");
				Weight = u.inputDouble();
				Food.put("Weight:", Weight);
				System.out.print("Enter Price per Kg: ");
				Price = u.inputDouble();
				Food.put("Price per Kg:", Price);

				FoodDetails.add(Food);
				FoodData.put(FoodName, FoodDetails);
				ProductDetails.add(FoodData);
			}
			// ProductData.put(FoodName, FoodData);
		}

		
		Inventory.put(InvName, ProductDetails);
		WriteInJSONFile();
	}

	// WRITING IN A FILE
	public void WriteInJSONFile() {
		try (FileWriter file = new FileWriter(filepath)) {
			file.write(Inventory.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + Inventory);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
 * // READING FROM A FILE
 * 
 * @SuppressWarnings("unchecked") public void ReadFromJSONFile() { JSONParser
 * parser = new JSONParser();
 * 
 * System.out.print("Enter file path: "); filepath = u.inputString();
 * 
 * try { Object obj = parser.parse(new FileReader(filepath)); JSONObject
 * Inventory = (JSONObject) obj;
 * 
 * JSONArray InvName = (JSONArray) Inventory.get("manager");
 * 
 * //JSONObject ProductName = (JSONObject) InvName;
 * 
 * for (int i = 0; i < ProductName.size(); i++) { JSONArray FoodName =
 * (JSONArray) ProductName.get(""); JSONObject ProductDetails = (JSONObject)
 * FoodName.get(i); String Name = (String) ProductDetails.get("Name: "); Double
 * Weight = (Double) ProductDetails.get("Weight: "); Double PricePerKg =
 * (Double) ProductDetails.get("Price Per Kg: "); System.out.println(Name + "\t"
 * + Weight + "\t" + PricePerKg); } } catch (Exception e) { e.printStackTrace();
 * } } }
 */