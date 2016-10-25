package com.bridgelabz.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
			}
			FoodData.put(FoodName, FoodDetails);
			ProductDetails.add(FoodData);
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

	// READING FROM A FILE
	public void ReadJSONFile() {

		System.out.print("Enter file path: ");
		filepath = u.inputString();

		JSONParser parser = new JSONParser();

		try {
			Object object = parser.parse(new FileReader(filepath));
			JSONObject Inventory = (JSONObject) object;
			JSONArray InvName = (JSONArray) Inventory.get("manage");
			String[] FoodName = new String[] { "rice", "pulses", "wheat" };

			for (int y = 0; y < InvName.size(); y++) {
				JSONObject FoodGrain = (JSONObject) InvName.get(y);
				JSONArray Food = (JSONArray) FoodGrain.get(FoodName[y]);
				System.out.println(FoodName[y]);
				for (int i = 0; i < Food.size(); i++) {
					JSONObject ProductDetails = (JSONObject) Food.get(i);
					String name = (String) ProductDetails.get("Name:");
					System.out.format("%10s", name + "\t");
					Double Weight = (Double) ProductDetails.get("Weight:");
					System.out.printf(Weight + "\t");
					Double PricePerKg = (Double) ProductDetails.get("Price per Kg:");
					System.out.printf(PricePerKg + "\t");
					System.out.println("");
				}
				System.out.println("");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
