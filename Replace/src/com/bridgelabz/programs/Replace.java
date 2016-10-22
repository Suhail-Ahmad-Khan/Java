/*
 User Input and Replace String Template “Hello <<UserName>>, How are you?”
a. I/P​ -> Take User Name as Input. ​ Ensure UserName has min 3 char
b. Logic​ -> Replace <<UserName>> with the proper name
c. O/P​ -> Print the String with User Name
 */

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class Replace {

	public static void main(String[] args) {
		// INITIALIZATION
		String Input, Replace, NewName, Output;
		Utility u = new Utility();

		// INPUT DATA
		System.out.print("Enter String: ");
		Input = u.inputString();

		System.out.print("Enter name you want to replace: ");
		Replace = u.inputString();

		System.out.print("Enter name you want to replace with: ");
		NewName = u.inputString();

		// COMPUTATION
		Output = Input.replace(Replace, NewName);

		// OUTPUT
		System.out.println("New String: " + Output);
	}
}
