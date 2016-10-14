/*
Stock Report
a. Desc -> Write a program to read in Stock Names, Number of Share, Share Price.
   Print a Stock Report with total value of each Stock and the total value of Stock.
b. I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of
   Share, and Share Price
c. Logic -> Calculate the value of each stock and the total value
d. O/P -> Print the Stock Report.
e. Hint -> Create Stock and Stock Portfolio Class holding the list of Stocks read
   from the input file. Have functions in the Class to calculate the value of each
   stock and the value of total stocks  
*/

package com.bridgelabz.programs;

import java.util.Arrays;

import com.bridgelabz.util.Utility;

class Stock {
	Utility u = new Utility();
	static String str;

	public void input() {
		System.out.print("Enter stock name: ");
		str = u.inputString();
	}
}

class StockPortfolio extends Stock {

	int no_shares, share_price;

	public void details() {
		System.out.print("Enter no. of shares: ");
		no_shares = u.inputInteger();
		System.out.print("Enter share price: ");
		share_price = u.inputInteger();
	}

	static int val_estock, tot_stock = 0;

	public void calculate() {
		val_estock = no_shares * share_price;
		tot_stock = tot_stock + val_estock;
	}

	String[] arr = new String[10];
	int[] value = new int[10];
	static int k = 1;

	public void save(int n) {
		while (k <= n) {
			arr[k - 1] = str;
			value[k - 1] = val_estock;
			k++;
			break;
		}
	}

	public void display(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("Stock Name: " + arr[i] + "\t");
			System.out.print("Total value of " + arr[i] + " stock: " + value[i]);
			System.out.println("");
		}
		System.out.print("Total value of all stocks: " + tot_stock);
	}
}

public class StockReport {

	public static void main(String[] args) {

		// INITIALIZATION
		int n;
		Utility u = new Utility();
		StockPortfolio SP = new StockPortfolio();
		System.out.print("Enter the no. of stocks: ");
		n = u.inputInteger();

		// INPUT DATA
		for (int i = 1; i <= n; i++) {
			SP.input();
			SP.details();
			SP.calculate();
			SP.save(n);
		}
		SP.display(n);
	}
}
