package Module2;

import java.util.Scanner;

public class VendingMachineChange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// declare variables
		int billDenomination = 0;
		int itemPrice = 0;
		int changeDue = 0;
		int dollarCoins = 0;
		int quarters = 0;

		// get inputs
		System.out.print("Enter denomination of bill -->");
		billDenomination = in.nextInt();
		System.out.print("Enter item price in pennies-->");
		itemPrice = in.nextInt();
		in.close();

		// Calculate the change due
		changeDue = 100 * billDenomination - itemPrice;

		// Calculate the number of dollar coins to return
		dollarCoins = changeDue / 100;
		changeDue = changeDue % 100;

		// Calculate the number of quarters to return
		quarters = changeDue / 25;

		// output results
		System.out.printf("Returnning %d dollar coins", dollarCoins);
		System.out.printf(" and %d quarters.%n", quarters);
	}

}
