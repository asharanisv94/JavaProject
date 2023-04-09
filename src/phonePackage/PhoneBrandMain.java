package phonePackage;

import java.util.Scanner;

public class PhoneBrandMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		PhoneBrand p=new PhoneBrand();
		
    
		int i=1;
		do {
			System.out.println("Enter the  phone brand 1.SAMSUNG  2.GOOGLE  3.APPLE");
			
			p.phoneName=sc.next();
			p.selectPhone();
			
			System.out.println("Enter 0 to exit the program; Enter 1 to continue");
			i=sc.nextInt();
		}
	while(i!=0);
		
		

		
	
	}

}
