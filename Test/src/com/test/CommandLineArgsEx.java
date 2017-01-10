/**
 * 
 */
package com.test;

/**
 * @author anurag
 *WAP to say hello to every name given in Command Line Args
 */
public class CommandLineArgsEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println("Hello " +args[i]);
		}
		
	}

}
