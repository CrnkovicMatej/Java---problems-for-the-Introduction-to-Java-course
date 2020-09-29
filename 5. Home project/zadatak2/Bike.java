/*
 * Matej Crnkoviæ
 * 
 * Date: June 06-2019
 * 
 */
package zadatak2;


/**
 * Public class representing a bike. 
 * This class extends class Vehicle and inherits all of its methods and attributes.
 * @author MatejC
 *
 */
public class Bike extends Vehicle {

	/**
	 * Constructor for Bike
	 * @param A
	 */
	Bike(VehicleType A){
		super(CarSpaceType.SMALL, A);
		
	};
}
