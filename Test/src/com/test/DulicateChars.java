/**
 * 
 */
package com.test;

import java.util.Scanner;

/**
 * @author anurag
 *
 */
public class DulicateChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String original = scan.next();
		scan.close();
		
		for (int i = 0; i < original.length(); i++) {
			for (int j = i+1; j < original.length(); j++) {
				if(original.charAt(i)==original.charAt(j)){
					System.out.println(original.charAt(i));
				}
			}
			
			
		}
		
		
	}

}
