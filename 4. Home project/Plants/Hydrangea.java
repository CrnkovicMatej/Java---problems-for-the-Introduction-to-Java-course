/*
 * Matej Crnkoviæ
 * 
 * Date: May 21-2019
 * 
 */

package plants;

/**
 * Public class Hydrangea representing hydrangea flower
 * This class extends abstract class Flower and has a new
 * implementation of method toString()
 * @author MatejC
 *
 */

public class Hydrangea extends Flower{
	/**
	 * Public method toString() returns flower type in capital letters if the tree itself is grown and in lowercase if not
	 *@ return "HYDRANGEA" if the tree is grown and "hydrangea" if not
	 */
	
	public String toString() {
		if(super.isItGrown()==true)
			return ("HYDRANGEA");
		else 
			return ("Hydrangea");
	}

}
