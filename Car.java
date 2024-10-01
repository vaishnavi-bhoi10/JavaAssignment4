package Assignment_4;
import java.util.*;
public class Car {
	private String carModel;
	private String carName;
	private double carPrice;
	private String carOwner;

	 public void accept() {
	        Scanner sc = new Scanner(System.in);
	       
	        System.out.print("Enter Car Model: \n");
	        carModel = sc.next();
	        
	        System.out.print("Enter Car Name: \n");
	        carName = sc.next();
	        
	        System.out.print("Enter Car Price: \n");
	        carPrice = sc.nextDouble();
	        
	        System.out.print("Enter Car Owner: \n");
	        carOwner = sc.next();
	    }
	public void display() {
		System.out.println("Car Model: " + carModel);
		System.out.println("Car Name: " + carName);
		System.out.println("Car Price: " + carPrice);
		System.out.println("Car Owner Name: " + carOwner);
	}

}
