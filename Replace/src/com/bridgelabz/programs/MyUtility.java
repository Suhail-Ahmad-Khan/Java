/*
 Utility Class
a. Desc -> Create Utility Class having following methods
   	1. binarySearch method for integer
   	2. binarySearch method for String
   	3. insertionSort method for integer
   	4. insertionSort method for String
   	5. bubbleSort method for integer
   	6. bubbleSort method for String
b. I/P -> Write main function to call the utility function
c. Logic -> Check using Stopwatch the Elapsed Time for every method call
d. O/P -> Output the Search and Sorted List. More importantly print elapsed time
   performance in descending order 
 */
package com.bridgelabz.programs;

import java.util.ArrayList;
import java.util.Collections;

import com.bridgelabz.util.Utility;

public class MyUtility {

	public static void main(String[] args) {
		int choice, n, min = 0, max, num;
		String str, str1;
		double start, stop, elapsed;
		Utility u = new Utility();
		while (true) {
			System.out.println("");
			System.out.println("*************** MENU ***************");
			System.out.println("1. Linear Search method for integer");
			System.out.println("2. Linear Search method for String");
			System.out.println("3. Insertion Sort method for integer");
			System.out.println("4. Insertion Sort method for String");
			System.out.println("5. Bubble Sort method for integer");
			System.out.println("6. Bubble Sort method for String");
			System.out.println("7. Binary Search method for integer");
			System.out.println("8. Binary Search method for String");
			System.out.println("9. Quit the program");
			System.out.print("Enter your choice: ");
			choice = u.inputInteger();
			System.out.println("");
			switch (choice) {

			case 1:
				start = u.start_time();
				str = u.LSRI();
				stop = u.stop_time();
				elapsed = (stop - start) / 1000.0;
				System.out.println(str);
				System.out.print("Total time elapsed: " + elapsed);
				break;

			case 2:
				start = u.start_time();
				str = u.LSRS();
				stop = u.stop_time();
				elapsed = (stop - start) / 1000.0;
				System.out.println(str);
				System.out.print("Total time elapsed: " + elapsed);
				break;

			case 3:
				start = u.start_time();
				u.ISI();
				stop = u.stop_time();
				elapsed = (stop - start) / 1000.0;
				System.out.println("");
				System.out.print("Total time elapsed: " + elapsed);
				break;

			case 4:
				start = u.start_time();
				u.ISS();
				stop = u.stop_time();
				elapsed = (stop - start) / 1000.0;
				System.out.println("");
				System.out.print("Total time elapsed: " + elapsed);
				break;

			case 5:
				start = u.start_time();
				u.BSI();
				stop = u.stop_time();
				elapsed = (stop - start) / 1000.0;
				System.out.println("");
				System.out.println("Total time elapsed: " + elapsed);
				break;

			case 6:
				start = u.start_time();
				u.BSS();
				stop = u.stop_time();
				elapsed = (stop - start) / 1000.0;
				System.out.println("");
				System.out.println("Total time elapsed: " + elapsed);
				break;

			case 7:
				ArrayList<Integer> my_intlist = new ArrayList<Integer>();
				start = u.start_time();
				System.out.print("Enter size of list: ");
				n = u.inputInteger();

				// INPUT DATA IN LIST
				System.out.println("Enter " + n + " numbers");
				for (int i = 1; i <= n; i++) {
					System.out.print("Enter number " + i + ": ");
					my_intlist.add(u.inputInteger());
				}
				System.out.print("Enter integer to search: ");
				num = u.inputInteger();

				// DISPLAY THE LIST
				System.out.println("The list is: " + my_intlist);

				// COMPUTATION
				max = my_intlist.size();
				Collections.sort(my_intlist);
				str1 = u.BINSI(my_intlist, num, min, max);
				stop = u.stop_time();
				System.out.println(str1);
				elapsed = (stop - start) / 1000.0;
				System.out.println("Total time elapsed: " + elapsed);
				break;

			case 8:
				ArrayList<String> my_list;
				String filepath;
				start = u.start_time();
				System.out.print("Enter file path: ");
				filepath = u.inputString();
				System.out.print("Enter word to search: ");
				str = u.inputString();

				// COMPUTATION
				my_list = u.read_file(filepath);
				max = my_list.size();
				Collections.sort(my_list);
				str1 = u.BINSS(my_list, str, min, max);
				stop = u.stop_time();
				System.out.println(str1);
				elapsed = (stop - start) / 1000.0;
				System.out.println("Total time elapsed: " + elapsed);
				break;

			case 9:
				System.out.println("Program Terminated");
				return;

			default:
				System.out.println("Invalid Argument. Please try again");
				break;
			}
		}
	}
}
