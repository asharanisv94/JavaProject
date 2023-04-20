package pizzaParameterPackage;

import java.util.Arrays;
import java.util.Scanner;

public class PizzaBillMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] cheesePizza = { "small", "medium", "large" };
		int[] pizzaPrice = { 15, 20, 25 };
		PriceBill p = new PriceBill();
		System.out.println("enter the pizza needed " + (Arrays.toString(cheesePizza)));
		String orderedPizza = sc.next();
		p.pizzaBill(orderedPizza);
		p.isPepperoniNeeded(orderedPizza);
		p.isCheeseNeeded();
		p.finalbill();
	}

}
