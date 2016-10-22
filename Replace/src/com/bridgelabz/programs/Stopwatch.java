/*
Simulate Stopwatch Program
a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
   the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.
*/

package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class Stopwatch {

	public static void main(String[] args) {

		// INITIALIZATION
		Utility u = new Utility();
		int Input, Sum = 0;
		double Start, Stop, Elapsed;
		System.out.print("Enter value of n: ");
		Input = u.inputInteger();

		// COMPUTATION
		Start = u.StartTime();
		for (int i = 1; i <= Input; i++) {
			Sum = Sum + i;
			System.out.println("Sum: " + Sum + " ");
		}
		Stop = u.StopTime();
		Elapsed = (Stop - Start) / 1000.0;
		System.out.println("");
		System.out.print("Total time elapsed during computation: " + Elapsed);
	}
}