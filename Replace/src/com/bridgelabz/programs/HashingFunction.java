/*
  Hashing Function to search a Number in a slot
a. Desc -> Create a Slot of 10 to store Chain of Numbers that belong to each Slot to
   efficiently search a number from a given set of number
b. I/P -> read a set of numbers from a file and take user input to search a number
c. Logic -> Firstly store the numbers in the Slot. Since there are 10 Numbers divide
   each number by 11 and the reminder put in the appropriate slot. Create a Chain
   for each Slot to avoid Collision. If a number searched is found then pop it or else
   push it. Use Map of Slot Numbers and Ordered LinkedList to solve the problem.
   In the Figure Below, you can see number 77/11 reminder is 0 hence sits in the 0
   slot while 26/11 remainder is 4 hence sits in slot 4
d. O/P -> Save the numbers in a file
 */

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class HashingFunction {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {

		// INITIALIZATION
		Utility u = new Utility();
		int Slots;
		String FilePath = "";
		ArrayList<String> MyList = new ArrayList<String>();

		System.out.print("Enter file path to read from: ");
		FilePath = u.inputString();
		MyList = u.ReadFile(FilePath);

		System.out.println(MyList);

		System.out.print("Enter no. of slots: ");
		Slots = u.inputInteger();
		HashMap<Integer, LinkedList<Integer>> Map1 = new HashMap<Integer, LinkedList<Integer>>();
		HashMap<Integer, LinkedList<Integer>> Map2 = new HashMap<Integer, LinkedList<Integer>>();
		LinkedList<Integer>[] List = new LinkedList[Slots];

		// COMPUTATION
		int Value, SlotNumber;
		for (int i = 0; i < MyList.size(); i++) {
			Value = Integer.parseInt(MyList.get(i));
			SlotNumber = Value % 11;

			if (List[SlotNumber] == null) {
				List[SlotNumber] = new LinkedList<Integer>();
				Map1.put(SlotNumber, List[SlotNumber]);
			}
			List[SlotNumber].add(Value);
		}
		System.out.println("Hashmap1: " + Map1);

		for (int j = 0; j < Slots; j++) {
			LinkedList<Integer> List1 = List[j];
			for (int i = 0; i < List1.size() - 1; i++) {
				for (int k = i + 1; k < List1.size(); k++) {
					if (List1.get(i) == List1.get(k)) {
						List1.remove(k);
						--k;
					} else
						continue;
				}
			}
			Map2.put(j, List1);
		}

		// WRITING INTO A FILE
		System.out.print("Enter filepath to write into: ");
		FilePath = u.inputString();
		FileWriter writer = new FileWriter(FilePath);
		for (int i = 0; i < Map2.size(); i++) {
			writer.write(Map2.get(i) + " ");
			writer.flush();
		}
		writer.close();
		System.out.println("Hashmap2: " + Map2);
	}
}