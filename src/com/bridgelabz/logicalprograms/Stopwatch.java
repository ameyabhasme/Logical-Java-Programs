package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class Stopwatch {

	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to StopWatch Simulation Program ");
		timerInMilliSeconds();

	}

	public static void timerInMilliSeconds() {

		long startTime = 0;
		long endTime = 0;

		System.out.println("Press 's' to start the time : ");
		char startInput = SC.next().charAt(0);

		if (startInput == 's' || startInput == 'S') {

			startTime = System.nanoTime();

			System.out.println("Press 's' to stop the time : ");
			char endInput = SC.next().charAt(0);

			if (endInput == 's' || endInput == 'S') {
				endTime = System.nanoTime();

			}
		} else {
			System.out.println("Invalid input! Enter 's'.");
		}

		long timeElapsed = endTime - startTime;

		System.out.println("Time elapsed is : " + timeElapsed + " milliseconds");
	}

}
