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
		int cnt = 0, min, max;
		Utility u = new Utility();
		System.out.print("Enter the min range value: ");
		min = u.inputInteger();
		System.out.print("Enter the max range value: ");
		max = u.inputInteger();

		int[] arr = new int[Math.abs(max) + Math.abs(min)];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = min + (int) (Math.random() * ((max - min) + 1));
			System.out.print(arr[i] + "\t");
		}
		System.out.println("");

		// COMPUTATION
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						cnt++;
						System.out.println("Triplet is: " + "\t" + arr[i] + "\t" + arr[j] + "\t" + arr[k]);
					}
				}
			}
		}
		System.out.println("Total no. of triplets is: " + cnt);
	}
}
