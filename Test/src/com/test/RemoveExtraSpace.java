/**
 * 
 */
package com.test;

import java.util.Scanner;

/**
 * @author Anurag
 *
 */
public class RemoveExtraSpace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		System.out.println("Your Sentence is  : " + sentence);
		scan.close();
		sentence = sentence.replaceAll("\\s+", " ");
		System.out.println(sentence);
	}

}
