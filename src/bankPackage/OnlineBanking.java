package bankPackage;

public class OnlineBanking extends BankOperation {

	public OnlineBanking(double initialDeposit) {
		super.balance = initialDeposit;
	}

	@Override
	public double deposit(double amount) {

		balance = balance + amount;
		System.out.println(amount + " Deposited Successfully through Online Banking.");
		return balance;
	}

	@Override
	public double withdraw(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient Balance in account. Withdrawal Failed through Online Banking.");

		} else {
			balance = balance - amount;
			System.out.println("Withdrawn amount through Online Banking: " + amount + " \nNew Balance: " + balance);
		}

		return balance;
	}

	@Override
	public double viewBalance() {
		System.out.println("Your Current Balance through Online Banking: " + balance);
		return balance;
	}

}
