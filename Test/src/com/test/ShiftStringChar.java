/**
 * 
 */
package com.test;

import java.util.Scanner;

/**
 * @author Anurag
 *
 */
public class ShiftStringChar {

	static int count;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String shiftChar = scan.next();
		scan.close();
		for(;;){
			shiftChar = shiftChar.charAt(shiftChar.length() - 1) + shiftChar.substring(0, shiftChar.length() - 1);
		}
		//shiftStringleft(shiftChar);
		
	}

	static void shiftStringleft(String shiftChar) {

		count++;
		shiftChar = shiftChar.charAt(shiftChar.length() - 1) + shiftChar.substring(0, shiftChar.length() - 1);
		System.out.println("Shifted string " + count + " " + shiftChar);

	}

}
