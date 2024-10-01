package Assignment_4;

public class TestTime {

	public static void main(String[] args) {
		
		Time time1 = new Time(12, 30, 45);
		time1.display();
		System.out.println("---------------------------------");
		Time time2 = new Time(25, 61, 70); // Invalid input
		time2.display(); // Should display warnings and default to 00:00:00
		System.out.println("---------------------------------");
		Time time3 = new Time(); // Default constructor
		time3.display(); // Displays: Time: 00:00:00
	}

}
