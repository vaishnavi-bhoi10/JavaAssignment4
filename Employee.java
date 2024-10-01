package Assignment_4;
import java.util.Scanner;
public class Employee {
	private double salary;
	private int noHours;

	Scanner sc = new Scanner(System.in);

	public void getInfo() {
		System.out.println("Enter Salary");
		salary = sc.nextDouble();

		System.out.println("Enter Working Hours");
		noHours = sc.nextInt();
	}

	public void AddSal() {
		if (salary < 500)
			salary += 10;
	}

	public void AddWork() {
		if (noHours > 6)
			salary += 5;
	}

	public void finalSalary() {
		System.out.println("Final Salary:" + salary);
	}
}
