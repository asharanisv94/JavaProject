package primePackage;

public class PrimeCheck {
	int num;
	

	void primeNumberCheck() {
		boolean isPrime = true;
		if (num <= 1) 
		{
			isPrime = false;
		} 
		else 
		{
			int i = 2;
			while (i < num) {
				if (num % i == 0)
				{
					isPrime = false;
					
				}
			i++;
			}

		}
		
		if (isPrime) {
			System.out.println(num +" is a Prime Number");
		}else {
			System.out.println(num +" is not a Prime Number");
		}
	}
	
	
}
