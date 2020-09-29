/*
 * Matej Crnkoviæ
 * 
 * Date: May 21-2019
 * 
 */
package garden;

import plants.Plantable;

/**
 * interface represents basic form of plot in a garden
 * @author MatejC
 *
 */
public interface Plot {
	
	public int CAPACITY=5;
	
	/**
	 * array of plants (Plantible) size of CAPACITY
	 */
	public Plantable [] plantedPlants = new Plantable[CAPACITY];
	
	/**
	 * method ads Plantible p on the position i in the plot
	 * throws InvalidPlantType if the type of Plantible is not corresponding with plot's type
	 * throws SpaceOccupiedException if there is already a Plantible on position i in the plot
	 * @param i
	 * @param p
	 * @return
	 * @throws InvalidPlantType
	 * @throws SpaceOccupiedException
	 */
	boolean addPlant(int i, Plantable p) throws
	InvalidPlantType, SpaceOccupiedException;
	
	
	/**
	 * method returns plant (Plantible) that is on the position i in the plot
	 * returns null if the plot is empty
	 * @param i
	 * @return
	 */
	Plantable getPlant(int i);
	
	/**
	 * method counts and returns the number of planted plants of the plot
	 * @return
	 */
	public int countPlants();

}
