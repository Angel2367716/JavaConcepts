package Module2;

public class BasicConsoleOutputAndInput {

	public static void main(String[] args) {
		int a = 123;
		double x = 123.456;
		System.out.println("basic console output");// basic console output
		System.out.println(a);
		System.out.println(x);
		System.out.println();
		System.out.println("simple formatted console output");// simple formatted console output
		System.out.printf("%d", a);
		System.out.println();
		System.out.printf("%f", x);
		System.out.println('\n');

		System.out.println("formatted console output with width and precision");// formatted console output with width
																				// and precision
		System.out.printf("%10d", a);
		System.out.println();
		System.out.printf("%10.2f", x);
		System.out.println('\n');

		System.out.println("formatted console output with interpolation and newlines");// formatted console output with
																						// interpolation and newlines
		System.out.printf("a = %d%n", a);
		System.out.printf("x = %f%n", x);
		System.out.printf("a = %d and x = %.2f.%n", a, x);
		System.out.println('\n');

	}

}
