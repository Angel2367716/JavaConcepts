package Module2;

/**
 * This program computes the price per liter of a six-pack of soda cans
 *
 */

public class PriceDemo {

	public static void main(String[] args) {
		int cansPerPack = 6;
		final double CAN_VOLUME = 0.355; // Liters in a 12-ounce can
		double totalVolume = cansPerPack * CAN_VOLUME;

		double pricePerPack = 2.59;

		double pricePerLiter = pricePerPack / totalVolume;

		System.out.println("Price per liter: " + pricePerLiter);
		// The integer part of the price gives the whole dollars.

		int dollars = (int) pricePerLiter;

		System.out.println("Dollars: " + dollars);
		// Multiply by 100 and round to the nearest integer to get the
		// price in pennies.

		int pennies = (int) Math.round(pricePerLiter * 100);
		System.out.println("Pennies: " + pennies);

		// The cents are the last two digits of this value.

		int cents = pennies % 100;
		System.out.println("Cents: " + cents);
	}

}
