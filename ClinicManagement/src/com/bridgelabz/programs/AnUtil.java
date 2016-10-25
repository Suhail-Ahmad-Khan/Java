package com.bridgelabz.programs;

import java.util.Arrays;

public class AnUtil {

	public String removespace(String name) {	
		return name.replaceAll("\\s", "");
	}

	public String arrange(String Arr) {
		char[] A1 = Arr.toCharArray();
		Arrays.sort(A1);
		String T = new String(A1);
		return T;
	}

	public boolean isAnagram(String s1, String s2) {
		if (s1.equals(s2))
			return true;
		else
			return false;
	}

}
