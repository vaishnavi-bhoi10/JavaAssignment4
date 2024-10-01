package Assignment_4;
import java.util.Scanner;
public class NewEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		employee.getInfo();
		employee.AddSal();
		employee.AddWork();
		employee.finalSalary();
	}

}
