package userPassPackage;

import java.util.Scanner;

public class StudentLogin {
	String userId;
	String password;
	int count;

	void LoginCheck() {
		Scanner sc = new Scanner(System.in);

		for (count = 1; count <= 3; count++) {

			System.out.print("Enter user id: ");
			userId = sc.nextLine();

			System.out.print("Enter password: ");
			password = sc.nextLine();

			if (userId.equals("pivotAdmin") && password.equals("Admin123")) {
				System.out.println("You are logged in to the application.");
				break;
			} else {
				System.out.println("Incorrect User id or password. Try again.");
				if (count == 3) {
					System.out.println("Account locked.");
				}

			}
		}
	

	}
}
