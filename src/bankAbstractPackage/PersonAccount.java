package bankAbstractPackage;

public class PersonAccount {

	private String accountNumber, accountHolderName, onlineBankingPassword;
	private double availableFunds;
	private String pin;

	public PersonAccount(String accountNumber, String accountHolderName, double availableFunds, String pin,
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

	public String getPin() {
		return pin;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void setPassword(String password) {
		this.onlineBankingPassword = password;

	}

}
