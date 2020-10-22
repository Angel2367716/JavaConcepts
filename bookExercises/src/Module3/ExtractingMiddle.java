package Module3;

import java.util.Scanner;

/**
 * The following program will extract a string containing the middle character
 * from a given string str. For ecample, if the string is "create", the result
 * is the string "a". However, if the string has an even number of letters, the
 * program will extract the middle two characters. If the string is "creates",
 * then the result will be "at".
 */
public class ExtractingMiddle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = in.next();
		in.close();

		int position;
		int length;

		/*
		 * We are using the reminder of division by 2 to find out wheter the value is
		 * even or odd
		 */
		if (str.length() % 2 == 1) {
			position = str.length() / 2;
			length = 1;
		} else {
			position = str.length() / 2 - 1;
			length = 2;
		}

		// the second parameter of the substring method is the first position that we do
		// not extract
		String result = str.substring(position, position + length);

		System.out.println("Middle of the string: " + result);

	}

}
