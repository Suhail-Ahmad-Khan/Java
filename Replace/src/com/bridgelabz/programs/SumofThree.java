/*
s Sum of three Integer adds to ZERO
a. Desc -> A program with cubic running time. Read in N integers and counts the
   number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to
   print the distinct triplets.
*/

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class SumofThree {

	public static void main(String[] args) {

		// INITIALIZATION
		int Count = 0, MinValue, MaxValue;
		Utility u = new Utility();
		System.out.print("Enter the min range value: ");
		MinValue = u.inputInteger();
		System.out.print("Enter the max range value: ");
		MaxValue = u.inputInteger();

		int[] Array = new int[Math.abs(MaxValue) + Math.abs(MinValue)];

		for (int i = 0; i < Array.length; i++) {
			Array[i] = MinValue + (int) (Math.random() * ((MaxValue - MinValue) + 1));
			System.out.print(Array[i] + "\t");
		}
		System.out.println("");

		// COMPUTATION
		for (int i = 0; i < Array.length - 2; i++) {
			for (int j = i + 1; j < Array.length - 1; j++) {
				for (int k = j + 1; k < Array.length; k++) {
					if (Array[i] + Array[j] + Array[k] == 0) {
						Count++;
						System.out.println("Triplet is: " + "\t" + Array[i] + "\t" + Array[j] + "\t" + Array[k]);
					}
				}
			}
		}
		System.out.println("Total no. of triplets is: " + Count);
	}
}
