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
		int truckloads_of_Asphalt, stop_lights, conduit_Pipes, crew_members, total_intersections;
		double cost_of_Asphalt, cost_of_Stoplights, cost_of_Conduit_Pipes, cost_of_Labor, total_Cost,
				total_weight_of_asphalt;
		double inchToFt = 1 / 12.0;
		double lbsPerCubitFt = 12 * 150;
		final double COST_OF_FIVE_TON = 200 * 5;
		final double COST_OF_SINGLE_STOPLIGHT = 25000;

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
		// Truckloads of Asphalt and Asphalt cost
		total_weight_of_asphalt = roadLength * ONE_MILE_IN_FT * numOfLanes * asphaltDepth * inchToFt * lbsPerCubitFt;
		truckloads_of_Asphalt = (int) Math.ceil(total_weight_of_asphalt / 10000);
		cost_of_Asphalt = truckloads_of_Asphalt * COST_OF_FIVE_TON; // one ton = $200, 5 ton = $1000

		// Conduit pipes and cost
		conduit_Pipes = (int) Math.round(roadLength * ONE_MILE_IN_FT / 24); // conduit pipe available in 24 ft
		cost_of_Conduit_Pipes = conduit_Pipes * 500; // 500 is the cost of one 24 ft conduit pipe

		// Intersactions and cost
		total_intersections = (int) Math.floor(roadLength);
		stop_lights = total_intersections * (2 + numOfLanes);
		cost_of_Stoplights = stop_lights * COST_OF_SINGLE_STOPLIGHT;

		// Crew members and cost
		crew_members = (int) Math.round(50 * roadLength * numOfLanes / daysToComplete);
		cost_of_Labor = 25 * 8 * daysToComplete * crew_members; // crew member formula given

		// Total cost
		total_Cost = cost_of_Asphalt + cost_of_Stoplights + cost_of_Conduit_Pipes + cost_of_Labor;

		// display results
		System.out.println("\n" + "=== Amount of materials needed ===");
		System.out.println("Truckloads of Asphalt : " + truckloads_of_Asphalt);
		System.out.println("Stoplights : " + stop_lights);
		System.out.println("Conduit pipes : " + conduit_Pipes);
		System.out.println("Crew members needed : " + crew_members);
		System.out.println("\n" + "=== Cost of Materials ============");
		System.out.println("Cost of Asphalt : " + cost_of_Asphalt);
		System.out.println("Cost of Stoplights : " + cost_of_Stoplights);
		System.out.println("Cost of Conduit pipes : " + cost_of_Conduit_Pipes);
		System.out.println("Cost of Labor : " + cost_of_Labor);
		System.out.println("\n" + "=== Total Cost of Project ========");
		System.out.println("Total cost of project : " + total_Cost);

	}

}
