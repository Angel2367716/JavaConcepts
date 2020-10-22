package Module3;

import java.util.Scanner;

public class PluralOfAnEnglishWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = in.next();
		in.close();
		int lastPosition = word.length() - 1;
		char last = word.charAt(lastPosition);
		char before = word.charAt(lastPosition - 1);
		String plural;

		if (word.endsWith("ch") || word.endsWith("s") || word.endsWith("sh") || word.endsWith("x")
				|| word.endsWith("z")) {
			// line 15
			plural = word + "es";
		} else if (!(before == 'a' || before == 'e' || before == 'i' || before == 'o' || before == 'u')
				&& last == 'y') {
			// line 19
			plural = word.substring(0, lastPosition) + "ies";
		} else {
			plural = word + "s";
		}
		System.out.println(plural);

	}

}
