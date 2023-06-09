package pizzaPackage;

import java.util.Arrays;
import java.util.Scanner;

public class PizzaBill {

	String[] cheesePizza = { "small", "medium", "large" };
	int[] pizzaPrice = { 15, 20, 25 };
	
	String orderedPizza;
	boolean isPepperoniNeeded = false;
	boolean isCheeseNeeded = false;
	int pepperoniToppingPrice;
	int cheeseToppingPrice;
	int finalPrice;
	int i;

	Scanner sc = new Scanner(System.in);

	void pizzaPrice() {
	
		System.out.println("enter the pizza needed " + (Arrays.toString(cheesePizza)));
		orderedPizza = sc.next();
		for ( i = 0; i < cheesePizza.length; i++) {
			if (orderedPizza.equalsIgnoreCase(cheesePizza[i])) {
				System.out.println("Your "+cheesePizza[i] +" pizza price is " + pizzaPrice[i]);				
				System.out.println("Is additional pepperoni needed:true or false");
				isPepperoniNeeded = sc.nextBoolean();
				System.out.println("Is additional cheese needed:true or false");
				isCheeseNeeded = sc.nextBoolean();
				break;
				
			}
		}

		if (isCheeseNeeded)
		{
			cheeseToppingPrice = 1;
			System.out.println(" Price for cheese is " + cheeseToppingPrice);
		}
		
		
		if (isPepperoniNeeded)
		{
			if (orderedPizza.equals("small")) {
				pepperoniToppingPrice = 2;
				System.out.println(" Price for pepperoni is " + pepperoniToppingPrice);
			} else if (orderedPizza.equals("medium") || orderedPizza.equals("large")) {
				pepperoniToppingPrice = 3;
				System.out.println(" Price for pepperoni is " + pepperoniToppingPrice);
			}

		}
		
		
		

		finalPrice = pizzaPrice[i] + pepperoniToppingPrice + cheeseToppingPrice;
		System.out.println("Your final bill is " + finalPrice);
	}

}
