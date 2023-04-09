package arrayPackage;

import java.util.Arrays;
import java.util.Scanner;

public class DivisibleBy3And5 {
	int[] divisibleNumberArray = new int[10];
	int maxValue = 1000;

	void divisible() {

		int index = 0;

		for (int i = 1; i <= maxValue; i++) {
			
			{
				if (i % 3 == 0 && i % 5 == 0) {
					
					if (index < 10) {
						System.out.println(i);
						divisibleNumberArray[index] = i;
						index = index + 1;
					} else {
						break;
					}

				}
			}
		}
		System.out.println(Arrays.toString(divisibleNumberArray));

	}
}