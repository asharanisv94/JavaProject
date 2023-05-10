package bankAbstractPackage;

import java.util.Scanner;

public class BankOperationsMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PersonAccount asha = new PersonAccount("A1000123", "Asha", 1000.0, "1234", "12345678");
		PersonAccount anu = new PersonAccount("A1000005", "Anu", 5000.0, "5555", "55555555");
		PersonAccount manu = new PersonAccount("A1000006", "Manu", 6000.0, "6666", "66666666");
		PersonAccount tinu = new PersonAccount("A1000007", "Tinu", 7000.0, "7777", "77777777");
		PersonAccount vinu = new PersonAccount("A1000008", "Vinu", 8000.0, "8888", "88888888");

		PersonAccount[] personArray = { asha, anu, manu, tinu, vinu };

		PersonAccount person = null;

		System.out.println("Enter your Account number");
		String accountNumberMain = sc.next();

		for (int i = 0; i < personArray.length; i++) {
			if (personArray[i].getAccountNumber().equalsIgnoreCase(accountNumberMain)) {
				person = personArray[i];
				break;
			}
		}

		BankOperations bank = null;
		bank = new ATM();

		int userInput;
		do {

			System.out.println("Select the type of Service you want 1.ATM  or 2.Online Banking");
			int selectedServiceType = sc.nextInt();
			switch (selectedServiceType) {

			case 1: {
				String newPin = null, oldPin;

				System.out.println("Enter your ATM pin");
				oldPin = sc.next();

				if (oldPin.equals(person.getPin())) {
					System.out.println("Correct PIN.");

					System.out.println("Do u want to change the PIN y/n");
					String isPinChangeRequired = sc.next();

					if (isPinChangeRequired.equalsIgnoreCase("y")) {
						System.out.println("Enter your new ATM pin");
						newPin = sc.next();
						bank.changePinPassword(person, oldPin, newPin);
					}

				} else {
					System.out.println("Incorrect PIN.");
					System.exit(0);
				}

				break;
			}
			case 2: {
				System.out.println("Enter your Online Password");
				String oldPassword = sc.next();
				if (oldPassword.equals(person.getOnlineBankingPassword())) {
					System.out.println("Correct password.");

					System.out.println("Do u want to change the password y/n");
					String ispasswordChangeRequired = sc.next();

					if (ispasswordChangeRequired.equalsIgnoreCase("y")) {

						System.out.println("Enter your new Online Password");
						String newPassword = sc.next();

						bank = new OnlineBanking();
						bank.changePinPassword(person, oldPassword, newPassword);

					}

				} else {
					System.out.println("Incorrect Password.");
					System.exit(0);

				}

				break;
			}
			}
			System.out.println("Enter 1 to Re-Login or 0 to Continue transaction");
			userInput = sc.nextInt();

		} while (userInput != 0);

		System.out.println("Account Holder Name: " + person.getAccountHolderName());
		System.out.println("Account Number: " + person.getAccountNumber());

		System.out.println("Please select your transaction 1. Deposit, 2. Withdraw, 3. View Balance");
		int transactionType = sc.nextInt();

		switch (transactionType) {
		case 1: {
			bank.viewBalance(person);
			System.out.println("Please enter deposit amount");
			int depositAmount = sc.nextInt();
			bank.deposit(person, depositAmount);
			bank.viewBalance(person);
			break;
		}
		case 2: {
			bank.viewBalance(person);
			System.out.println("Please enter  amount to be withdrawn");
			int withdrawAmount = sc.nextInt();
			bank.withdraw(person, withdrawAmount);
			bank.viewBalance(person);
			break;
		}
		case 3: {
			bank.viewBalance(person);
			break;
		}
		default: {
			System.out.println("invalid option");
		}

		}
	}

}
