package Labs;
/*-------------------------------------------------------------
//AUTHOR: your name.
//FILENAME: title of the source file.
//SPECIFICATION: your own description of the program.
//FOR: CSE 110- Lab #4
//TIME SPENT: how long it took you to complete the assignment.
//-----------------------------------------------------------*/

//Import Scanner class
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		int summation = 0, factorial = 1, leftmost = 0;
		int choice = 0;
//		int i = 0;
		Scanner in = new Scanner(System.in);

		do {
			// Display the menu
			displayMenu();

			// Ask the user for one option
			// System.out.print("Enter a number: ");
			choice = in.nextInt();

			switch (choice) {
			// Define four cases for different options. Don't forget "break".
			case 1:
				System.out.println("Enter a number: ");
				int sumInput = in.nextInt();

				for (int j = 0; j <= sumInput; j++) {
					summation = summation + j;
				}
				System.out.println("The sum of 1 to " + sumInput + " is " + summation + "\n");

				break;

			case 2:
				System.out.println("Enter a number: ");
				int factNumber = in.nextInt();

				for (int h = 1; h <= factNumber; h++) {
					factorial = factorial * h;
				}
				System.out.println("The factorial of " + factNumber + " is " + factorial + "\n");

				break;

			case 3:
				System.out.println("Enter a number: ");
				int leftNum = in.nextInt();

				System.out.println("The leftmost digit of  " + leftNum + " is " + factorial + "\n");

				break;

			case 4:
				System.out.println("quit");
				break;

			}
		} while (choice < 0 && choice > 4);
		System.out.println("Thank you for playing!");

	}

	/**
	 * Print the menu
	 */
	private static void displayMenu() {
		System.out.println("Please choose one option from the following menu:");
		System.out.println("1) Calculate the sum of integers from 1 to m");
		System.out.println("2) Calculate the factorial of a given number");
		System.out.println("3) Display the leftmost digit of a given number");
		System.out.println("4) Quit");

	}

}