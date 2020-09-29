/*
 * Matej Crnkoviæ
 * 
 * Date: May 21-2019
 * 
 */
package gardener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import garden.Flowerbed;
import garden.Garden;
import garden.Orchard;
import plants.Amaranthus;
import plants.Hydrangea;
import plants.Magnolia;
import plants.Oak;


public class MakeGarden {

	
	/**
	 * main method called upon execution
	 * instantiates garden with two plots (one Flowerbed and one Orchard) and a gardener
	 * method supports next commands:
	 * "W" - water the garden
	 * "L" - looking at the garden
	 * "PO" & "PM" - planting oak & magnolia
	 * "PA" & "PH" - planting amaranthus & hydrangea
	 * "Q" - quit the program
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		Garden garden = new Garden();
		Gardener gardener = new Gardener();
		garden.garden[0] = new Orchard();
		garden.garden[1] = new Flowerbed();
		//garden.garden[2] = new Flowerbed();
		//garden.garden[3] = new Flowerbed();
			
		System.out.println("The gardener has entered the garden:");
		System.out.println(garden.toString());	
		System.out.println("Enter command: P(lant)[Plant type] - e.g. PO to (P)lant an (O)ak | W(ater plants)\r\n" + 
				"| L(ook at garden) | Q(uit)");
		
		String command = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while ((command = in.readLine()) != null && !command.equals("Q")) {
			if(command.equals("W")) {
				System.out.println("Waternig plants...");
				gardener.waterPlants(garden);
				System.out.println("Enter command: P(lant)[Plant type] - e.g. PO to (P)lant an (O)ak | W(ater plants)\r\n" + 
						"| L(ook at garden) | Q(uit)");
			}
			else if(command.equals("L")) {
				System.out.println("The gardener is observing the garden");
				gardener.admirePlants(garden);
				System.out.println("Enter command: P(lant)[Plant type] - e.g. PO to (P)lant an (O)ak | W(ater plants)\r\n" + 
						"| L(ook at garden) | Q(uit)");
			}
			else if ((command.equals("PO") || command.equals("PM") || command.equals("PA")|| command.equals("PH"))) {
				command = command.substring(1);
				//System.out.println(command);
				if(command.equals("A")) {
					try{
						Amaranthus a = new Amaranthus();
						gardener.plant(garden, a);
						System.out.println("Gardener: I have planted an amaranthus. What should i do next, hmmm....");
						System.out.println("Enter command: P(lant)[Plant type] - e.g. PO to (P)lant an (O)ak | W(ater plants)\r\n" + 
								"| L(ook at garden) | Q(uit)");
						}
					catch (NoRoomInGardenException b) {
						System.out.println("Gardener: There is no more place in the garden, I cannot plant that plant. "
								+ "Maybe there is something else I could do...");
						System.out.println("Enter command: P(lant)[Plant type] - e.g. PO to (P)lant an (O)ak | W(ater plants)\r\n" + 
								"| L(ook at garden) | Q(uit)");
					}
				}
				else if(command.equals("H")) {
					try{Hydrangea a = new Hydrangea();
						gardener.plant(garden, a);
						System.out.println("Gardener: I have planted a hydrangea. What should i do next, hmmm....");
						System.out.println("Enter command: P(lant)[Plant type] - e.g. PO to (P)lant an (O)ak | W(ater plants)\r\n" + 
								"| L(ook at garden) | Q(uit)");
						}
					catch (NoRoomInGardenException b) {
						System.out.println("Gardener: There is no more place in the garden, I cannot plant that plant."
								+ "Maybe there is something else I could do...");
						System.out.println("Enter command: P(lant)[Plant type] - e.g. PO to (P)lant an (O)ak | W(ater plants)\r\n" + 
								"| L(ook at garden) | Q(uit)");
					}
				}
				else if(command.equals("M")) {
					try{Magnolia a = new Magnolia();
						gardener.plant(garden, a);
						System.out.println("Gardener: I have planted a magnolia. What should i do next, hmmm....");
						System.out.println("Enter command: P(lant)[Plant type] - e.g. PO to (P)lant an (O)ak | W(ater plants)\r\n" + 
								"| L(ook at garden) | Q(uit)");
						}
					catch (NoRoomInGardenException b) {
						System.out.println("Gardener: There is no more place in the garden, I cannot plant that plant. "
								+ "Maybe there is something else I could do...");
						System.out.println("Enter command: P(lant)[Plant type] - e.g. PO to (P)lant an (O)ak | W(ater plants)\r\n" + 
								"| L(ook at garden) | Q(uit)");
					}
				}
				else if(command.equals("O")) {
					try{Oak a = new Oak();
						gardener.plant(garden, a);
						System.out.println("Gardener: I have planted an oak. What should i do next, hmmm....");
						System.out.println("Enter command: P(lant)[Plant type] - e.g. PO to (P)lant an (O)ak | W(ater plants)\r\n" + 
								"| L(ook at garden) | Q(uit)");
						}
					catch (NoRoomInGardenException b) {
						System.out.println("Gardener: There is no more place in the garden, I cannot plant that plant."
								+ "Maybe there is something else I could do...");
						System.out.println("Enter command: P(lant)[Plant type] - e.g. PO to (P)lant an (O)ak | W(ater plants)\r\n" + 
								"| L(ook at garden) | Q(uit)");
					}
				}
			}
			else {
				System.out.println("Wrong command... Try again...");
				System.out.println("Enter command: P(lant)[Plant type] - e.g. PO to (P)lant an (O)ak | W(ater plants)\r\n" + 
						"| L(ook at garden) | Q(uit)");
			}
			
			
		}
		System.out.println("The gardener leaves the garden.");
		
	}

}
