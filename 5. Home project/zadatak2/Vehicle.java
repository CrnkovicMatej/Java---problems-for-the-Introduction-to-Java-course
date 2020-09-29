/*
 * Matej Crnkoviæ
 * 
 * Date: June 06-2019
 * 
 */
package zadatak2;

import zadatak2.VehicleType;
import zadatak2.CarSpaceType;

/**
 * Public class representing a general vehicle
 * @author MatejC
 *
 */


public class Vehicle {
	
	private CarSpaceType spcType;
	private VehicleType vehType;
	
	/**
	 * Constructor for Vehicle
	 * @param A
	 * @param B
	 */
	Vehicle (CarSpaceType A, VehicleType B){
		spcType=A;
		vehType=B;
		};
		
	/**
	 * Default constructor
	 */
	Vehicle(){
		
	};
	
	/**
	 * Getter method for CarSpaceType of vehicle
	 * @return
	 */
	CarSpaceType getSize() {
		return spcType;
	}
	
	/**
	 * Setter method for CarSpaceType of vehicle
	 * @param A
	 */
	void setSize(CarSpaceType A) {
		spcType=A;
	}
	
	/**
	 * Getter method for VehicleType of vehicle
	 * @return
	 */
	VehicleType getlsHandicaped() {
		return vehType;
	};
	
	/**
	 * Setter method for VehicleType of vehicle
	 * @param A
	 */
	void setlsHandicaped (VehicleType A) {
		vehType=A;
	};

}
