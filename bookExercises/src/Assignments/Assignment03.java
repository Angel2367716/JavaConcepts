package Assignments;

import java.util.Scanner;

//CSE 110     : 76232 (Session B)
//Assignment  : 3
//Author      : Marco Angel
//Student ID  : 1202611535
//Description : This program determins if the user should buy, sell or hold their shares on the stock market according to input data

public class Assignment03 {

	public static void main(String[] args) {
		// declare and instantiate a Scanner
		Scanner in = new Scanner(System.in);

		// declare and initialize variables
		int currentShares;
		int purchasePrice, marketPrice, availableFunds;
		int totalBuyCost, numberOfSharesToBuy;
		int perShareSellValue, totalSellValue, numberOfSharesToSell;
		int transactionFee = 10;

		// prompt for and collect inputs
		System.out.println("Hello please answer the follwoing quesions and hit enter twice after each answer" + "\n");
		System.out.println("What are your current shares? ");
		currentShares = in.nextInt();
		System.out.println("What was the price of purchase? ");
		purchasePrice = in.nextInt();
		System.out.println("What is market price? ");
		marketPrice = in.nextInt();
		System.out.println("What are your available funds? ");
		availableFunds = in.nextInt();

		// display required outputs
		System.out.println("Current Shares: " + currentShares);
		System.out.println("Purchase Price (per share): " + purchasePrice);
		System.out.println("Market Price (per share): " + marketPrice);
		System.out.println("Available Funds:  " + availableFunds);

		// compute required values
		// currentMarketPrice
		int currentMarketPrice = purchasePrice - marketPrice;

		// Sell (-)
		// Profit (from selling) means negative value from the expression:
		// CMP = purchasePrice - marketPrice;
		// if CMP is (-) it menas it is better to sell than buy

		// Buy (+)
		// Selling will mean losing money, since the stocks are cheaper now
		// CPM = PP - MP
		// If CPM is (+) it means it is better to buy than sell

		// buy or hold
		if (currentMarketPrice > 0) {
			// calculate how many shares you can buy
			numberOfSharesToBuy = (int) Math.floor(availableFunds - transactionFee / marketPrice);
			// calculate total cost to buy shares including transactionFee
			totalBuyCost = transactionFee + marketPrice * numberOfSharesToBuy;

			// hold it
			if (totalBuyCost == transactionFee) {
				System.out.println("Hold shares");

				// buy them
			} else if (totalBuyCost == availableFunds || totalBuyCost != transactionFee) {
				System.out.println("Buy " + numberOfSharesToBuy + " shares");
			} else {
				System.out.println("Error");
			}

			// sell or hold
		} else if (currentMarketPrice < 0) {
			// calculate potential of selling stocks
			perShareSellValue = marketPrice - purchasePrice;

			// calculate total value of selling stocks including transactionFee
			totalSellValue = perShareSellValue * currentShares;

			// calculate how many shares you can sell
			numberOfSharesToSell = totalSellValue - transactionFee;

			// hold
			if (numberOfSharesToSell == 0) {
				System.out.println("Hold shares");
			} else {
				// sell
				System.out.println("Sell " + numberOfSharesToSell + " shares");
			}
		}

		in.close();

	}
}
