package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {

		static final Scanner SC = new Scanner(System.in);
			public static void main(String [] args) {
				int rev=0,rem=0;
				System.out.println("Enter a number that you want to reverse :");
				int num = SC.nextInt();
				while(num != 0 ) {
					rem=num%10;
					rev=rev*10+rem;
					num=num/10;
				}
				System.out.println("The reverse of the number is "+rev);
			}
}
