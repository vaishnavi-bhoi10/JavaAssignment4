package Assignment_4;
import java.util.Scanner;
public class TestComplext {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter real part of first complex number: ");
		double r1 = sc.nextDouble();
		System.out.print("Enter imaginary part of first complex number: ");
		double i1 = sc.nextDouble();
		Complex c1 = new Complex(r1, i1);

		// Input second complex number
		System.out.print("Enter real part of second complex number: ");
		double r2 = sc.nextDouble();
		System.out.print("Enter imaginary part of second complex number: ");
		double i2 = sc.nextDouble();
		Complex c2 = new Complex(r2, i2);

		// Perform operations
		Complex sum = c1.add(c2);
		Complex diff = c1.sub(c2);
		Complex prod = c1.mul(c2);

		// Display results
		System.out.print("Sum: ");
		sum.show();
		System.out.print("Difference: ");
		diff.show();
		System.out.print("Product: ");
		prod.show();
	}
}
