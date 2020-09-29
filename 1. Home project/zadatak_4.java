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
public class zadatak_4 {

	/**
	 * This program is a solution for task num 4 of the First_Vestigo_Education_Homework
	 * @param args
	 */
	public static void main (String [] args) {
		
		//uèitavamo kordinate dva broja
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Unesite x koordinatu prvog broja: ");
		int xa = sc.nextInt();
		System.out.print("Unesite y koordinatu prvog broja: ");
		int ya = sc.nextInt();
		System.out.print("Unesite x koordinatu drugog broja: ");
		int xb = sc.nextInt();
		System.out.print("Unesite y koordinatu drugog broja: ");
		int yb = sc.nextInt();
		
		//raèunamo nove varijable radi lakšeg i direktnog pozivanja metode hypot
		double distance;
		double razlikax = (double)xa - (double)xb;
		double razlikay = (double)ya - (double)yb;
		distance = java.lang.Math.hypot(razlikax, razlikay);
		System.out.print("Udaljenost izmeðu dvije toèke iznosi :");
		System.out.println(distance);
	}
}
