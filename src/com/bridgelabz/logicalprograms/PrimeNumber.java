package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		int counter = 0;
		System.out.println("Enter a number to check if it's a Prime number:");
		int num = SC.nextInt();
		if (num == 0 || num == 1) {
			System.out.println("The number you entered is not a Prime number");
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					counter = 1;
					System.out.println("The number you entered is not a Prime number");
					break;
				}
			}
			if (counter == 0) {
				System.out.println("The number you entered is a Prime number");
			}
		}
	}
}
