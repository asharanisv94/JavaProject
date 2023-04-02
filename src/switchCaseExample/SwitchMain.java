
package switchCaseExample;

import java.util.Scanner;

public class SwitchMain {

	public static void main(String[] args) {


	
		SwitchExample calculator = new SwitchExample();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation to perform: add, subtract, multiply, divide, square, cube");
		String operation = sc.next();
		System.out.println("Enter number1");
		calculator.num1 = sc.nextInt();
		System.out.println("Enter number2");
		calculator.num2 = sc.nextInt();

		switch (operation) {
		case "add":
			calculator.sumOfNumbers();
			break;
		case "subtract":
			calculator.differenceOfNumbers();
			break;
		case "multiply":
			calculator.productOFNumbers();
			break;
		case "divide":
			calculator.divisionOfNumbers();
			break;
		case "square":
			calculator.squareOfNumbers();

			calculator.num1=calculator.num2;
			calculator.squareOfNumbers();
			break;
		
		case "cube":
		calculator.cubeOfNumbers();
		
		calculator.num1=calculator.num2;
		calculator.cubeOfNumbers();
		break;

		default:
			System.out.println("Invalid Entry");
	    break;

	}
	}

}