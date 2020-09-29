/*
 * Matej Crnkoviæ
 * 
 * Date: May 21-2019
 * 
 */

package plants;

/**
 * Public class Magnolia representing magnolia tree 
 * This class extends abstract class Tree and has a new
 * implementation of method toString()
 * @author MatejC
 *
 */
public class Magnolia extends Tree {
	
	/**
	 * Public method toString() returns tree type in capital letters if the tree itself is grown and in lowercase if not
	 *@ return "MAGNOLIA" if the tree is grown and "magnolia" if not
	 */
	public String toString() {
		if(super.isItGrown()==true)
			return ("MAGNOLIA");
		else 
			return ("magnolia");
	}
}
