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

class generate {
	public static void compute(int n) {
		int arr[] = new int[n];
		int cnt = 0;

		// LOGICAL COMPUTATION
		for (int i = 0; i < n; i++) {
			int x = (int) (Math.random() * n + 1);
			System.out.print(x + "\t");
			cnt++;
			arr[i] = x;
			for (int j = 0; j < i; j++) {
				if (arr[j] == x) {
					i--;
					break;
				}
			}
		}

		System.out.println("");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + "\t");
		System.out.println("");
		System.out.println("total random number needed to have all distinct numbers: " + cnt);

	}
}

public class Coupon {

	public static void main(String[] args) {

		// INITIALIZATION
		int n;
		Utility u = new Utility();

		// INPUT VALUES
		System.out.print("enter the size of array: ");
		n = u.inputInteger();

		// GENERATING OUTPUT THROUGH STATIC FUNCTION
		generate.compute(n);

	}
}
