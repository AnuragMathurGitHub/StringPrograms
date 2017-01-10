/**
 * 
 */
package com.test;

import java.util.Scanner;

/**
 * @author Anurag
 *
 */
public class VowelsConsonantsSentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String vC;
		vC = scan.nextLine().trim();
		int vowels = 0, consonants = 0, digits=0, whiteSpace=0;
		
		for (int i = 0; i < vC.length(); i++) {
			char ch = vC.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
					|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'
					|| ch == 'U') {
				vowels++;
			}
			if(Character.isWhitespace(ch)){
				whiteSpace++;
			}
			if (Character.isAlphabetic(ch)) {
				consonants++;
			}
			if(Character.isDigit(ch)){
				digits++;
			}
		}
		scan.close();

		System.out.println("Vowels : " + vowels);
		System.out.println("Digits : " + digits);
		System.out.println("Digits : " + whiteSpace);
		System.out.println("Consonants :" + (consonants - vowels-digits));

	}

}
