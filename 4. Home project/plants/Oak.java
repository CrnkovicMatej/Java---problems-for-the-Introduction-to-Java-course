/*
 * Matej Crnkoviæ
 * 
 * Date: May 21-2019
 * 
 */

package plants;

/**
 * Public class Oak representing oak tree 
 * This class extends abstract class Tree and has a new
 * implementation of method toString()
 * @author MatejC
 *
 */
public class Oak extends Tree {
	
	/**
	 * Public method toString() returns tree type in capital letters if the tree itself is grown and in lowercase if not
	 *@ return "OAK" if the tree is grown and "oak" if not
	 */
	public String toString() {
		if(super.isItGrown()==true)
			return ("OAK");
		else 
			return ("oak");
	}
}
