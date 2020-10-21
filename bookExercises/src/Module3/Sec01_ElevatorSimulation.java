package Module3;

import java.util.Scanner;

public class Sec01_ElevatorSimulation {

	public static void main(String[] args) {
		Scanner bacon = new Scanner(System.in);
		System.out.print("Floor: ");
		int floor = bacon.nextInt();

		// Adjust floor if necessary

		int actualFloor;
		if (floor > 12) {
			actualFloor = floor - 1;
		} else {
			actualFloor = floor;
		}
		System.out.println("The elevator will travel to the actual floor " + actualFloor);
		bacon.close();
	}

}
