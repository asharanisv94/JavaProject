package prodPackage;

public class FindDiscount {
double price,finalPrice;
	boolean Promo5,Promo10,Promo20;
	double discount;

	void calculateDiscount() 
	{
		discount = (price * 50) / 100;
		
		if (Promo5) 
		{
			discount = discount+ (price * 5) / 100;
		}
		
		else if (Promo10)
		{
			discount = discount + (price * 10) / 100;
		}
		
		else if (Promo20) 
		{
			discount = discount + (price * 20) / 100;
		}
		
		System.out.println("Total price is " + price);
		System.out.println("Total Discount is " + discount);
		finalPrice=price-discount;
		System.out.println("Final price after discount is " +finalPrice);
	}

}

