package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.programs.AnUtil;

public class Anagram {

	public static void main(String[] args) {
		AnUtil u = new AnUtil();
		String s1, s2;
		boolean i;

		Scanner n = new Scanner(System.in);

		System.out.print("Enter first String:");
		s1 = n.nextLine();
		System.out.print("Enter Second String:");
		s2 = n.nextLine();
		
		s1 = u.removespace(s1);
		s2 = u.removespace(s2);
		System.out.println(s1);
		System.out.println(s2);
		
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		
		s1 = u.arrange(s1);
		s2 = u.arrange(s2);
		System.out.println(s1);
		System.out.println(s2);
		
		i = u.isAnagram(s1, s2);
		if (i == true)
			System.out.println("The entered strings are anagram. ");
		else
			System.out.println("The entered strings are not anagram.");
		n.close();
	}
}