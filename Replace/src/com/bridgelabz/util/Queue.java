package com.bridgelabz.util;

import com.bridgelabz.util.Utility;
import java.util.LinkedList;

class Employee {

	LinkedList<String> Name = new LinkedList<String>();
	LinkedList<Integer> AccountNo = new LinkedList<Integer>();
	LinkedList<Double> Cash = new LinkedList<Double>();
}

public class Queue extends Employee {

	public static int size = 0;
	static int i = 0;
	Utility u = new Utility();

	// RETURNING THE SIZE OF LINKED LIST
	public int size() {
		return size;
	}

	// DISPLAYING DETAILS OF A PARTICULAR ACCOUNT HOLDER
	public void DisplayDetails(String name) {
		for (int i = 0; i < size; i++) {
			if (name.equals(Name.get(i))) {
				System.out.print(Name.get(i) + "\t" + AccountNo.get(i) + "\t" + Cash.get(i));
				break;
			}
		}
	}

	// CREATING A NEW ACCOUNT
	public double CreateNewAccount(double Amount) {
		System.out.print("Enter Name: ");
		Name.add(u.inputString());
		System.out.print("Enter Account No: ");
		AccountNo.add(u.inputInteger());
		System.out.print("Enter Cash Amount: ");
		Cash.add(u.inputDouble());
		size++;
		Amount = Amount + ((Double) Cash.get(i));
		i++;
		return Amount;
	}

	// DEPOSITING CASH IN ACCOUNT
	public double DepositCash(String name, Integer acc, double Amount) {
		for (int i = 0; i < size; i++) {
			if (name.equals(Name.get(i))) {
				double cash;
				System.out.print("Enter Cash Amount: ");
				cash = u.inputDouble();
				System.out.println("Your Previous Balance: " + ((Double) Cash.get(i)));
				Cash.set(i, cash + ((Double) Cash.get(i)));
				System.out.println("Your New Balance: " + ((Double) Cash.get(i)));
				Amount = Amount + cash;
				break;
			}
		}
		size++;
		i++;
		return Amount;
	}

	// WITHDRAWING CASH IN ACCOUNT
	public double WithdrawCash(String name, Integer acc, double Amount) {
		for (int i = 0; i < size; i++) {
			if (name.equals(Name.get(i))) {
				double cash;
				System.out.print("Enter Cash Amount: ");
				cash = u.inputDouble();
				System.out.println("Your Previous Balance: " + ((Double) Cash.get(i)));
				Cash.set(i, ((Double) Cash.get(i)) - cash);
				System.out.println("Your New Balance: " + ((Double) Cash.get(i)));
				Amount = Amount - cash;
				break;
			}
		}
		size++;
		i++;
		return Amount;
	}

	// CLOSING AN ACCOUNT
	public double CloseAccount(String name, Integer acc, double Amount) {
		for (int i = 0; i < size; i++) {
			if (name.equals(Name.get(i))) {
				Amount = Amount - ((Double) Cash.get(i));
				Name.remove(i);
				AccountNo.remove(i);
				Cash.remove(i);
				break;
			}
		}
		size--;
		i--;
		return Amount;
	}
}
