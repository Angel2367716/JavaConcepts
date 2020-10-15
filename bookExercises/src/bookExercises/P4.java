package bookExercises;

import java.util.Scanner;

//Show the message "Hello, name", displaying the name
//that the user typed in.

public class P4 {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in); // creates a scanner object
		System.out.println("What is your name?");

		String userName = myObj.nextLine();
		System.out.println("Your name is: " + userName);
	}
}
