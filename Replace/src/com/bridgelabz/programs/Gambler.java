/*
Gambler

a. Desc -> Simulates a gambler who start with $stake and place fair $1 bets until
he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of
times he/she wins and the number of bets he/she makes. Run the experiment N
times, averages the results, and prints them out.
b. I/P -> $Stake, $Goal and Number of times
c. Logic -> Play till the gambler is broke or has won
d. O/P -> Print Number of Wins and Percentage of Win and Loss.
*/

package com.bridgelabz.util;

import com.bridgelabz.util.Utility;

public class Gambler {

	public static void main(String[] args) {

		// INITIALIZATION
		int stake, bet, broke, goal, trial;
		Utility u = new Utility();

		// INPUT DATA
		System.out.print("enter deposit: ");
		stake = u.inputInteger();

		System.out.print("enter bet: ");
		bet = u.inputInteger();

		System.out.print("enter broke limit: ");
		broke = u.inputInteger();

		System.out.print("enter goal limit: ");
		goal = u.inputInteger();

		System.out.print("enter number of trials: ");
		trial = u.inputInteger();

		// COMPUTATIONAL LOGIC
		int win = 0, loss = 0;

		for (int i = 1; i <= trial; i++) {
			int cash = stake;
			while (cash >= 0 || cash <= goal) {
				if (Math.random() < 0.5)
					cash = cash + bet;
				else
					cash = cash - bet;

				if (cash == goal) {
					win++;
					break;
				} else if (cash == broke) {
					loss++;
					break;
				} else
					continue;
			}
		}
		System.out.println("Total no. of wins: " + win);
		System.out.println("Percentage of Wins: " + 100.0 * win / trial);
		System.out.println("Percentage of Loss: " + 100.0 * loss / trial);

	}

}
