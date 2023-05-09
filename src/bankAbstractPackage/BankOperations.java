package bankAbstractPackage;

public abstract class BankOperations {
	protected double balance;

	public abstract void changePinPassword(String oldPin, String newPin);

	public BankOperations(double initialDeposit) {
		balance = initialDeposit;
	}

	public double deposit(double amount) {

		balance = balance + amount;
		System.out.println(amount + " Deposited Successfully.");
		return balance;
	}

	public double withdraw(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient Balance in account.  Withdrawal Failed.");

		} else {
			balance = balance - amount;
			System.out.println("Withdrawn amount  : " + amount + "\nNew Balance: " + balance);
		}

		return balance;
	}

	public double viewBalance() {
		System.out.println("Your Current Balance : " + balance);
		return balance;
	}
}
