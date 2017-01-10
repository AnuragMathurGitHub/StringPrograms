package com.test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfWords {

	/**
	 * @param args
	 * To find number of words in a sentence
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String scentence = scan.nextLine().trim();
		//scentence=scentence.replace(" ", ",");
		StringTokenizer tokenizeSentence = new StringTokenizer(scentence, " ");
		int numberOfWords = tokenizeSentence.countTokens();
		
		System.out.println("There are " + numberOfWords + " words in the sentence " + "UsingStringTokenizer");
		
		numberOfWords=scentence.split("\\s+").length;
		System.out.println("There are " + numberOfWords + " word in the sentence" + " using split method");
		
		System.out.println("There are " + countUsingCharArray(scentence) + " word in the sentence" + " using charArray");
		
		scan.close();
		
		
	}
	
	public static int countUsingCharArray(String sentence) {
		int count =0;
		char[] sentenceCharArray = sentence.toCharArray();
		for (int i = 0; i < sentenceCharArray.length; i++) {
			 //if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
			if(sentenceCharArray[i] == ' '){
				count++;
			}
		}
		
		return count;
	}

}
