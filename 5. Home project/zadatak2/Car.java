/*
 * Matej Crnkoviæ
 * 
 * Date: June 06-2019
 * 
 */
package zadatak2;

/**
 * Public class representing a car. 
 * This class extends class Vehicle and inherits all of its methods and attributes.
 * @author MatejC
 *
 */

public class Car extends Vehicle{
	
	/**
	 * Constructor for Car
	 * @param A
	 */

	Car(VehicleType A){
		super(CarSpaceType.MEDIUM, A);
	};

}
