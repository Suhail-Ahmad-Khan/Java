/*
 Coupon Numbers
a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
need to generate distinct coupon number? This program simulates this random
process.
b. I/P -> N Distinct Coupon Number
c. Logic -> repeatedly choose a random number and check whether it's a new one.
d. O/P -> total random number needed to have all distinct numbers.
e. Functions => Write Class Static Functions to generate random number and to
process distinct coupons.
 */

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

class Generate {

	public static void Compute(int n) {
		int Coupon[] = new int[n];
		int Count = 0;

		// LOGICAL COMPUTATION
		for (int i = 0; i < n; i++) {
			int Number = (int) (Math.random() * n + 1);
			System.out.print(Number + "\t");
			Count++;
			Coupon[i] = Number;
			for (int j = 0; j < i; j++) {
				if (Coupon[j] == Number) {
					i--;
					break;
				}
			}
		}
		System.out.println("");
		for (int i = 0; i < n; i++)
			System.out.print(Coupon[i] + "\t");
		System.out.println("");
		System.out.println("total random number needed to have all distinct numbers: " + Count);
	}
}

public class Coupon {

	public static void main(String[] args) {

		// INITIALIZATION
		int Size;
		Utility u = new Utility();

		// INPUT VALUES
		System.out.print("enter the size of array: ");
		Size = u.inputInteger();

		// GENERATING OUTPUT THROUGH STATIC FUNCTION
		Generate.Compute(Size);
	}
}