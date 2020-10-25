package Module4;

import java.util.Scanner;

public class Sec04_DoLoop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double value;
		do {
			System.out.print("Enter a number >= 0: ");
			value = in.nextDouble();
		} while (value < 0);
		double root = Math.sqrt(value);
		System.out.println("The square root of the number is " + root);
	}

}
