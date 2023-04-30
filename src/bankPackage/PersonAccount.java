package bankPackage;

public class PersonAccount {

	private String accountNumber, accountHolderName, onlineBankingPassword;
	private double availableFunds;
	private int pin;

	public PersonAccount(String accountNumber, String accountHolderName, double availableFunds, int pin,
			String onlineBankingPassword) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.availableFunds = availableFunds;
		this.pin = pin;
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAvailableFunds() {
		return availableFunds;
	}

	public int getPin() {
		return pin;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}
}
