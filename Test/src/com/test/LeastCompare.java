package com.test;

import java.util.Scanner;

public class LeastCompare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter the number of coins to be checked ");
		String numberOfCoins = scan.next();
		if (numberOfCoins != null) {
			int coins = Integer.parseInt(numberOfCoins);

			System.out.println("Please Enter a number");
		}
		if (numberOfCoins.isEmpty()) {
			System.out.println("Please Enter a number");
		}

	}

	public int check(int numberOfCoins) {

		// Checks whether the number of coins are divisible by 3 or not
		if (numberOfCoins % 3 == 0)
			return 1;

		else
			return 0;

	}
}
