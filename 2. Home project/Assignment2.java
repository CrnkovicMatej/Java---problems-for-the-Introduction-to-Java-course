/*
 * Matej Crnkoviæ
 * 
 * Date: March 20-2019
 * 
 */

package hr.vestigo.java.tecaj.zadaca2;

/**
 * 
 * @version 1.0
 * @author MatejC
 *
 */
public class Assignment2 {

	/**
	 * This program is a solution for assignment number 2 of the SecondVestigoEducationHomework
	 * It counts and prints how many times strings "Tom" and "Jerry" are adjacent
	 * in three given strings.
	 * @param args
	 */
	public static void main(String [] args) {
		
		String[] arr1 = {"Nick", "Tom", "Jerry", "Bob", "Jerry", "Mike", "Tom", "Jerry", "Tom"};
		String[] arr2 = {"Hello", "World", "Java", "Jerry", "Bob", "Tom", "Jerry"};
		String[] arr3 = {"Rob", "Mike", "George", "Jerry", "Tom", "David", "John", "Jack", "Jerry", "Tom"};
		int numberOfAdjacent = 0;
		for (int i = 0; i < arr1.length - 1; i++) {
			if ((arr1[i] == "Tom" && arr1[i+1] == "Jerry") || (arr1[i] == "Jerry" && arr1[i+1] == "Tom"))
			numberOfAdjacent += 1;
		}
		for (int i = 0; i < arr2.length - 1; i++) {
			if ((arr2[i] == "Tom" && arr2[i+1] == "Jerry") || (arr2[i] == "Jerry" && arr2[i+1] == "Tom"))
			numberOfAdjacent += 1;
		}
		for (int i = 0; i < arr3.length - 1; i++) {
			if ((arr3[i] == "Tom" && arr3[i+1] == "Jerry") || (arr3[i] == "Jerry" && arr3[i+1] == "Tom"))
			numberOfAdjacent += 1;
		}
		
		System.out.println("Number of adjacent strings <Tom> and <Jerry> is: " + numberOfAdjacent);
		
	}
}
