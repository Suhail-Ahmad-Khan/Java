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

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class Gambler {

	public static void main(String[] args) {

		// INITIALIZATION
		int Stake, Bet, Broke, Goal, Trial;
		Utility u = new Utility();

		// INPUT DATA
		System.out.print("enter deposit: ");
		Stake = u.inputInteger();

		System.out.print("enter bet: ");
		Bet = u.inputInteger();

		System.out.print("enter broke limit: ");
		Broke = u.inputInteger();

		System.out.print("enter goal limit: ");
		Goal = u.inputInteger();

		System.out.print("enter number of trials: ");
		Trial = u.inputInteger();

		// COMPUTATIONAL LOGIC
		int Win = 0, Loss = 0;

		for (int i = 1; i <= Trial; i++) {
			int Cash = Stake;
			while (Cash >= 0 || Cash <= Goal) {
				if (Math.random() < 0.5)
					Cash = Cash + Bet;
				else
					Cash = Cash - Bet;

				if (Cash == Goal) {
					Win++;
					break;
				} else if (Cash == Broke) {
					Loss++;
					break;
				} else
					continue;
			}
		}
		System.out.println("Total no. of wins: " + Win);
		System.out.println("Percentage of Wins: " + 100.0 * Win / Trial);
		System.out.println("Percentage of Loss: " + 100.0 * Loss / Trial);
	}
}
