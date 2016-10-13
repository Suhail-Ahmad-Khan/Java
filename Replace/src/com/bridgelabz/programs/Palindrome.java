/*
Palindrome-Checker
a. Desc -> A palindrome is a string that reads the same forward and backward, for
   example, radar, toot, and madam. We would like to construct an algorithm to
   input a string of characters and check whether it is a palindrome.
b. I/P -> Take a String as an Input
c. Logic -> The solution to this problem will use a deque to store the characters of
   the string. We will process the string from left to right and add each character to
   the rear of the deque.
d. O/P -> True or False to Show if the String is Palindrome or not.
*/
package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class Palindrome {

	public static void main(String[] args) {

				//INITIALIZATION
				String str;
				int i, j, len, flag=0;
				Utility u = new Utility();
				
				//INPUT THE STRING
				System.out.print("enter string: ");
				str = u.inputString();

				//CALCULATING THE LENGTH OF STRING
				len = str.length();

				//STRING CONVERTED TO ARRAY
				char [] arr_str = str.toCharArray();

				//COMPUTATION
				for(i=0, j=len-1; i<j; i++, j--)
				{
					if(arr_str[i] == arr_str[j])
						flag = 0;
					else
					{
						flag = 1;
						break;
					}
				}

				if(flag == 0)
					System.out.println("The given string is a PALINDROME");
				else
					System.out.println("The given string is NOT a PALINDROME");	

	}
}
