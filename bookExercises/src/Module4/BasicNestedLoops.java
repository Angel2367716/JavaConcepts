package Module4;

public class BasicNestedLoops {

	public static void main(String[] args) {
		int x = 1;

		while (x <= 3) {
			int y = 1;

			while (y <= 4) {
				System.out.println(x + " times " + y + " is " + (x * y));
				y++;
			}
			System.out.println("----------------");
			x++;
		}

		System.out.println();
		System.out.println("height nested loop");
		int height = 3;

		while (height > 0) {
			int width = 4;
			while (width > 0) {
				System.out.print("*");
				width--;
			}
			System.out.println();
			height--;
		}
	}

}
