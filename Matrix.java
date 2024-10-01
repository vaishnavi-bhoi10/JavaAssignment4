package Assignment_4;

public class Matrix {

	private int rows;
	private int cols;
	private int[][] elements;

	public Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		elements = new int[rows][cols]; // Initialize the 2D array
	}

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}

	public void setElement(int i, int j, int value) {
		if (i >= 0 && i < rows && j >= 0 && j < cols) {
			elements[i][j] = value;
		}
	}

	public int getElement(int i, int j) {
		if (i >= 0 && i < rows && j >= 0 && j < cols) {
			return elements[i][j];
		}
		return 0;
	}

	public void display() {
		for (int[] row : elements) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}

	public Matrix add(Matrix other) {
		if (this.rows != other.getRows() || this.cols != other.getCols()) {
			System.out.println("Matrices cannot be added");
		}

		Matrix result = new Matrix(this.rows, this.cols);
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
				result.setElement(i, j, this.getElement(i, j) + other.getElement(i, j));
			}
		}
		return result;
	}
}