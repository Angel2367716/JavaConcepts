import java.util.Scanner;

/*------------------------------------------------------------
 * Author: Marco Angel
 * Filename: Lab2
 * Specification: This program takes two strings (firstname and lastname) and concatenates the strings tto make a full name
 * For: CSE 110 - Lab #2
 * Time Spent: 25 minutes
 ------------------------------------------------------------*/

public class Lab2 {

	public static void main(String[] args) {
		// declare variables of different types
		String firstName = "";
		String lastName = "";
		String fullName = "";
		int nameLength = 0;
		Scanner scan = new Scanner(System.in); // Don’t forget to import

		// Use Scanner to ask the user for first name
		System.out.print("Please enter first name: ");
		firstName = scan.nextLine();

		System.out.print("Please enter last name: ");
		lastName = scan.nextLine();
		scan.close();
		fullName = firstName + " " + lastName;

		nameLength = fullName.length();
		System.out.println("Full name (in capitals): " + fullName.toUpperCase());
		System.out.println("Length of full name: " + nameLength);

		// Define two String variables, title1 and title2 using
		// String constructor to initialize them
		String title1 = new String("cse110");
		String title2 = "cse110";

		// Compare the two strings and print which one of the two ways works
		// follow code below:
		if (title1 == title2) {
			// Print "String comparison using "==" sign works"
			// -->
			System.out.println("String comparison using \"==\" sign works");
		} else {
			// Print "String comparison using "==" sign does NOT work"
			// -->
			System.out.println("String comparison using \"==\" sign does NOT work");
		}
		if (title1.equals(title2)) {
			// print "String comparison using "equals" method works"
			// -->
			System.out.println("String comparison using \"equals\" method works");
		} else {
			// print "String comparison using "equals" method does NOT work"
			// -->
			System.out.println("String comparison using \"==\" sign does NOT work");
		}
	}

}
