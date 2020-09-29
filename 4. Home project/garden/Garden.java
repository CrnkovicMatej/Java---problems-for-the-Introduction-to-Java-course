/*
 * Matej Crnkoviæ
 * 
 * Date: May 21-2019
 * 
 */
package garden;

/**
 * @author oi jarun
 *
 */
public class Garden {
	
	public Plot [] garden= new Plot[2];
	
	/**
	 * implementation of method toString()
	 * returns String containing all the garden's plots (by calling their toString() methods)
	 * @return String
	 */
	public String toString() {
		String plots="Garden:" + "\n";
		for(int i = 0; i < garden.length; i++) {
			plots=plots + i + "." + garden[i].toString() + "\n";
		}
		return plots;
	}

}
