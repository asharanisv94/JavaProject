package primePackage;
import java.util.Scanner;
public class PrimeCheckMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrimeCheck pc=new PrimeCheck();
			 
		 System.out.print("Enter a positive integer to check PRIME : ");
		 pc.num = sc.nextInt();
		 pc.primeNumberCheck();

	}

}
