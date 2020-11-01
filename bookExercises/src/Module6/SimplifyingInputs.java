package Module6;

import java.util.Scanner;

public class SimplifyingInputs {

	public static void main(String[] args) {
		double price = getInput("First item");
		price = price + getInput("Second item");
		double rate = getInput("Tax rate in percent ");
		double tax = price * rate / 100;
		System.out.println("Ammount due: " + (price + tax));
	}

	public static double getInput(String prompt) {
		Scanner in = new Scanner(System.in);
		System.out.println(prompt + ": ");
		return in.nextDouble();
	}

}
