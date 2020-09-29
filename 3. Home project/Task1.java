/*
 * Matej Crnkoviæ
 * 
 * Date: April 11-2019
 * 
 */

package hr.vestigo.java.tecaj.zadaca3;

import static java.lang.Math.sqrt;


/**
 * This program is a solution for assignment number 1 of the ThirdVestigoEducationHomework
 * It "runs" through all one-digit, two-digit and three-digit numbers and prints given number if one of the following is true:
 * a) number is one-digit or two-digit prime number
 * b) number is three-digit palindrome
 * @author MatejC
 *
 */
public class Task1 {
	
	/**
	 * Static method that takes integer as argument
	 * Returns true if integer is prime and false if it is not
	 * Method works only for positive integers
	 * @param n
	 * @return
	 */
	public static boolean isPrime (int n) {
		for (int i = 2; i <= sqrt(n); i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	/**
	 * Static method that takes three-digit integer as argument
	 * Returns true if given number is palindrome and false if it is not
	 * @param n
	 * @return
	 */
	public static boolean isPalindrome(int n) {
		if (n % 10 == n / 100) return true;
		else return false;
	}

	/**
	 * Main method called upon execution
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 1; i < 100; i++ ) {
			if (isPrime(i)) System.out.println(i + " ");
			}
		for (int i = 100; i < 1000; i++) {
			if (isPalindrome(i)) System.out.println(i + " ");
		}
	}
}
