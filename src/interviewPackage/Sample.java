package interviewPackage;

import java.util.*;

public class Sample {
	int i;
	int sum = 0;

	int[] numArray = new int[6];

	void getArray() {
		System.out.println("Enter the numbers");
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < numArray.length; i++) {
			numArray[i] = sc.nextInt();
		}

	}

	void sumIs8() {
		for (i = 0; i < numArray.length; i++) {
			int num = 2;
			if ((numArray[i] - num) == 0) {
				sum = sum + numArray[i];
			}}
		
		
				if (sum == 8) {
					System.out.println("the sum of all the 2's in the array is exactly 8");
				}
				 else
				 {
					System.out.println("the sum of all the 2's in the array is  not exactly 8");
			}
		}
	

}

