/*
 * Matej Crnkoviæ
 * 
 * Date: June 06-2019
 * 
 */
package zadatak2;


/**
 * Public class representing a parking lot.
 * @author oi MatejC
 *
 */
public class ParkingLot {
	
	int regularLargeSpaces=0;
	int regularMediumSpaces=0;
	int regularSmallSpaces=0;
	int hendicapedLargeSpaces=0;
	int hendicapedMediumSpaces=0;
	int hendicapedSmallSpaces=0;
		
	/**
	 * Constructor for ParkingLot
	 */
	public ParkingLot() {
		regularLargeSpaces=10;
		regularMediumSpaces=24;
		regularSmallSpaces=9;
		hendicapedMediumSpaces=5;
		};
	
	/**
	 * Method used for parking a vehicle
	 * @param A
	 */
	void park(Vehicle A) {
		findParkingSpotAndPark(A.getSize(), A.getlsHandicaped());
	};
	
	/**
	 * Method used for checking is the parking full
	 * @return
	 */
	boolean isTheParkingFull() {
		System.out.println("Is the parking full?");
		if(regularLargeSpaces==0 && regularMediumSpaces==0 && regularSmallSpaces==0 && hendicapedLargeSpaces==0 && 
				hendicapedMediumSpaces==0 && hendicapedSmallSpaces==0) { System.out.println("YES"+"\n"); return true;}
		else {System.out.println("NO"+"\n"); return false;}
			
	}
	
	/**
	 * Method that lists all of the free spots on the parking
	 */
	void showFreeSpots() {
		System.out.println("What spots are left?");
		System.out.println("There are "+ regularSmallSpaces +" SMALL REGULAR spots left.");
		System.out.println("There are "+ hendicapedSmallSpaces +" SMALL HENDICAPED spots left.");
		System.out.println("There are "+ regularMediumSpaces +" MEDIUM REGULAR spots left.");
		System.out.println("There are "+ hendicapedMediumSpaces +" MEDIUM HENDICAPED spots left.");
		System.out.println("There are "+ regularLargeSpaces +" LARGE REGULAR spots left.");
		System.out.println("There are "+ hendicapedLargeSpaces +" LARGE HENDICAPED spots left.");
	};
	
	/**
	 * Method that searches for a suitable spot to park a vehicle according to its space type and vehicle type.
	 * If there is no more place for that vehicle it prints a message.
	 * @param A
	 * @param B
	 */
	void findParkingSpotAndPark(CarSpaceType A, VehicleType B){
		if(B==VehicleType.HENDICAPED) {
			if(A==CarSpaceType.LARGE) {
				if(hendicapedLargeSpaces==0 && regularLargeSpaces==0) System.out.println("There is no place for this truck" );
				else if(hendicapedLargeSpaces==0) {
					regularLargeSpaces--;
					System.out.println("The truck has parked in a LARGE REGULAR");
				}
				else {
					hendicapedLargeSpaces--;
					System.out.println("The truck has parked in a LARGE HENDICAPED");
				}
			}
			if(A==CarSpaceType.MEDIUM) {
				if(hendicapedMediumSpaces>0) {
					hendicapedMediumSpaces--;
					System.out.println("The car has parked in a MEDIUM HENDICAPED");
				}
				else if(regularMediumSpaces>0) {
					regularMediumSpaces--;
					System.out.println("The car has parked in a MEDIUM REGULAR");
				}
				else if(hendicapedLargeSpaces>0) {
					hendicapedLargeSpaces--;
					System.out.println("The car has parked in a LARGE HENDICAPED");
				}
				else if(regularLargeSpaces>0) {
					regularLargeSpaces--;
					System.out.println("The car has parked in a LARGE REULAR");
				}
				else System.out.println("There is no more place for this car");
			}
			if(A==CarSpaceType.SMALL) {
				if(hendicapedSmallSpaces>0) {
					hendicapedSmallSpaces--;
					System.out.println("The bike has parked in a SMALL HENDICAPED");
				}
				else if(regularSmallSpaces>0) {
					regularSmallSpaces--;
					System.out.println("The bike has parked in a SMALL REGULAR");
				}
				else if(hendicapedMediumSpaces>0) {
					hendicapedMediumSpaces--;
					System.out.println("The bike has parked in a MEDIUM HENDICAPED");
				}
				else if(regularMediumSpaces>0) {
					regularMediumSpaces--;
					System.out.println("The bike has parked in a MEDIUM REGULAR");
				}
				else if(hendicapedLargeSpaces>0) {
					hendicapedLargeSpaces--;
					System.out.println("The bike has parked in a LARGE HENDICAPED");
				}
				else if(regularLargeSpaces>0) {
					regularLargeSpaces--;
					System.out.println("The bike has parked in a LARGE REULAR");
				}
				else System.out.println("There is no more place for this bike");
				
			}
		}
		else if(B==VehicleType.REGULAR) {
			if(A==CarSpaceType.LARGE) {
				if(regularLargeSpaces>0) {
					regularLargeSpaces--;
					System.out.println("The truck has parked in a LARGE REGULAR");
				}
				else System.out.println("There is no place for this truck" );
			}
			if(A==CarSpaceType.MEDIUM) {
				if(regularMediumSpaces>0) {
					regularMediumSpaces--;
					System.out.println("The car has parked in a MEDIUM REGULAR");
				}
				else if (regularLargeSpaces>0) {
					regularLargeSpaces--;
					System.out.println("The car has parked in a LARGE REGULAR");
				}
				else System.out.println("There is no place for this car");
			}
			if(A==CarSpaceType.SMALL) {
				if(regularSmallSpaces>0) {
					regularSmallSpaces--;
					System.out.println("This bike has parked in a SMALL REGULAR");
				}
				else if (regularMediumSpaces>0) {
					regularMediumSpaces--;
					System.out.println("This bike has parked in a MEDIUM REGULAR");
				}
				else if(regularLargeSpaces>0) {
					regularLargeSpaces--;
					System.out.println("This bike has parked in a LAGRE REGULAR");
				}
				else System.out.println("There is no more place for this bike");
			}
		}
	};
}
