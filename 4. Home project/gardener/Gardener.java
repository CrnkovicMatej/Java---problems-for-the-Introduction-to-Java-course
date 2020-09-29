/*
 * Matej Crnkoviæ
 * 
 * Date: May 21-2019
 * 
 */

package gardener;


import plants.Plantable;
import garden.Plot;
import garden.SpaceOccupiedException;
import garden.Garden;
import garden.InvalidPlantType;



/**
 * Public class Gardener represents a garden's gardener containing several methods for operating
 * with plants in the garden.
 * Gardener imports only interfaces and abstract classes (besides exceptions)
 * @author MatejC
 *
 */
public class Gardener {
	
	/**
	 * method "plant" tries to plant a plant on the first available place corresponding with plant type 
	 * @param g
	 * @param p
	 * @throws NoRoomInGardenException
	 */
	void plant (Garden g, Plantable p) throws NoRoomInGardenException{
		try {
			put(g, p, 0, 0);
		} catch (NoRoomInGardenExceptionNew e) {
			throw new NoRoomInGardenException();
		}
			
	}
	
	/**
	 * appurtenant recursion for method "plant"
	 * @param g
	 * @param p
	 * @param k
	 * @param z
	 * @throws NoRoomInGardenExceptionNew
	 */
	void put (Garden g, Plantable p, int k, int z) throws  NoRoomInGardenExceptionNew {
		try {
				for (int i = k; i < g.garden.length; i++) {
							if(g.garden[i].addPlant(z, p)==true) {
								break;
							}
				}
			}
		catch (InvalidPlantType a){
					if (k==g.garden.length-1) throw new NoRoomInGardenExceptionNew();
					else put (g, p, k+1, z);
		} 
		catch (SpaceOccupiedException e) {
					if(z == Plot.CAPACITY-1 && k==g.garden.length-1) throw new NoRoomInGardenExceptionNew(); 
					else if (z == Plot.CAPACITY-1) put(g, p, k+1, z+1);
					else put (g, p, k, z+1);
		}
	}
			
	
	/**
	 * this method waters every plant in the garden
	 * @param g
	 */
	void waterPlants(Garden g){
		for(int i=0; i < g.garden.length; i++) {
			for(int j=0; j < g.garden[i].countPlants(); j++) {
				g.garden[i].getPlant(j).addWater();
			}
		}
	}
	
	/**
	 * prints garden's content on the console (summons toString() method on the garden)
	 * @param g
	 */
	void admirePlants(Garden g){
		System.out.println(g.toString());
	}
}
