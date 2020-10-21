package Module3;

import java.util.Scanner;

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
