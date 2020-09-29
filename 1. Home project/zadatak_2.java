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
import java.lang.Math;

public class zadatak_2 {
	
	/**
	 * This program is a solution for task num 2 of the First_Vestigo_Education_Homework
	 * @param args
	 */
	 public static void main (String[] args) { 
		 
		//uèitavamo željeni broj i potenciju
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Unesite broj: ");
		double broj = sc.nextDouble();
		System.out.print("Unesite potenciju: ");
		
		//koristimo metodu za potenciranje
		double potencija = sc.nextDouble(); 
		double result = java.lang.Math.pow (broj, potencija);
		System.out.println((int)potencija + ". potencija unesenog broja iznosi:" + (int)result);
		
	 } 
}
