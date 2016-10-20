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

	static int cnt = 0;

	// BINARY SEARCH STRING
	public static int BinarySearch(int num, int min, int max) {
		int mid = (max + min) / 2;
		if (min > max)
			return cnt;
		if (mid == num) {
			cnt++;
			return cnt;
		} else if (mid < num) {
			cnt++;
			return BinarySearch(num, min, mid - 1);
		} else {
			cnt++;
			return BinarySearch(num, mid + 1, max);
		}
	}

	public static void main(String[] args) {

		// INITIALIZATION
		int cnt, min = 0, max, num;

		// INPUT DATA IN LIST
		num = Integer.parseInt(args[0]);
		max = Integer.parseInt(args[0]) - 1;

		// COMPUTATION
		cnt = BinarySearch(num, min, max);
		System.out.println("Your input was: " + args[0]);
		System.out.println("Total no of trials to search: " + cnt);
	}
}