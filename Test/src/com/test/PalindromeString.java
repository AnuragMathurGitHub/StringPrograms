/**
 * 
 */
package com.test;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author anurag To check a String is Palindrome or not
 */
public class PalindromeString {

	private static String palindromeRev;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String palindrone;
		System.out
				.println("Enter a String , we'll check whether its palindrone or not. ;)");
		for (;;) {
			palindrone = scan.next();
			if (palindrone == null || palindrone.isEmpty()) {
				System.out.println("Please enter a valid String");
			} else {
				break;
			}
		}
		if (palindromeStringBuffer(palindrone)) {
			System.out.println("String : " + palindrone + " is palindrome");
		} else {
			System.out.println("String : " + palindrone + " is not palindrome");
		}

		if (palindromeCharArray(palindrone)) {
			System.out.println("String : " + palindrone + " is palindrome");
		} else {
			System.out.println("String : " + palindrone + " is not palindrome");
		}

		scan.close();

	}

	/* Using StringBuffer */
	public static boolean palindromeStringBuffer(String palindrone) {
		StringBuffer palindroneBuffer = new StringBuffer(palindrone);
		StringBuffer palindroneRev = palindroneBuffer.reverse();
		System.out.println("UsingStringBuffer");
		if (palindroneRev.toString().equalsIgnoreCase(palindrone)) {
			return true;
		} else {
			return false;
		}

	}

	/* Using a char[] */
	public static boolean palindromeCharArray(String palindrone) {
		System.out.println("UsingCharArray");
		char[] palindromeCharArray = palindrone.toCharArray();
		String palindromeRev = "";
		for (int i = palindromeCharArray.length-1; i >=0 ; i--) {

			palindromeRev += palindromeCharArray[i];

		}
		if (palindromeRev.equalsIgnoreCase(palindrone))
			return true;
		else
			return false;

	}

}
