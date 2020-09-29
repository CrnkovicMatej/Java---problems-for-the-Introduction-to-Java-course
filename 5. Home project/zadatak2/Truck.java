/*
 * Matej Crnkoviæ
 * 
 * Date: June 06-2019
 * 
 */
package zadatak2;

/**
 * Public class representing a truck. 
 * This class extends class Vehicle and inherits all of its methods and attributes.
 * @author MatejC
 *
 */

public class Truck extends Vehicle{

	/**
	 * Constructor for Truck
	 * @param A
	 */
	Truck(VehicleType A){
		super(CarSpaceType.LARGE, A);
	};

}
