/*
 Question to find your number
a. Desc -> takes a command-line argument N, asks you to think of a number
   between 0 and N-1, where N = 2^n, and always guesses the answer with n
   questions.
b. I/P -> the Number N and then recursively ask true/false if the number is between
   a high and low value
c. Logic -> Use Binary Search to find the number
d. O/P -> Print the intermediary number and the final answer
 */

package com.bridgelabz.programs;

public class GuessingGame {

	static int Count = 0;

	// BINARY SEARCH STRING
	public static int BinarySearch(int Number, int MinValue, int MaxValue) {
		int MidValue = (MaxValue + MinValue) / 2;
		if (MinValue > MaxValue)
			return Count;
		if (MidValue == Number) {
			Count++;
			return Count;
		} else if (MidValue < Number) {
			Count++;
			return BinarySearch(Number, MinValue, MidValue - 1);
		} else {
			Count++;
			return BinarySearch(Number, MidValue + 1, MaxValue);
		}
	}

	public static void main(String[] args) {

		// INITIALIZATION
		int Count, MinValue = 0, MaxValue, Number;

		// INPUT DATA IN LIST
		Number = Integer.parseInt(args[0]);
		MaxValue = Integer.parseInt(args[0]) - 1;

		// COMPUTATION
		Count = BinarySearch(Number, MinValue, MaxValue);
		System.out.println("Your input was: " + args[0]);
		System.out.println("Total no of trials to search: " + Count);
	}
}