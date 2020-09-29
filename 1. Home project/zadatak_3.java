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
public class zadatak_3 {
	
	/**
	 * This program is a solution for task num 3 of the First_Vestigo_Education_Homework
	 * @param args
	 */
	public static void main (String [] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Unesite peteroznamenkasti broj: ");
		int broj = sc.nextInt();
		
		
		//mogli bi koristiti while petlju dok je broj!=0 uzimamo %10 i zbrajamo u sumu 
		//zatim "stripamo" zadnju znamenku sa /10 ili for koji se vrti 5 puta,
		//no jer to nismo službeno radili na edukaciji
		//ovdje æe se 5 puta ponoviti opisani postupak
		int suma=0;
		suma = suma + broj%10; 
		broj = broj/10;
		suma = suma + broj%10; 
		broj = broj/10;
		suma = suma + broj%10; 
		broj = broj/10;
		suma = suma + broj%10; 
		broj = broj/10;
		suma = suma + broj%10; 
		System.out.print("Zbroj znamenki iznosi: ");
		System.out.println(suma);
		
	}
}
