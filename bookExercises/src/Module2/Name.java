package Module2;

import java.util.Scanner;

/*
 * "Write a program that reads in the first and last name of a person and prints the last name, followed by a comma, a space, and the first name. For example:
		Please enter your first and last name: Harry Potter
		Potter, Harry
 */

public class Name {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your first and last name: ");

		// Read in the first and last name
		String firstName = in.next();
		String lastName = in.next();

		// Print the last name, a comma, a space, and the first name

		System.out.println(lastName + "," + " " + firstName);

	}

}
