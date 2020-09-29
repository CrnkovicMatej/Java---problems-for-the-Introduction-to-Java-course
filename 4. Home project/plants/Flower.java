/*
 * Matej Crnkoviæ
 * 
 * Date: May 21-2019
 * 
 */
package plants;

/**
 * Class Flower is an abstract class representing flowers plantible in garden
 * that implements interface Plantible
 * @author MatejC
 *
 */
public abstract class Flower implements Plantable{
	
	int numOfTimesWatered=0;
	boolean isGrown=false;
	
	/* (non-Javadoc)
	 * @see plants.Plantable#addWater()
	 */
	public void addWater() {
		numOfTimesWatered+=1;
		if(this.isItGrown()==true)
			isGrown=true;
	}
	
	/**
	 * Public method used for checking whether the flower is grown or not
	 * @return true if grown, false if not
	 */
	boolean isItGrown () {
		if(numOfTimesWatered > 0) 
			return true;
		else
			return false;
	}
}
