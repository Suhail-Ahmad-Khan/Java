/*
Stock Report
a. Desc -> Write a program to read in Stock Names, Number of Share, Share Price.
   Print a Stock Report with total Value of each Stock and the total Value of Stock.
b. I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of
   Share, and Share Price
c. Logic -> Calculate the Value of each stock and the total Value
d. O/P -> Print the Stock Report.
e. Hint -> Create Stock and Stock Portfolio Class holding the list of Stocks read
   from the input file. Have functions in the Class to calculate the Value of each
   stock and the Value of total stocks  
*/

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

class Stock {
	Utility u = new Utility();
	static String StockName;

	public void input() {
		System.out.print("Enter stock name: ");
		StockName = u.inputString();
	}
}

class StockPortfolio extends Stock {

	int NoShares, SharePrice;

	public void details() {
		System.out.print("Enter no. of shares: ");
		NoShares = u.inputInteger();
		System.out.print("Enter share price: ");
		SharePrice = u.inputInteger();
	}

	static int ValueStock, TotalStock = 0;

	public void calculate() {
		ValueStock = NoShares * SharePrice;
		TotalStock = TotalStock + ValueStock;
	}

	String[] Name = new String[10];
	int[] Value = new int[10];
	static int Count = 1;

	public void save(int n) {
		while (Count <= n) {
			Name[Count - 1] = StockName;
			Value[Count - 1] = ValueStock;
			Count++;
			break;
		}
	}

	public void display(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("Stock Name: " + Name[i] + "\t");
			System.out.print("Total Value of " + Name[i] + " stock: " + Value[i]);
			System.out.println("");
		}
		System.out.print("Total Value of all stocks: " + TotalStock);
	}
}

public class StockReport {

	public static void main(String[] args) {

		// INITIALIZATION
		int Number;
		Utility u = new Utility();
		StockPortfolio SP = new StockPortfolio();
		System.out.print("Enter the no. of stocks: ");
		Number = u.inputInteger();

		// INPUT DATA
		for (int i = 1; i <= Number; i++) {
			SP.input();
			SP.details();
			SP.calculate();
			SP.save(Number);
		}
		SP.display(Number);
	}
}