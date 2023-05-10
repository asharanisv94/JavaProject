package bankAbstractPackage;

public class ATM extends BankOperations {

	@Override
	public void changePinPassword(PersonAccount person, String oldPin, String newPin) {
		if (newPin.equals(oldPin)) {
			System.out.println("Entered Pin same as old PIN.Try again and please enter a new pin");
			System.exit(0);

		} else if (newPin.length() < 4) {
			System.out.println(" ERROR!!!PIN should be at least 4 characters.");
			System.exit(0);

		} else  {
			person.setPin(newPin);
			System.out.println("PIN changed successfully.Login again to continue transactions");
			System.out.println("____________________________________________");
		}

	}
}
