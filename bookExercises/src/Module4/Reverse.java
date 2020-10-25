package Module4;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s = in.next();
		in.close();
		String r = "";
		int i = 0;

		while (i < s.length()) {
			char c = s.charAt(i);
			r = c + r;
			i++;
		}
		System.out.println(r);
	}

}
