package Labs;

import java.util.Scanner;

/*------------------------------------------------------------
 * Author: Marco Angel
 * Filename: Lab1
 * Specification: This program takes 3 test grades and returns the average test grade
 * For: CSE 110 - Lab #1
 * Time Spent: 25 minutes
 *------------------------------------------------------------*/
public class Lab1 {

	public static void main(String[] args) {
		int test1, test2, test3;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the score of the first test: ");
		test1 = input.nextInt();

		System.out.print("Enter the score of the second test: ");
		test2 = input.nextInt();

		System.out.print("Enter the score of the third test: ");
		test3 = input.nextInt();
		input.close();

		final int NUM_TESTS = 3;

		double average;
		average = (test1 + test2 + test3) / (double) NUM_TESTS;

		System.out.println("");
		System.out.println("Your first test score: " + test1);
		System.out.println("Your second test score: " + test2);
		System.out.println("Your third test score: " + test3);
		System.out.println("Your average test score: " + average);

	}

}
