/*
 * Matej Crnkoviæ
 * 
 * Date: May 21-2019
 * 
 */

package plants;

/**
 * Public class Amaranthus representing amaranthus flower
 * This class extends abstract class Flower and has a new
 * implementation of method toString()
 * @author MatejC
 *
 */

public class Amaranthus extends Flower {
	
	/**
	 * Public method toString() returns flower type in capital letters if the tree itself is grown and in lowercase if not
	 *@ return "AMARANTHUS" if the tree is grown and "amaranthus" if not
	 */
	public String toString() {
		if(super.isItGrown()==true)
			return ("AMARANTHUS");
		else 
			return ("amaranthus");
	}
}
