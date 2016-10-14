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
	
	public ArrayList<String> read_file(String filepath)
	{
		try {
			s = new Scanner(new File(filepath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()){
		    list.add(s.next());
		}
		s.close();
		return list;
	}
}
