/*------------------------------------------------------------
 * CSE 110              : 76232 (Session B)
 * Assignment           : 1
 * Author               : Marco Angel
 * Student ID           : 1202611535
 * Description          : This program determines how to split a number of pizzas (each with the same number of slices)
 *                        among a group of adults and children at a pizza party.
 ------------------------------------------------------------*/

import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		// declare and instantiate a Scanner
		Scanner scan = new Scanner(System.in);

		/*------------------------------------------------------------*/
		// declare and initialize variables
		int pizzasPurchased;
		int slicesPerPizza;
		int adults;
		int children;
		int totalSlicesPerPizza;
		int totalAdultPizzaSlices;
		final int slicesPerAdult = 2;
		int availableSlicesForChildren;
		int slicesPerChild;
		int totalChildrenPizzaSlices;
		int leftOverSlices;

		/*------------------------------------------------------------*/
		// prompt for and collect inputs
		System.out.print("Number of pizzas purchased: ");
		pizzasPurchased = scan.nextInt();

		System.out.print("Number of slices per pizza: ");
		slicesPerPizza = scan.nextInt();

		System.out.print("Number of adults: ");
		adults = scan.nextInt();

		System.out.print("Number of children: ");
		children = scan.nextInt();
		scan.close();

		/*------------------------------------------------------------*/
		// compute required values

		// total number of slices of pizza
		totalSlicesPerPizza = pizzasPurchased * slicesPerPizza;

		// Total number of slices given to adults
		totalAdultPizzaSlices = adults * slicesPerAdult;

		// Remaining slices for children
		availableSlicesForChildren = totalSlicesPerPizza - totalAdultPizzaSlices;

		// Equal slices of pizza for each child
		slicesPerChild = availableSlicesForChildren / children;

		// Left over slices
		totalChildrenPizzaSlices = children * slicesPerChild;
		leftOverSlices = totalSlicesPerPizza - (totalChildrenPizzaSlices + totalAdultPizzaSlices);

		/*------------------------------------------------------------*/
		// display required outputs
		System.out.println();
		System.out.println("Total number of slices of pizza: " + totalSlicesPerPizza);
		System.out.println("Total number of slices given to adults: " + totalAdultPizzaSlices);
		System.out.println("Total number of slices available for children: " + availableSlicesForChildren);
		System.out.println("Number of slices each child will get: " + slicesPerChild);
		System.out.println("Number of slices left over: " + leftOverSlices);
	}

}
