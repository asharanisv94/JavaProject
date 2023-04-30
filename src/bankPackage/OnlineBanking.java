package bankPackage;

public class OnlineBanking extends BankOperation {
	private String onlineBankingPassword;

	public OnlineBanking(double initialDeposit, String onlineBankingPassword) {
		super(initialDeposit);
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public void isBankingPasswordCorrect(String enteredPassword) {
		if (onlineBankingPassword.equals(enteredPassword)) {
			System.out.println("Correct password.");
		} else {
			System.out.println("Incorrect Password.");
			System.exit(0);
		}

	}
}
