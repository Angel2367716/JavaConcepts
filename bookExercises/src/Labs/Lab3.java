package Labs;

import java.util.Scanner;

/*------------------------------------------------------------
 * Author: Marco Angel
 * Filename: Lab1
 * Specification: This program takes
 * For: CSE 110 - Lab #3
 * Time Spent: not available
 *------------------------------------------------------------*/

public class Lab3 {

	public static void main(String[] args) {
		// This scanner is prepared for you to get inputs
		Scanner scanner = new Scanner(System.in);
		// Declare three variables for HW, midterm, and final exam grades
//		double homework = scanner.nextDouble(), midterm = scanner.nextDouble(), finalExam = scanner.nextDouble();
		double homework = 0, midterm = 0, finalExam = 0;

		// Declare a loop control variable i
		int i = 0;

		while (i < 3) {
			// Design if-else control flow:
			if (i == 0) {
				// Ask the user for homework grade
				System.out.print("Enter your Homework grade: ");
				homework = scanner.nextDouble();

				// Do input validation
				// -->
				if (homework < 0 || homework > 100) {
					// Show the error message
					System.out.println("Please enter a valid homework grade");
				} else {
					// Update the loop variable
					System.out.println("input accepted");
					i++;
				}
			}
			if (i == 1) {
				System.out.print("Enter your Midterm Exam grade: ");
				midterm = scanner.nextDouble();

				// The other two if-else statments go here
				// -->
				if (midterm < 0 || midterm > 100) {
					System.out.println("Please enter a valid midterm grade");

				} else {
					System.out.println("midterm accepted");
					i++;
				}

			}
			if (i == 2) {
				System.out.print("Enter your Final Exam grade: ");
				finalExam = scanner.nextDouble();

				// if else staments
				if (finalExam < 0 || finalExam > 200) {
					System.out.println("Plsease enter a valid final exam grade");
				} else {
					System.out.println("final exam accepted");
					i++;
				}

			}
		} // End of While loop

		// Calculate the weighted total by the formula showed in the PDF
		double weigthed_total = (finalExam / 200 * 50) + (midterm * 0.25) + (homework * 0.25);

		// Show the weighted total and tell the user s/he passed or not
		// -->
		if (weigthed_total >= 50) {
			// Print "the student PASSED the class."
			System.out.println("the student PASSED the class");
		} else {
			// Print "the student FAILED the class."
			System.out.println("the student FAILED the class.");
		}

		scanner.close();
	} // End of main
} // End of class
