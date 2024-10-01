package Assignment_4;
public class TestSaving {
	public static void main(String[] args) {
		Saving saver1 = new Saving(2000.00);
		Saving saver2 = new Saving(3000.00);

		Saving.modifyInterestRate(0.03);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		saver1.displayBalance();
		saver2.displayBalance();

		Saving.modifyInterestRate(0.04);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.println("Balances after 4% interest:");
		saver1.displayBalance();
		saver2.displayBalance();
	}
}
