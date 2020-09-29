/*
 * Matej Crnkoviæ
 * 
 * Date: June 06-2019
 * 
 */
package zadatak2;


/**
 * Public Main class.
 * @author MatejC
 *
 */
public class Main {

	/**
	 * Main method called upon execution.
	 * Creates a parking and then tries to park vehicles.
	 * On the end of the parking process checks for available spots on the parking.
	 * @param args
	 */
	public static void main(String[] args) {
		ParkingLot Parking = new ParkingLot();
		System.out.println("PARKING THE HANDICAPPED CARS");
		for(int i = 0; i < 6; i++) {
			Car car = new Car(VehicleType.HENDICAPED);
			Parking.park(car);;
		}
		System.out.println();
		System.out.println("PARKING REGULAR TRUCKS");
		for(int i=0; i<8; i++) {
			Truck truck = new Truck(VehicleType.REGULAR); 
			Parking.park(truck);
		}
		System.out.println();
		System.out.println("PARKING THE REGULAR CARS");
		for(int i=0; i<3; i++) {
			Car car = new Car(VehicleType.REGULAR); 
			Parking.park(car);
		}
		System.out.println();
		System.out.println("PARKING AN INVALID TRUCK");
		Truck truck = new Truck(VehicleType.HENDICAPED);
		Parking.park(truck);
		System.out.println();
		System.out.println("PARKING A TRUCK");
		truck = new Truck(VehicleType.REGULAR);
		Parking.park(truck);
		System.out.println();
		System.out.println("PARKING AN INVALID TRUCK");
		truck = new Truck(VehicleType.HENDICAPED);
		Parking.park(truck);
		System.out.println();
		System.out.println("PARKING THE REGULAR BIKES");
		for(int i=0; i<3; i++) {
			Bike bike = new Bike(VehicleType.REGULAR); 
			Parking.park(bike);
		}
		System.out.println();
		System.out.println("PARKING A CAR");
		Car car = new Car(VehicleType.REGULAR);
		Parking.park(car);
		System.out.println();
		Parking.isTheParkingFull();
		Parking.showFreeSpots();

	}

}
