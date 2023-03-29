package productPackage;

public class Discount {

	double price,finalPrice;
	String promoCode;
	double discount;

	void calculateDiscount() {
		discount = (price * 50) / 100;
		
		if (promoCode == "Promo5") {
			discount = (price * 50) / 100 + (price * 5) / 100;
		}
		
		 if (promoCode == "Promo10") {
			discount = (price * 50) / 100 + (price * 10) / 100;
		}
		
		 if (promoCode == "Promo20") {
			discount = (price * 50) / 100 + (price * 20) / 100;
		}
		
		System.out.println("Total price is " + price);
		System.out.println("Total Discount is " + discount);
		finalPrice=price-discount;
		System.out.println("Final price after discount is " +finalPrice);
	}

}
