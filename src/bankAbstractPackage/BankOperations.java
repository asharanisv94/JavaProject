package bankAbstractPackage;

public abstract class BankOperations {

	public abstract void changePinPassword(PersonAccount person, String oldPin, String newPin);

	public double deposit(PersonAccount person, double amount) {
		person.setAvailableFunds(person.getAvailableFunds() + amount);
		System.out.println(amount + " Deposited Successfully.");
		return person.getAvailableFunds();
	}

	public double withdraw(PersonAccount person, double amount) {
		if (person.getAvailableFunds() < amount) {
			System.out.println("Insufficient Balance in account.  Withdrawal Failed.");

		} else {
			person.setAvailableFunds(person.getAvailableFunds() - amount);
			System.out.println("Withdrawn amount  : " + amount + "\nNew Balance: " + person.getAvailableFunds());
		}

		return person.getAvailableFunds();
	}

	public double viewBalance(PersonAccount person) {

		System.out.println("Your Current Balance : " + person.getAvailableFunds());
		return person.getAvailableFunds();
	}
}
