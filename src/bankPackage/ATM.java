package bankPackage;

public class ATM extends BankOperation {

	public ATM(double initialDeposit) {
		super.balance = initialDeposit;
	}

	@Override
	public double deposit(double amount) {

		balance = balance + amount;
		System.out.println(amount + " Deposited Successfully through ATM.");
		return balance;
	}

	@Override
	public double withdraw(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient Balance in account. ATM Withdrawal Failed.");

		} else {
			balance = balance - amount;
			System.out.println("Withdrawn amount through ATM: " + amount + "\nNew Balance: " + balance);
		}

		return balance;
	}

	@Override
	public double viewBalance() {
		System.out.println("Your Current Balance through ATM: " + balance);
		return balance;
	}

	public ATM() {

	}

}
