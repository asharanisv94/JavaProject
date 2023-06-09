package phonePlanPackage;

import java.util.Arrays;
import java.util.Scanner;

public class PhonePlanSelect {
	String[] samsungModels = { "S22", "S22+", "S22ULTRA", "S22FE" };
	String[] appleModels = { "IPHONE14", "IPHONE 14 PRO", "IPHONE 14 PRO MAX", "IPHONE 14 MINI" };
	String[] plan = { "ROGERS", "BELL", "TELUS" };
	int[] samsungPrice = { 25, 35, 55, 20 };
	int[] applePrice = { 30, 40, 65, 25 };
	int[] planPrice = { 70, 80, 75 };

	int phoneTabPrice = 0;
	int phonePlanPrice = 0;
	int totalPrice = 0;

	String planSelected;
	String modelSelected;
	Scanner sc = new Scanner(System.in);

	void samsungPlanDetails() {
		boolean invalid = true;
		do {
			System.out.println("Enter the  SAMSUNG model you need");
			System.out.println(Arrays.toString(samsungModels));

			modelSelected = sc.nextLine();

			for (int i = 0; i < samsungModels.length; i++) {
				if (modelSelected.equalsIgnoreCase(samsungModels[i])) {
					phoneTabPrice = samsungPrice[i];
					System.out.println("Your phone price is" + phoneTabPrice);
					invalid = false;
				}

			}
			if (invalid == true)
				System.out.println("Invalid entry.Enter again!!!");
		} while (invalid == true);
	}

	void applePlanDetails() {
		boolean invalid = true;
		do {
			System.out.println("Enter the  APPLE model you need");
			System.out.println(Arrays.toString(appleModels));

			modelSelected = sc.nextLine();

			for (int i = 0; i < appleModels.length; i++) {
				if (modelSelected.equalsIgnoreCase(appleModels[i])) {
					phoneTabPrice = applePrice[i];
					System.out.println("Your phone price is" + phoneTabPrice);
					invalid = false;
				}
			}
			if (invalid == true)
				System.out.println("Invalid entry.Enter again!!!");
		} while (invalid == true);
	}

	void plan() {
		boolean invalid = true;

		do {
			System.out.println("Enter the  plan you need");
			System.out.println(Arrays.toString(plan));

			planSelected = sc.nextLine();

			for (int i = 0; i < plan.length; i++) {
				if (planSelected.equalsIgnoreCase(plan[i])) {
					System.out.println("You have selected " + modelSelected + " with " + plan[i]);
					phonePlanPrice = planPrice[i];
					System.out.println("The monthlly Plan will be " + phonePlanPrice);
					invalid = false;
				}
			}
			if (invalid == true) {
				System.out.println("Invalid entry.Enter again!!!");

			}
		} while (invalid == true);

		totalPrice = phoneTabPrice + phonePlanPrice;
		System.out.println("Total Monthly Amount is " + totalPrice);
	}
}
