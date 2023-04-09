
package loopsDemo;

import java.util.Scanner;

public class ForLoopExample {

	// PIN should be locked if entered incorrectly 3 times

	int actualPIN = 1234;
	int enteredPIN;
	int withdrawAmount;
	int balance = 10000;

	Scanner sc = new Scanner(System.in);

	void checkPinIsCorrect() {

		for (int counter = 1; counter <= 3; counter++) {
			System.out.println("Enter the PIN");
			enteredPIN = sc.nextInt();
			if (actualPIN == enteredPIN) {

				System.out.println("Entered PIN is correct");
				System.out.println("Enter the amount to be withdrawn:");
				withdrawAmount = sc.nextInt();

						if (balance >= withdrawAmount) {
							System.out.println("Cash withdrawn in amount of: " + withdrawAmount);
							System.out.println("Please collect the amount");
		
							break;
		
						} else {
							System.out.println("Insufficient balance");
							System.out.println("Current account balance is 10000");
		
						}

				break;
			}

			else {
				System.out.println("Entered PIN is incorrect");
				if (counter == 3)
					System.out.println("Pin entered 3 times.Card locked");
			}
		}

	}
}
