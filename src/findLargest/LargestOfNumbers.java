package findLargest;

public class LargestOfNumbers {
	int n1;
	int n2;
	int n3;
	int large;

	void findLargest() {
		if (n1 >= n2) {
			large = n1;
		} else {
			large = n2;
		}

		if (large >= n3) {
			System.out.println("Largest number is " + large);
		} else {
			large = n3;
			System.out.println("Largest number is " + large);
		}
		
	}

}
