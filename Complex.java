package Assignment_4;

public class Complex {
	private double r; // Real part
	private double i; // Imaginary part

	public Complex(double r, double i) {
		this.r = r;
		this.i = i;
	}
	public Complex add(Complex c) {
		return new Complex(this.r + c.r, this.i + c.i);
	}

	public Complex sub(Complex c) {
		return new Complex(this.r - c.r, this.i - c.i);
	}

	public Complex mul(Complex c) {
		return new Complex(this.r * c.r - this.i * c.i, this.r * c.i + this.i * c.r);
	}

	public void show() {
		{
			System.out.print(r);
			if (i >= 0) {
				System.out.print(" + " + i + "i");
			} else {
				System.out.print(" - " + Math.abs(i) + "i");
			}
			System.out.println();
		}

	}
}
