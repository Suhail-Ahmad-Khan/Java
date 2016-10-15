package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.lang.ArrayIndexOutOfBoundsException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Utility {
	BufferedReader br;
	char[] arr_str;
	boolean flag;
	Scanner s;
	double start, stop;

	// CREATING CONSTRUCTOR WITH SAME NAME AS CLASS
	public Utility() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	// INPUT STRING
	public String inputString() {
		try {
			return br.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT INTEGER
	public int inputInteger() {
		try {
			return Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// INPUT DOUBLE
	public double inputDouble() {
		try {
			return Double.parseDouble(br.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0.0;
	}

	// INPUT BOOLEAN
	public boolean inputBoolean() {
		try {
			return Boolean.parseBoolean(br.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	// REMOVING BLANK SPACES
	public String remove_spaces(String str) {
		try {
			return str.replaceAll("\\s", "");
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// CONVERTING TO UPPERCASE
	public String con_upper(String str) {
		try {
			return str.toUpperCase();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// SORTING THE ARRAY
	public char[] sort_array(char[] arr_str) {
		try {
			Arrays.sort(arr_str);
			return arr_str;
		} catch (Exception e) {
			System.out.println(e);
		}
		return arr_str;
	}

	// SET OR RESET THE FLAG
	public boolean set_flag(char[] arr_str1, char[] arr_str2) {
		try {
			flag = Arrays.equals(arr_str1, arr_str2);
			return flag;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	// READING FROM A FILE AND RETURNING AN ARRAYLIST
	public ArrayList<String> read_file(String filepath) {
		try {
			s = new Scanner(new File(filepath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()) {
			list.add(s.next());
		}
		s.close();
		return list;
	}

	// CALCULATING THE START AND STOP TIME FOR STOPWATCH TIMER
	public double start_time() {
		start = System.currentTimeMillis();
		return start;
	}

	public double stop_time() {
		stop = System.currentTimeMillis();
		return stop;
	}

	// LINEAR SEARCH INTEGER
	public String LSRI() {
		int n;
		String str1, str2;
		str1 = "INTEGER FOUND";
		str2 = "INTEGER NOT FOUND";
		System.out.print("Enter the size of array: ");
		n = inputInteger();
		int[] arr = new int[n];

		// INPUT INTEGER ARRAY DATA
		System.out.print("Enter Integer Array: ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = inputInteger();

		// COMPUTATION
		int key, flag = 0;
		System.out.print("Enter integer to search: ");
		key = inputInteger();
		for (int j = 0; j < arr.length; j++) {
			if (key == arr[j]) {
				flag = 1;
				break;
			} else
				continue;
		}

		// DISPLAY
		if (flag == 1)
			return str1;
		else
			return str2;
	}

	// LINEAR SEARCH STRING
	public String LSRS() {
		ArrayList<String> my_list;
		String str, str1, str2, filepath;
		str1 = "String is FOUND";
		str2 = "String is NOT FOUND";
		System.out.print("Enter file path: ");
		filepath = inputString();
		System.out.print("Enter word to search: ");
		str = inputString();

		// COMPUTATION
		my_list = read_file(filepath);
		if (my_list.contains(str))
			return str1;
		else
			return str2;
	}

	// INSERTION SORT INTEGER
	public void ISI() {
		int n;

		System.out.print("Enter the size of array: ");
		n = inputInteger();
		int[] arr = new int[n];

		// INPUT DATA
		System.out.print("Enter String Array: ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = inputInteger();

		// DISPLAY INPUT DATA
		System.out.print("Input Array is : ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		// COMPUTATION
		int key;
		for (int j = 1; j < arr.length; j++) {
			key = arr[j];
			int i = j - 1;
			while (i >= 0) {
				if (key > arr[i]) {
					break;
				}
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}
		// DISPLAY DATA
		System.out.println("");
		System.out.print("Output Array is: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	// INSERTION SORT STRING
	public void ISS() {
		int n;

		System.out.print("Enter the size of array: ");
		n = inputInteger();
		String[] arr = new String[n];

		// INPUT STRING DATA
		System.out.print("Enter String Array: ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = inputString();

		// DISPLAY STRING DATA
		System.out.print("Input String Array is : ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");

		// COMPUTATION
		String key;
		for (int j = 1; j < arr.length; j++) {
			key = arr[j];
			int i = j - 1;
			while (i >= 0) {
				if (key.compareTo(arr[i]) > 0) {
					break;
				}
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}
		// DISPLAY STRING DATA
		System.out.println("");
		System.out.print("Output String Array is: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
	}

	// BUBBLE SORT FOR INTEGERS
	public void BSI() {
		// INITIALIZATION
		int n;
		ArrayList<Integer> my_intlist = new ArrayList<Integer>();
		System.out.print("Enter size of list: ");
		n = inputInteger();

		// INPUT DATA IN LIST
		System.out.println("Enter " + n + " numbers");
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter number " + i + ": ");
			// u.inputInteger();
			my_intlist.add(inputInteger());
		}

		// DISPLAY THE LIST
		System.out.println("The unsorted list is: " + my_intlist);

		// COMPUTATION
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (my_intlist.get(i) > my_intlist.get(j)) {
					temp = my_intlist.get(i);
					my_intlist.set(i, my_intlist.get(j));
					my_intlist.set(j, temp);

				}
			}
		}

		// DISPLAY THE LIST
		System.out.println("The sorted list is: " + my_intlist);
	}

	// BUBBLE SORT FOR STRINGS
	public void BSS() {

		// INITIALIZATION
		int n;
		ArrayList<String> my_strlist = new ArrayList<String>();
		System.out.print("Enter size of list: ");
		n = inputInteger();

		// INPUT DATA IN LIST
		System.out.println("Enter " + n + " strings");
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter string " + i + ": ");
			// u.inputInteger();
			my_strlist.add(inputString());
		}

		// DISPLAY THE LIST
		System.out.println("The unsorted list is: " + my_strlist);

		// COMPUTATION
		String temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (my_strlist.get(i).compareTo(my_strlist.get(j)) > 0) {
					temp = my_strlist.get(i);
					my_strlist.set(i, my_strlist.get(j));
					my_strlist.set(j, temp);
				}
			}
		}

		// DISPLAY THE LIST
		System.out.println("The sorted list is: " + my_strlist);
	}

	// BINARY SEARCH INTEGER
	public String BINSI(ArrayList<Integer> my_intlist, int num, int min, int max) {
		String str1, str2;
		str1 = "INTEGER FOUND";
		str2 = "INTEGER NOT FOUND";
		int mid = (max + min) / 2;
		if (min > max)
			return str2;
		if (my_intlist.get(mid) == num) {
			return str1;
		} else if (my_intlist.get(mid) < num) {
			return BINSI(my_intlist, num, min, mid - 1);
		} else {
			return BINSI(my_intlist, num, mid + 1, max);
		}
	}

	// BINARY SEARCH STRING
	public String BINSS(ArrayList<String> my_list, String str, int min, int max) {
		String str1, str2;
		str1 = "STRING FOUND";
		str2 = "STRING NOT FOUND";
		int mid = (max + min) / 2;
		if (min > max)
			return str2;
		if (my_list.get(mid).equals(str)) {
			return str1;
		} else if (my_list.get(mid).compareTo(str) > 0) {
			return BINSS(my_list, str, min, mid - 1);
		} else {
			return BINSS(my_list, str, mid + 1, max);
		}
	}
}
