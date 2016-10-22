/*
Factors
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency​ .
d. O/P -> Print the prime factors of number N 
*/

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class Primefactors {

	public static void main(String[] args) {

		// INITIALIZATION
		int Input;
		Utility u = new Utility();

		// INPUT DATA
		System.out.print("Enter a Number : ");
		Input = u.inputInteger();

		// COMPUTATION
		System.out.print("The Prime Factors of " + Input + " are : ");

		int Number = 2;
		while (Input > 1) {
			if (Input % Number == 0) {
				System.out.print(Number + " ");
				Input = Input / Number;
			} else
				Number++;
		}
		System.out.println(" ");
	}
}
