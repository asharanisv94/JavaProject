package bankPackage;

public class ATM extends BankOperation {
	private int pin;

	public ATM(double initialDeposit, int pin) {
		super(initialDeposit);
		this.pin = pin;

	}

	public void isPinCorrect(int enteredPin) {
		if (enteredPin == pin) {
			System.out.println("Correct PIN.");
		} else if (enteredPin != pin) {
			System.out.println("Incorrect PIN.");
			System.exit(0);

		}
	}

}
