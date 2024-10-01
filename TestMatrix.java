package Assignment_4;
import java.util.*;
public class TestMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int cols = scanner.nextInt();
	        
	        Matrix matrix1 = new Matrix(rows, cols);

	        
	        System.out.println("Enter the elements of the first matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Element at (" + i + ", " + j + "): ");
	                int value = scanner.nextInt();
	                matrix1.setElement(i, j, value);
	            }
	        }

	       
	        Matrix matrix2 = new Matrix(rows, cols);
	        System.out.println("Enter the elements of the second matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Element at (" + i + ", " + j + "): ");
	                int value = scanner.nextInt();
	                matrix2.setElement(i, j, value);
	            }
	        }

	        
	        Matrix result = matrix1.add(matrix2);
	        if (result != null) {
	            System.out.println("Resulting Matrix after addition:");
	            result.display();
	        }
	}
}


