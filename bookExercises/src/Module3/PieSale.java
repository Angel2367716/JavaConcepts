package Module3;

import java.util.Scanner;

/**
 * "It is March 14, and the bakery is holding a pie sale. All pies with a
 * regular price of $10 or more are $3.14 off. All others are $1.00 off. Write a
 * program that reads the price of a pie and prints the discounted price." *
 */
public class PieSale {

	public static void main(String[] args) {
		Scanner bacon = new Scanner(System.in);
		System.out.print("Original price: ");
		double price = bacon.nextDouble();
		double discountedPrice;

		if (price < 10) {
			discountedPrice = price - 1.00;
		} else {
			discountedPrice = price - 3.14;
		}
		System.out.printf("Discounted price: %.2f\n", discountedPrice);
		bacon.close();
	}

}
