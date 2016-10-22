/*
Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is positive integer .
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
c. O/P -> Percentage of Head vs Tails 
*/

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class Flipcoin {

	public static void main(String[] args) {

		// INITIALIZATION
		int Flips, HeadCount = 0, TailCount = 0;
		double heads, tails;
		Utility u = new Utility();

		// INPUT DATA
		System.out.print("enter no. of times you want to flip the coin: ");
		Flips = u.inputInteger();

		// COMPUTATION
		for (int j = 0; j < Flips; j++) {
			double random = Math.random();
			if (random < 0.5)
				TailCount++;
			else
				HeadCount++;
		}

		heads = HeadCount / Flips * 100.0;
		tails = TailCount / Flips * 100.0;
		System.out.println("Percentage of heads: " + heads + "%");
		System.out.println("Percentage of tails: " + tails + "%");
	}
}
