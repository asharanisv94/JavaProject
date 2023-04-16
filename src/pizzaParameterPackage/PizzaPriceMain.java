package pizzaParameterPackage;

import java.util.Arrays;
import java.util.Scanner;

public class PizzaPriceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] cheesePizza = { "small", "medium", "large" };
		int[] pizzaPrice = { 15, 20, 25 };
		PizzaPrice p = new PizzaPrice();
		System.out.println("enter the pizza needed " + (Arrays.toString(cheesePizza)));
		String orderedPizza = sc.next();
		p.pizzaBill(orderedPizza);
		p.pepperoni(orderedPizza);
		p.cheese();
		p.finalbill();
	}

}
