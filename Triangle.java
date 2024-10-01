package Assignment_4;

public class Triangle {
	private int length;
	private int breadth;
	private int height;

	public Triangle(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public void findPerimeter() {
		System.out.println("Perimeter of Triangle :" + (length + breadth + height));
	}

	public void findArea() {
		System.out.println("Area of Triangle :" + ((length * breadth) / 2));

	}

}
