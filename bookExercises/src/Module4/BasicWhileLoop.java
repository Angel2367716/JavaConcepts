package Module4;

public class BasicWhileLoop {

	public static void main(String[] args) {
		int count = 0;

		while (count <= 3) {
			System.out.println(count);
			count = count + 1;
		}
		System.out.println("Done!");

		System.out.println();
		System.out.println("Count down from 10 to 0 by 3s");
		int counting = 10;

		while (counting >= 0) {
			System.out.println(counting);
			counting = counting - 3;
		}
		System.out.println("Done!");

	}

}
