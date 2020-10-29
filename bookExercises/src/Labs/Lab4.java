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
		int summation = 0, factorial = 1, leftmost = 1;
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

				for (int i = 0; i <= sumInput; i++) {
					summation = summation + i;
				}
				System.out.println("The sum of 1 to " + sumInput + " is " + summation + "\n");

				break;

			case 2:
				System.out.println("Enter a number: ");
				int factNumber = in.nextInt();

				for (int i = 1; i <= factNumber; i++) {
					factorial = factorial * i;
				}
				System.out.println("The factorial of " + factNumber + " is " + factorial + "\n");

				break;

			case 3:
				System.out.println("Enter a number: ");
				int enteredNum = in.nextInt();
				int num = enteredNum;

				// getting the first digit of an integer
				while (num > 9) {
					num = num / 10;
					leftmost = num;

				}

				System.out.println("The leftmost digit of  " + enteredNum + " is " + leftmost + "\n");

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
