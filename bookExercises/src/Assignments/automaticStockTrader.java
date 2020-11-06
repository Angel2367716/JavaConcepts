package Assignments;

import java.util.Scanner;

/**
 * This program takes in 4 inputs from the user to determine if it would be more
 * profitable to sell, buy or hold shares
 *
 * @author angel
 *
 */

public class automaticStockTrader {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// current shares (cs), purchase price (pp), market price (mp), available funds
		// (af), total buy cost (tbc), number of shares to buy (nostb), number of shares
		// to sell (nosts), per share sell value (pssv), total sell value (tsv),
		// transaction fee (tf), current Market Price (cmp)
		int cs, pp, mp, af, tbc, nostb, nosts, pssv, tsv, tf = 10, cmp;

		do {
			String choice = null;
			displayMenu();
			cs = in.nextInt();
			pp = in.nextInt();
			mp = in.nextInt();
			af = in.nextInt();

			System.out.println("current shares: " + cs + "\n" + "purchase price: " + pp + "\n" + "market price: " + mp
					+ "\n" + "available funds: " + af + "\n");

			// Determine if you need to buy or sell
			// To buy cmp needs to be (+)
			// To sell cmp needs to be (-)
			cmp = pp - mp;

			if (cmp > 0) {
				choice = "buy or hold";
			} else if (cmp < 0) {
				choice = "sell or hold";
			} else {
				choice = "no Profit";
				System.out.println("There's no profit from selling or buying at this point");
			}

			// System.out.println(choice);

			switch (choice) {

			case "buy or hold":
				nostb = (int) Math.floor((af - tf) / mp);
				tbc = tf + mp * nostb;

				if (tbc == tf) {
					System.out.println("Hold shares" + "\n");
				} else if (tbc == af || tbc != tf) {
					System.out.println("Buy " + nostb + " shares" + "\n");
				} else {
					System.out.println("error");
				}
				break;
			case "sell or hold":
				pssv = mp - pp;
				tsv = pssv * cs;
				nosts = tsv - tf;

				if (nosts <= 0) {
					System.out.println("Hold shares" + "\n");
				} else {
					System.out.println("Sell " + nosts + " shares" + "\n");
				}

			default:

			}
		} while (cmp < 0 || cmp > 0);

		in.close();
	}

	// Options buy or sell
	private static void displayMenu() {
		System.out.println("Please enter the following information and press enter twice:");
		System.out.println("- current shares");
		System.out.println("- purchase price");
		System.out.println("- market price");
		System.out.println("- available funds");

	}

}
