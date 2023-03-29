package productPackage;

public class DiscountMain {

	public static void main(String[] args) {
		Discount disc= new Discount();
		disc.price=1000;
		
		disc.calculateDiscount();
		System.out.println("*************************");
	    disc.promoCode="Promo5";
		
		disc.calculateDiscount();
		System.out.println("*************************");
		disc.promoCode="Promo10";

		disc.calculateDiscount();
		System.out.println("**************************");
		disc.promoCode="Promo20";
		disc.calculateDiscount(); 
	}

}
