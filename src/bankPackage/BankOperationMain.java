package bankPackage;

import java.util.Scanner;

public class BankOperationMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PersonAccount pa = new PersonAccount("A1000123", "Asha", 1000.0, 1234, "12345678");

		BankOperation bo = new BankOperation(pa.getAvailableFunds());

		System.out.println("Select the type of Service you want 1.ATM  or 2.Online Banking");
		int selectedServiceType = sc.nextInt();
		switch (selectedServiceType) {
		case 1: {
			System.out.println("Enter your PIN:");
			int enteredPin = sc.nextInt();
			ATM atm = new ATM(pa.getAvailableFunds(), pa.getPin());
			atm.isPinCorrect(enteredPin);
			break;
		}
		case 2: {
			System.out.println("Enter your Online Banking Password:");
			String enteredPassword = sc.next();
			OnlineBanking ob = new OnlineBanking(pa.getAvailableFunds(), pa.getOnlineBankingPassword());
			ob.isBankingPasswordCorrect(enteredPassword);
			break;
		}
		}

		System.out.println("Account Holder Name: " + pa.getAccountHolderName());
		System.out.println("Account Number: " + pa.getAccountNumber());

		System.out.println("Please select your transaction 1. Deposit, 2. Withdraw, 3. View Balance");
		int transactionType = sc.nextInt();

		switch (transactionType) {
		case 1: {
			bo.viewBalance();
			System.out.println("Please enter deposit amount");
			int depositAmount = sc.nextInt();
			bo.deposit(depositAmount);
			bo.viewBalance();
			break;
		}
		case 2: {
			bo.viewBalance();
			System.out.println("Please enter  amount to be withdrawn");
			int withdrawAmount = sc.nextInt();
			bo.withdraw(withdrawAmount);
			bo.viewBalance();
			break;
		}
		case 3: {
			bo.viewBalance();
			break;
		}
		}

	}
}
