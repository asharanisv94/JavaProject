package switchCaseExample;

public class SwitchExample {
	
	int num1;
	int num2;

	void sumOfNumbers() {
		int sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
	}

	void differenceOfNumbers() {
		int difference = num1 - num2;
		System.out.println("Difference of " + num1 + " and " + num2 + " is " + difference);
	}

	void productOFNumbers() {
		int product = num1 * num2;
		System.out.println("Product of " + num1 + " and " + num2 + " is " + product);
	}

	void divisionOfNumbers() {
		int quotient = num1 / num2;
		System.out.println("Quotient of " + num1 + " and " + num2 + " is " + quotient);
		int remainder = num1 % num2;
		System.out.println("Remainder of the division operation of " + num1 + " and " + num2 + " is " + remainder);
	}
	void squareOfNumbers() {
		int square= num1 * num1;
		System.out.println("Square of " + num1 +  " is " + square);
	}
	void cubeOfNumbers() {
		int cube= num1 * num1*num1;
		System.out.println("Cube of " + num1 +  " is " + cube);

}
}