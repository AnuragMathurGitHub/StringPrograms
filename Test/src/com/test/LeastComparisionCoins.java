package com.test;

import java.util.Scanner;

public class LeastComparisionCoins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfCoins = 0;
		String coins;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of coins to be checked");

		LabelA: for (int i = 0; i < 10;) {
			coins = scan.next().trim();
			if (coins.isEmpty() || coins == null)
				System.out.println("Enter a valid number");

			if (coins.isEmpty() || coins == null)
				System.out.println("Enter a valid number");
			try {
				numberOfCoins = Integer.parseInt(coins.trim());
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("Enter a valid number");
				continue LabelA;
			}
			
		}
		scan.close();
		if (isDivisibleBy3(numberOfCoins)) {

		} else {

		}
		for (int i = 0; i < 10; i++)
			;

	}

	/*
	 * methods tells weather a number is divisible by 3 or not returns true if
	 * divisible else returns false
	 * 
	 * @param int numberOfCoins
	 */
	public static boolean isDivisibleBy3(int numberOfCoins) {
		if (numberOfCoins % 3 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isEvenNumber(int number) {
		if (number % 2 == 0)
			return true;
		else
			return false;
	}

}
