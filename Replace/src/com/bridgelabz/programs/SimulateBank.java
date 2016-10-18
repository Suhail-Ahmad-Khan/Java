/*
 Simulate Banking Cash Counter
a. Desc -> Create a Program which creates Banking Cash Counter where people
   come in to deposit Cash and withdraw Cash. Have an input panel to add people
   to Queue to either deposit or withdraw money and dequeue the people. Maintain
   the Cash Balance.
b. I/P -> Panel to add People to Queue to Deposit or Withdraw Money and dequeue
c. Logic -> Write a Queue Class to enqueue and dequeue people to either deposit
   or withdraw money and maintain the cash balance
d. O/P -> True or False to Show Arithmetic Expression is balanced or not.
 */

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;
import com.bridgelabz.util.Queue;

public class SimulateBank {

	public static void main(String[] args) {

		// INITIALIZATION
		int size, choice, acc;
		String name;
		double Amount;
		Utility u = new Utility();
		Queue q = new Queue();
		System.out.print("Enter Initial Amount: ");
		Amount = u.inputDouble();

		while (true) {
			System.out.println("");
			System.out.println("***** WELCOME TO ABC BANK *****");
			System.out.println("What action do you wish to perform?");
			System.out.println("1. Open a new bank account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Display Account Information");
			System.out.println("5. Close Account");
			System.out.println("6. Quit the program");
			System.out.print("Enter your choice: ");
			choice = u.inputInteger();
			System.out.println("");
			switch (choice) {

			case 1:
				Amount = q.CreateNewAccount(Amount);
				size = q.size;
				System.out.println("Cash available with bank: " + Amount);
				System.out.println("Size of Queue: " + size);
				break;

			case 2:
				System.out.print("Enter Name: ");
				name = u.inputString();
				System.out.print("Enter Account No: ");
				acc = u.inputInteger();
				Amount = q.DepositCash(name, acc, Amount);
				size = q.size;
				System.out.println("Cash available with bank: " + Amount);
				System.out.println("Size of Queue: " + size);
				break;

			case 3:
				System.out.print("Enter Name: ");
				name = u.inputString();
				System.out.print("Enter Account No: ");
				acc = u.inputInteger();
				Amount = q.WithdrawCash(name, acc, Amount);
				size = q.size;
				System.out.println("Cash available with bank: " + Amount);
				System.out.println("Size of Queue: " + size);
				break;

			case 4:
				System.out.print("Enter your name: ");
				name = u.inputString();
				q.DisplayDetails(name);
				break;

			case 5:
				System.out.print("Enter Name: ");
				name = u.inputString();
				System.out.print("Enter Account No: ");
				acc = u.inputInteger();
				Amount = q.CloseAccount(name, acc, Amount);
				size = q.size;
				System.out.println("Cash available with bank: " + Amount);
				System.out.println("Size of Queue: " + size);
				break;

			case 6:
				System.out.println("Program Terminated");
				return;

			default:
				System.out.println("Invalid Argument. Please try again");
				break;
			}
		}
	}

}
