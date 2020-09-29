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

public class Assignment3 {
	
	/**
	 * This program is a solution for assignment number 3 of the SecondVestigoEducationHomework
	 * The program checks for palindromes in the given string array and copies those 
	 * palindromes into the new array. If the palindrome has even number of characters it is
	 * copied in the upper case and if it has odd number of characters it is copied in the 
	 * original case.
	 * @param args
	 */
	
	public static void main(String [] args) {
		
		String[] arr = {"Bob", "civic", "Time", "rAdar", "lol", "DotA", "dEtarTrated",
				"sAiPpuaKivikauPPias", "rotoR", "solo", "kite", "Rick", "Evee", "discipline",
				"_wow_", "sTat"};
		String[] arrNew = new String [16];
		for (int i = 0; i < arr.length; i++) {
			int flag = 1;
			String noSpaces = arr[i].replaceAll("\\s+", "");
			String [] temp = noSpaces.split("");
			for (int j = 0; j < temp.length/2; j++) {
				if ((temp[j].compareToIgnoreCase(temp[temp.length - j - 1])) != 0) {
					flag = 0;
					break ;
					}
				}
			
			//since it is not specified in the assignment in which order to fill the new array
			//I decided to put a palindrome-string on index in the new array that corresponds 
			//with the index of that string in the original array
			
			//also it is not specified do we count " " as a character when checking
			//for odd or even number of characters
			//I decided to count " " as a character
			if (flag == 1) {
				if (arr[i].length() % 2 == 0) {
					arrNew[i] = arr[i].toUpperCase();
				} else {
					arrNew[i] = arr[i];
				}
			}
		}
		//it is not stated in the assignment itself that new array has to be printed
		//but I think it is useful
		System.out.println("New array of palindromes is:");
		System.out.print("{");
		for (int i = 0; i < arrNew.length - 1; i++) {
			System.out.print(arrNew[i] + ", ");
		}
		System.out.print(arrNew[arrNew.length - 1] + "}");
	}
}