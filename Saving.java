package Assignment_4;
import java.util.Scanner;
public class Saving {
	    private static double annualInterestRate; 
	    private double savingsBalance; 

	  
	    public Saving(double balance) {
	        savingsBalance = balance;
	    }

	    
	    public void calculateMonthlyInterest() {
	        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
	        savingsBalance += monthlyInterest; 
	    }

	   
	    public static void modifyInterestRate(double newRate) {
	        annualInterestRate = newRate; 
	    }

	    
	    public void displayBalance() {
	        System.out.printf("Current Balance: $%.2f%n", savingsBalance);
	    }
}
