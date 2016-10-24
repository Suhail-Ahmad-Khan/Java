/*
 2D Array
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
   standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
   OutputStreamWriter to print the output to the screen.
 */

package com.bridgelabz.programs;

import java.io.PrintWriter;
import java.util.Scanner;
import com.bridgelabz.util.Utility;

public class Array2D {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// INITIALIZATION
		Scanner sc = new Scanner(System.in);
		Utility u = new Utility();
		int Row, Column;
		System.out.print("Enter no. of rows: ");
		Row = u.inputInteger();
		System.out.print("Enter no. of columns: ");
		Column = u.inputInteger();

		int[][] Array2D = new int[Row][Column];

		// COMPUTATION
		for (int i = 0; i < Row; i++) {
			for (int j = 0; j < Column; j++) {
				System.out.print("Enter element at " + i + " " + j + " position: ");
				Array2D[i][j] = sc.nextInt();
			}
		}

		// PRINTING THE RESULT
		PrintWriter pr = new PrintWriter(System.out);
		for (int i = 0; i < Row; i++) {
			for (int j = 0; j < Column; j++) {
				pr.print(Array2D[i][j] + ",");
			}
			pr.println();
		}
		pr.close();

	}
}
