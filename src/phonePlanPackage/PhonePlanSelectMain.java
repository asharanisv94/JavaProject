package phonePlanPackage;

import java.util.Scanner;

public class PhonePlanSelectMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhonePlanSelect p = new PhonePlanSelect();
		boolean invalid = true;
		do {
			System.out.println("Enter the  type of OS required ANDROID or IOS");

			String OS = sc.nextLine();

			if (OS.equalsIgnoreCase("Android")) {
				invalid = false;
				p.samsungPlanDetails();
				p.plan();

			} else if (OS.equalsIgnoreCase("IOS")) {
				invalid = false;
				p.applePlanDetails();
				p.plan();
			} else {
				invalid = true;
				System.out.println("Invalid Input");
			}

		} while (invalid == true);

	}
}
