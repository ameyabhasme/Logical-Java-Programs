package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("enter a number to check if it's a perfect number:");
		int num = SC.nextInt();
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			System.out.println("Entered number is a perfect number: " + sum);
		}else {
			System.out.println("Entered number is not a perfect number.");
		}
		
	}
}
