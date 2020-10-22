package Module3;

import java.util.Scanner;

/**
 * The following program will read a word and print wheter it is short (fewer
 * than 5 letters), long (at least 10 letters) or wheter it ends with the letter
 * y.
 *
 * For simplicify of code use the following words to test it (eve, beautifully,
 * wiley)
 */
public class WordProperties {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = in.next();

		// short word
		if (word.length() < 5) {
			System.out.println(word + " is short");
		}

		// long word
		if (word.length() >= 10) {
			System.out.println(word + " is long");
		}

		// checking for last letter
		if (word.substring(word.length() - 1).contentEquals("y")) {
			System.out.println(word + " ends in a y");
		}

	}

}
