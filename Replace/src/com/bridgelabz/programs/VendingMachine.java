/*
 Find the Fewest Notes to be returned for Vending Machine
a. Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be
   returned by Vending Machine. Write a Program to calculate the minimum number
   of Notes as well as the Notes to be returned by the Vending Machine as a
   Change
b. I/P -> read the Change in Rs to be returned by the Vending Machine
c. Logic -> Use Recursion and check for largest value of the Note to return change
   to get to minimum number of Notes.
d. O/P -> Two Outputs - one the number of minimum Note needed to give the
   change and second list of Rs Notes that would given in the Change 
 */
package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class VendingMachine {
	static int FinalCnt = 0;
	static int[] arr = new int[] { 1000, 500, 100, 50, 10, 5, 2, 1 };
	static int[] cnt = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };

	public static int[] CalculateNotes(int num) {
		if (num == 0)
			return cnt;
		for (int i = 0; i < arr.length; i++) {
			cnt[i] = num / arr[i];
			num = num % arr[i];
			FinalCnt = FinalCnt + cnt[i];
			if (num > arr[i])
				--i;
		}
		return CalculateNotes(num);
	}

	public static void main(String[] args) {
		int num;
		int[] my_cnt;
		Utility u = new Utility();
		System.out.print("Enter Number: ");
		num = u.inputInteger();
		my_cnt = CalculateNotes(num);
		System.out.println("Minimum notes required: " + FinalCnt);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " : " + my_cnt[i]);
		}

	}
}
