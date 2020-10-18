package Module2;

import java.util.Scanner;

/**
 * "Complete this program to print a table of prices. The first column has width
 * 8 and the second column has width 10. Print the prices with two digits after
 * the decimal point"
 */
public class Table {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Unit price: %d");
		double price = in.nextDouble();

		System.out.println("Quantity     Price");
		int quantity = 1;
		System.out.printf("%d4.2f, %d10.2f", quantity, quantity * price);
		quantity = 12;
		System.out.printf("%d4.2f, %d10.2f", quantity, quantity * price);
		quantity = 100;
		System.out.printf("%d4.2f, %d10.2f", quantity, quantity * price);
	}
}
