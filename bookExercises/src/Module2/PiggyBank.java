package Module2;

public class PiggyBank {

	public static void main(String[] args) {
		int pennies = 1729;
		int dollars = pennies / 100;
		int cents = pennies % 100;

		System.out.println("Dollars: " + dollars);
		System.out.println("Cents: " + cents);

	}

}
