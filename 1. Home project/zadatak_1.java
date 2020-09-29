/*
 * Matej Crnkoviæ
 * 
 * Date: March 5-2019
 * 
 */

package hr.vestigo.java.tecaj.zadaca1;

/**
 * 
 * @version 1.0
 * @author MatejC
 *
 */
public class zadatak_1 {
	
	/**
	 * This program is a solution for task num 1 of the First_Vestigo_Education_Homework
	 * @param args
	 */
	public static void main (String [] args) {
		
	//uèitavanje godine
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.print("Unesite godinu: ");
	int godina = sc.nextInt();
	System.out.print("Unesena godina je prijestupna: ");
	
	//ukoliko je godina višekratnik broja 4 ona je prijestupna
	boolean a= true;
	boolean b= false;
	boolean result = (godina%4==0) ? a : b;
	System.out.println(result);
	}
}
