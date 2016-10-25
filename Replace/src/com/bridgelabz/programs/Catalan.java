/*
 CATALAN NUMBER
 */
package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class Catalan {

	public static void main(String[] args) {

		Utility u = new Utility();
		int catalan, a = 1, b = 1, c = 1, n;
		System.out.print("Enter the number of nodes: ");
		n = u.inputInteger();

		for (int i = 1; i <= (2 * n); i++)
			a = a * i;
		for (int i = 1; i <= (n + 1); i++)
			b = b * i;
		for (int i = 1; i <= n; i++)
			c = c * i;

		catalan = a / (b * c);
		System.out.print(catalan);

	}

}
