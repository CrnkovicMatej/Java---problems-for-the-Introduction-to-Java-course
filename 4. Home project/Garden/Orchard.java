/*
 * Matej Crnkoviæ
 * 
 * Date: May 21-2019
 * 
 */
package garden;

import plants.Plantable;
import plants.Tree;


/**
 * class Orchard represents orchard - a type of a plot only trees can be planted into
 * it contains array of Trees size of CAPACITY
 * Orchard implements Plot and in addition to Plot's methods this class implements toString() method
 * @author MatejC
 *
 */

public class Orchard implements Plot{
	public Tree plantedPlants []= new Tree[CAPACITY];
	
	/**
	 * Implementation of toString() method - method returns all the plants in the Orchard by calling their toString() methods
	 * empty places on this plot are labeled "empty" 
	 * @return String
	 */
	public String toString() {
		String plants="Orchard" + "\n" + "\t";
		for(int i=0; i < plantedPlants.length; i++) {
			if(plantedPlants[i]==null) {
				plants=plants + i + ". empty |";
			}
			else {
				plants=plants + i + "." + plantedPlants[i].toString() + " |";
			}
		}
		return plants;
	}
	
	/* (non-Javadoc)
	 * @see garden.Plot#addPlant(int, plants.Plantable)
	 */
	@Override
	public boolean addPlant(int i, Plantable p) throws InvalidPlantType, SpaceOccupiedException {
		if((p instanceof Tree)==false) { throw new InvalidPlantType(); }
		if(plantedPlants[i]!=null) { throw new SpaceOccupiedException(); }
		plantedPlants[i]=(Tree) p;
		return true;
	}

	/* (non-Javadoc)
	 * @see garden.Plot#getPlant(int)
	 */
	@Override
	public Plantable getPlant(int i) {
		return plantedPlants[i];
	}

	/* (non-Javadoc)
	 * @see garden.Plot#countPlants()
	 */
	@Override
	public int countPlants() {
		int sum=0;
		for(int i=0; i < plantedPlants.length; i++) {
			if(plantedPlants[i]!=null) {
				sum+=1;
			}
		}
		return sum;
	}
}
