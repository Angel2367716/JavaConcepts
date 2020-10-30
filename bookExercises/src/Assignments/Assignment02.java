package Assignments;
//CSE 110     : 76232 (Session B)

//Assignment  : 2
//Author      : Marco Angel
//Student ID  : 1202611535
//Description : <of the file contents>

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {
		// declare and instantiate a Scanner
		Scanner in = new Scanner(System.in);

		// declare and initialize variables
		double roadLength;
		int numOfLanes, asphaltDepth, daysToComplete;
		final int ONE_MILE_IN_FT = 5280;

		// collect inputs
		System.out.print("Length of road project (miles): ");
		roadLength = in.nextDouble();

		System.out.print("Number of lanes: ");
		numOfLanes = in.nextInt();

		System.out.print("Depth of asphalt (inches): ");
		asphaltDepth = in.nextInt();

		System.out.print("Days to complete project: ");
		daysToComplete = in.nextInt();
		in.close();

		// compute required values
		int truckloads_of_Asphalt, stoplights, conduit_Pipes, crew_members;
		double cost_of_Asphalt, cost_of_Stoplights, cost_of_Conduit_Pipes, cost_of_Labor, total_Cost,
				total_weight_of_asphalt;
		double inchToFt = 1 / 12.0;
		double lbsPerCubitFt = 12 * 150;

		// Truckloads of Asphalt and Asphalt cost
		total_weight_of_asphalt = roadLength * ONE_MILE_IN_FT * numOfLanes * asphaltDepth * inchToFt * lbsPerCubitFt;
		truckloads_of_Asphalt = (int) Math.ceil(total_weight_of_asphalt / 10000);
		cost_of_Asphalt = truckloads_of_Asphalt * 1000; // one ton = $200, 5 ton = $1000

		// cost of materials

		// display results
		System.out.println("\n" + "=== Amount of materials needed ===");
		System.out.println("Truckloads of Asphalt : " + truckloads_of_Asphalt);
		System.out.println("Stoplights :");
		System.out.println("Conduit pipes :");
		System.out.println("Crew members needed :");
		System.out.println("\n" + "=== Cost of Materials ============");
		System.out.println("Cost of Asphalt : " + cost_of_Asphalt);
		System.out.println("Cost of Stoplights :");
		System.out.println("Cost of Conduit pipes :");
		System.out.println("Cost of Labor :");
		System.out.println("\n" + "=== Total Cost of Project ========");
		System.out.println("Total cost of project :");

	}

}
