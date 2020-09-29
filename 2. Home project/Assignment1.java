/*
 * Matej Crnkoviæ
 * 
 * Date: March 20-2019
 * 
 */

package hr.vestigo.java.tecaj.zadaca2;

import static java.lang.System.arraycopy ;
import java.util.Arrays;


/**
 * 
 * @version 1.0
 * @author MatejC
 *
 */
public class Assignment1 {
	
	/**
	 * This program is a solution for assignment number 1 of the SecondVestigoEducationHomework
	 * It merges three given integer Arrays in one, sorts result Array in descending order and
	 * prints it on standard output.
	 * @param args
	 */
	public static void main(String [] args) {
		
		int [] numbers1 = {9, 8, 937, 1961, 24, 7};
		int [] numbers2 = {61, 7285, 17, 826, 175, 6813, 8123};
		int [] numbers3 = {4373, 3, 92, 99, 897, 32, 50, 1, 67};
		int [] numbersFinal = new int [numbers1.length + numbers2.length + numbers3.length];
		arraycopy(numbers1, 0, numbersFinal, 0, numbers1.length);
		arraycopy(numbers2, 0, numbersFinal, numbers1.length, numbers2.length);
		arraycopy(numbers3, 0, numbersFinal, numbers1.length + numbers2.length, numbers3.length);
		// The program will multiply the Array by -1
		// then sort the Array and multiply it by -1 again
		for (int i = 0; i < numbersFinal.length ; i++) {
			numbersFinal[i] = - numbersFinal[i];
		}
		Arrays.sort(numbersFinal);
		for (int i = 0; i < numbersFinal.length ; i++) {
			numbersFinal[i] = - numbersFinal[i];
		}
		System.out.print("Result array is : {");
		for (int i = 0; i < numbersFinal.length-1 ; i++) {
			System.out.print(numbersFinal[i] + ", ");
			
		}
		System.out.println(numbersFinal[numbersFinal.length-1] + "}");
	}
}
