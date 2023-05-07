package bankAbstractPackage;

public class ATM extends BankOperations {

	public ATM(double initialDeposit) {
		super(initialDeposit);
	}

	@Override
	public void changePinPassword(String oldPin, String newPin) {
		if (newPin.equals(oldPin)) {
			System.out.println("Entered Pin same as old PIN.Try again and please enter a new pin");
			System.exit(0);
			return;

		}
		if (newPin.length() < 4) {
			System.out.println(" ERROR!!!PIN should be at least 4 characters.");
			System.exit(0);
			return;

		}
		if (!newPin.equals(oldPin) && newPin.length() >= 4) {

		}
		System.out.println("PIN changed successfully.Login again to continue transactions");
		System.out.println("____________________________________________");
	}

}
