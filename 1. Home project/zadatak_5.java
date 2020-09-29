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
public class zadatak_5 {

	/**
	 * This program is a solution for task num 5 of the First_Vestigo_Education_Homework
	 * @param args
	 */
	public static void main (String [] args) {
		
		//uèitavanje sata i dana
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Unesite sat:");
		int sat = sc.nextInt();
		System.out.print("Unesite dan:");
		String dan = sc.next();
		
		//provjeravamo jesu li ispunjeni uvjeti za rad trgovine
		boolean radi = ((sat>7 && sat<17) 
					    && (!dan.equalsIgnoreCase("Subota") && !dan.equalsIgnoreCase("Nedjelja"))) 
								? true : false;
		//pretpostavili smo kako ce user ispravno unijeti dan do na veliko slovo
		System.out.print("Na navedeni dan i sat trgovina radi: ");
		System.out.println(radi);
	}
	
}
