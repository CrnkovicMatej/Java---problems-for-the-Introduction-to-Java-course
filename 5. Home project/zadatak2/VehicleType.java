/*
 * Matej Crnkoviæ
 * 
 * Date: June 06-2019
 * 
 */
package zadatak2;

/**
 * Public enumerator representing a type of vehicles. 
 * @author MatejC
 *
 */
public enum VehicleType {
	REGULAR, HENDICAPED;
	boolean vehicleType;
	
	VehicleType(){
	};
	
	/**
	 * Method for checking is the vehicle handicapped or regular.
	 * @return
	 */
	boolean isHandicaped() {
		if (this==HENDICAPED) return true;
		else return false;
	};
}
