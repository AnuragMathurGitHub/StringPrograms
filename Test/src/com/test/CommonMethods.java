/**
 * 
 */
package com.test;

/**
 * @author anurag
 *
 */
public class CommonMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
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
