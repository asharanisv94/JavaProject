package phonePlanPackage;

import java.util.Scanner;

public class PhonePlanSelectMain {

	public static void main(String[] args) {
		PhonePlanSelect p = new PhonePlanSelect();
		System.out.println("Enter the  type of OS required ANDROID or IOS");
		Scanner sc = new Scanner(System.in);
		String OS = sc.nextLine();
		if (OS.equalsIgnoreCase("Android")) {
			p.samsungPlanDetails();
			p.plan();

		} else if (OS.equalsIgnoreCase("IOS")) {
			p.applePlanDetails();
			p.plan();
		} else {
			System.out.println("Invalid Input");
		}
	}
}
