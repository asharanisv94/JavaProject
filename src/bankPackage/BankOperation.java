package bankPackage;

public class BankOperation {
	private double balance;

	BankOperation(double availableBalance) {
		this.balance = availableBalance;
	}

	public double deposit(double amount) {
		balance = balance + amount;
		System.out.println(amount + " Deposited Successfully.");
		return balance;
	}

	public double withdraw(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient Balance in account . Withdrawal Failed.");

		} else {
			balance = balance - amount;
			System.out.println("Withdrawn amount" + amount + " \n New Balance: " + balance);
		}

		return balance;
	}

	public double viewBalance() {
		System.out.println("Your Current Balance: " + balance);
		return balance;
	}
}
