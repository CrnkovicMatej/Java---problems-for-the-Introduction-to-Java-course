/*
 * Matej Crnkoviæ
 * 
 * Date: May 21-2019
 * 
 */
package garden;

import plants.Flower;
import plants.Plantable;


/**
 * class Flowerbed represents flowerbed - a type of a plot only flowers can be planted into
 * it contains array of Flowers size of CAPACITY
 * Flowerbed implements Plot and in addition to Plot's methods this class implements toString() method
 * @author MatejC
 *
 */
public class Flowerbed implements Plot {

	public Flower [] plantedPlants = new Flower [CAPACITY] ;
	
	
	/**
	 * Implementation of toString() method - method returns all the plants in the Flowerbed by calling their toString() methods
	 * empty places on this plot are labeled "empty" 
	 * @return String
	 */
	public String toString() {
		String plants="Flowerbed" + "\n"+ "\t";
		for(int i=0; i < plantedPlants.length; i++) {
			if(plantedPlants[i]==null) {
				plants=plants + i + ". empty  |";
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
		if((p instanceof Flower)==false) { throw new InvalidPlantType(); }
		if(plantedPlants[i]!=null) { throw new SpaceOccupiedException(); }
		plantedPlants[i]=(Flower) p;
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
