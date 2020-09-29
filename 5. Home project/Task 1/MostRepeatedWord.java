/*
 * Matej Crnkoviæ
 * 
 * Date: June 06-2019
 * 
 */
package zadatak1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Public class for with one static string and one method for 
 * counting the most repeated word in a string (a sentence or a paragraph).
 * @author MatejC
 *
 */
public class MostRepeatedWord {
	
	
	static String [] doNotCountString = {"the", "a", "or", "an", "it", "and", "but", "is", "are", "of", "on", "to", 
			"was", "were", "in", "that", "i", "your", "his", "their", "her", "you", "me", "all"};
	
	/**
	 * Public method that receives a String and prints the most repeated word and number of repetitions not counting frequently 
	 * used words listed in a static string. Method does not differentiate between lowercase and uppercase.  
	 * @param A
	 */
	public static void findMostRepeatedWord(String A) {
		
		int numberOfIterations=-1;
		String theString=null;
		
		final ArrayList<String> doNotCount = new ArrayList<String>(Arrays.asList(doNotCountString));
		ArrayList<String> ourString = new ArrayList<String>(Arrays.asList(A.split(" ")));
		
		Map<String, Integer> ourMap = new HashMap<String, Integer>();
		for(String s : ourString) {
			if(doNotCount.contains(s.toLowerCase())) continue;
			if(ourMap.containsKey(s.toLowerCase())==false) ourMap.put(s.toLowerCase(),1);
			else ourMap.put(s.toLowerCase(), ourMap.get(s.toLowerCase())+1);
		}	
		for (String key : ourMap.keySet()) {
			if(ourMap.get(key)>numberOfIterations) {
				numberOfIterations=ourMap.get(key);
				theString=key;
			}
		}
		System.out.println("Most repeated word: "+ theString +" – Repeated: " + numberOfIterations +" times");
	}
}
