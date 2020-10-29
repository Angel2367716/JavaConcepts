package Labs;
/*-------------------------------------------------------------
//AUTHOR: Marco Angel
//FILENAME: Lab4
//SPECIFICATION: This program performs three different arithmetic operations based on user's input
//FOR: CSE 110- Lab #4
//TIME SPENT: 4 hours
//-----------------------------------------------------------*/

//Import Scanner class
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		int choice;
		boolean quit = false;
		Scanner in = new Scanner(System.in);

		do {
			// Display the menu
			displayMenu();

			// Ask the user for one option
			choice = in.nextInt();

			switch (choice) {
			// Define four cases for different options. Don't forget "break".
			case 1:
				System.out.println("Enter a number: ");
				int sumInput = in.nextInt();
				findSummation(sumInput);
				break;

			case 2:
				System.out.println("Enter a number: ");
				int factNumber = in.nextInt();
				findFactorial(factNumber);
				break;

			case 3:
				System.out.println("Enter a number: ");
				int enteredNum = in.nextInt();
				findLeftMost(enteredNum);
				break;

			case 4:
				quit = true;
				break;
			default:
				System.out.println("Please enter a number from the list" + "\n");

			}

		} while (!quit);
		System.out.println("Thank you for playing!");

		in.close();
	}

	// Methods -----------------------------------------------------------*/

	/**
	 * Evaluates the summation of a number entered
	 *
	 * @param sumInput
	 * @return summation of user input
	 */

	private static int findSummation(int sumInput) {
		int summation = 0;
		for (int i = 0; i <= sumInput; i++) {
			summation = summation + i;
		}
		System.out.println("The sum of 1 to " + sumInput + " is " + summation + "\n");
		return summation;
	}

	/**
	 * Evaluates the factorial of a number entered
	 *
	 * @param factNumber
	 * @return factorial number
	 */

	private static int findFactorial(int factNumber) {
		int factorial = 1;
		for (int i = 1; i <= factNumber; i++) {
			factorial = factorial * i;
		}
		System.out.println("The factorial of " + factNumber + " is " + factorial + "\n");
		return factorial;
	}

	/**
	 * Evaluates the leftmost digit from an inputted integer
	 *
	 * @param enteredNum
	 * @return leftmost digit of an integer
	 */
	private static int findLeftMost(int enteredNum) {
		int leftmost = 1;
		int num = enteredNum;
		while (num > 9) {
			num = num / 10;
			leftmost = num;

		}
		System.out.println("The leftmost digit of " + enteredNum + " is " + leftmost + "\n");
		return leftmost;
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
