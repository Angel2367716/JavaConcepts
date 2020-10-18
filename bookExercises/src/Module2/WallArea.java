package Module2;

import java.util.Scanner;

/**
 * In order to pain t a wall that has a number fo windows, we want to know its
 * area. Each window has a size of 2ft by 3ft. Write a program that reads the
 * width and height of the call and the number of windows, using the prompts:
 * Wall width: Wall height: Number of windows: Then print the area
 */

public class WallArea {

	public static void main(String[] args) {

		// Declare a scanner
		Scanner in = new Scanner(System.in);
		// Prompt for and read the width and height
		// and the number of windows
		System.out.print("Wall width: ");
		double width = in.nextDouble();

		System.out.print("Wall height: ");
		double height = in.nextDouble();
		System.out.print("Number of windows: ");

		int windows = in.nextInt();
		final double WINDOW_AREA = 2 * 3;

		// Compute the area of the wall without the windows
		double windowsArea = windows * WINDOW_AREA;
		double area = (width * height) - windowsArea;
		System.out.println("Area: " + area);

	}

}
