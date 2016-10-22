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
		int Choice, MinValue = 0, MaxValue, Number;
		String Word, Output;
		double Start, Stop, Elapsed;
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
			Choice = u.inputInteger();
			System.out.println("");
			switch (Choice) {

			case 1:
				Start = u.StartTime();
				Output = u.LinearSearchInteger();
				Stop = u.StopTime();
				Elapsed = (Stop - Start) / 1000.0;
				System.out.println(Output);
				System.out.print("Total time elapsed: " + Elapsed);
				break;

			case 2:
				Start = u.StartTime();
				Output = u.LinearSearchString();
				Stop = u.StopTime();
				Elapsed = (Stop - Start) / 1000.0;
				System.out.println(Output);
				System.out.print("Total time elapsed: " + Elapsed);
				break;

			case 3:
				Start = u.StartTime();
				u.InsertionSortInteger();
				Stop = u.StopTime();
				Elapsed = (Stop - Start) / 1000.0;
				System.out.println("");
				System.out.print("Total time elapsed: " + Elapsed);
				break;

			case 4:
				Start = u.StartTime();
				u.InsertionSortString();
				Stop = u.StopTime();
				Elapsed = (Stop - Start) / 1000.0;
				System.out.println("");
				System.out.print("Total time elapsed: " + Elapsed);
				break;

			case 5:
				Start = u.StartTime();
				u.BubbleSortInteger();
				Stop = u.StopTime();
				Elapsed = (Stop - Start) / 1000.0;
				System.out.println("");
				System.out.println("Total time elapsed: " + Elapsed);
				break;

			case 6:
				Start = u.StartTime();
				u.BubbleSortString();
				Stop = u.StopTime();
				Elapsed = (Stop - Start) / 1000.0;
				System.out.println("");
				System.out.println("Total time elapsed: " + Elapsed);
				break;

			case 7:
				ArrayList<Integer> MyList = new ArrayList<Integer>();
				Start = u.StartTime();
				System.out.print("Enter size of list: ");
				Number = u.inputInteger();

				// INPUT DATA IN LIST
				System.out.println("Enter " + Number + " numbers");
				for (int i = 1; i <= Number; i++) {
					System.out.print("Enter number " + i + ": ");
					MyList.add(u.inputInteger());
				}
				System.out.print("Enter integer to search: ");
				Number = u.inputInteger();

				// DISPLAY THE LIST
				System.out.println("The list is: " + MyList);

				// COMPUTATION
				MaxValue = MyList.size();
				Collections.sort(MyList);
				Output = u.BinarySearchInteger(MyList, Number, MinValue, MaxValue);
				Stop = u.StopTime();
				System.out.println(Output);
				Elapsed = (Stop - Start) / 1000.0;
				System.out.println("Total time elapsed: " + Elapsed);
				break;

			case 8:
				ArrayList<String> MyList1;
				String FilePath;
				Start = u.StartTime();
				System.out.print("Enter file path: ");
				FilePath = u.inputString();
				System.out.print("Enter word to search: ");
				Word = u.inputString();

				// COMPUTATION
				MyList1 = u.ReadFile(FilePath);
				MaxValue = MyList1.size();
				Collections.sort(MyList1);
				Output = u.BinarySearchString(MyList1, Word, MinValue, MaxValue);
				Stop = u.StopTime();
				System.out.println(Output);
				Elapsed = (Stop - Start) / 1000.0;
				System.out.println("Total time elapsed: " + Elapsed);
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