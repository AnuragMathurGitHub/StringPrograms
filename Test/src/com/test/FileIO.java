/**

 * 
 */
package com.test;

	import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;




/**
 * @author anurag
 *
 */
public class FileIO {

	/**
	 * @param args
	 */
	/* To remove change line from a file */

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			InputStream is = new FileInputStream("F:\\3000 RNN.txt");
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line = buf.readLine();
			StringBuilder sb = new StringBuilder();
			while (line != null) {
				sb.append(line).append("\n");
				line = buf.readLine();
			}
			String fileAsString = 
			sb.toString().replace("\n", "").replace("\r", "");
			System.out.println("Contents : " + fileAsString);
			BufferedWriter outStream = new BufferedWriter(new FileWriter(
					"F://temp//3000rinnovabile.txt", false));
				
				outStream.write(fileAsString);
				
			outStream.close();

			// text = text.replace("\n", "").replace("\r", "");
		}

	

	/* to read From a File */

/*	           BufferedReader in = new BufferedReader(new FileReader(
	    				"F://temp//3000rinnovabile.txt"));
	    		String listaContratti = new String(); // while (in.readLine() != null)
	    		listaContratti = in.readLine();
	    		StringTokenizer tokenizerContratti = new StringTokenizer(
	    				listaContratti, ",");

	    		int lengthTokens = tokenizerContratti.countTokens();
	    		arrayNumContrAnnualiTot = new String[lengthTokens];
	    		int i = 0;
	    		while (tokenizerContratti.hasMoreTokens()) {
	    			String[] arrayNumContrAnnualiTot;
					arrayNumContrAnnualiTot[i] = tokenizerContratti.nextToken().trim();
	    			i++;
	    		}

	    		in.close();
*/
	   /*Write in a file*/
	   
/*	    		BufferedWriter outStream = new BufferedWriter(new FileWriter(
	    				"F://temp//rinnovabile.txt", false));
	    			for(int i =0;i<arrayNumContrAnnualiTot.length;i++)
	    			{
	    			outStream.write(arrayNumContrAnnualiTot[i] + ",");
	    			}
	    		outStream.close();
*/}
